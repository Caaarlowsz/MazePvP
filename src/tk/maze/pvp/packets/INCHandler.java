package tk.maze.pvp.packets;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;

import net.minecraft.util.io.netty.channel.Channel;
import net.minecraft.util.io.netty.channel.ChannelDuplexHandler;
import net.minecraft.util.io.netty.channel.ChannelHandlerContext;
import net.minecraft.util.io.netty.channel.ChannelPromise;
import tk.maze.pvp.Main;

public class INCHandler implements Handler {
	private static Class<?> entityPlayer;
	private static Class<?> playerConnection;
	private static Class<?> networkManager;
	private static Field channelField;
	private static Field network;
	private static Field connection;
	private static Class<?> packet;

	static {
		INCHandler.entityPlayer = NMSUtils.getNMSClass("EntityPlayer");
		INCHandler.playerConnection = NMSUtils.getNMSClass("PlayerConnection");
		INCHandler.networkManager = NMSUtils.getNMSClass("NetworkManager");
		INCHandler.channelField = getChannelField();
		INCHandler.network = NMSUtils.getField(INCHandler.playerConnection, "networkManager");
		INCHandler.connection = NMSUtils.getField(INCHandler.entityPlayer, "playerConnection");
		INCHandler.packet = NMSUtils.getNMSClass("Packet");
	}

	private static Field getChannelField() {
		Field channelField = null;
		try {
			channelField = NMSUtils.getFirstFieldOfTypeWithException(INCHandler.networkManager, Channel.class);
		} catch (Exception e) {
			System.out.print("Channel class not found");
		}
		if (channelField != null) {
			channelField.setAccessible(true);
		}
		return channelField;
	}

	@Override
	public void addChannel(final Player player) {
		try {
			final Object handle = NMSUtils.getHandle(player);
			final Object connection = INCHandler.connection.get(handle);
			final Channel channel = (Channel) INCHandler.channelField.get(INCHandler.network.get(connection));
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						channel.pipeline().addBefore("packet_handler", "packet_listener_player",
								(net.minecraft.util.io.netty.channel.ChannelHandler) new ChannelHandler(player));
					} catch (Exception ex) {
					}
				}
			}, "PacketListenerAPI channel adder (" + player.getName() + ")").start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeChannel(final Player player) {
		try {
			final Object handle = NMSUtils.getHandle(player);
			final Object connection = INCHandler.connection.get(handle);
			final Channel channel = (Channel) INCHandler.channelField.get(INCHandler.network.get(connection));
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						channel.pipeline().remove("packet_listener_player");
					} catch (Exception ex) {
					}
				}
			}, "PacketListenerAPI channel remover (" + player.getName() + ")").start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addServerConnectionChannel() {
		try {
			final Server server = Bukkit.getServer();
			final Object dedicatedserver = NMSUtils.getMethod(server.getClass(), "getServer", (Class<?>[]) new Class[0])
					.invoke(server, new Object[0]);
			final Class<?> serverconnectionclass = NMSUtils.getNMSClass("ServerConnection");
			final Object serverconnection = NMSUtils
					.getFirstFieldOfType(NMSUtils.getNMSClass("MinecraftServer"), serverconnectionclass)
					.get(dedicatedserver);
			final Field f = NMSUtils.getLastFieldOfType(serverconnectionclass, List.class);
			final List<?> currentlist = (List<?>) f.get(serverconnection);
			final Field f2 = NMSUtils.getField(currentlist.getClass().getSuperclass(), "list");
			final Object list = f2.get(currentlist);
			if (list.getClass().equals(ListenerList.class)) {
				return;
			}
			final List<Object> newlist = Collections.synchronizedList(new ListenerList<Object>());
			for (final Object o : currentlist) {
				newlist.add(o);
			}
			f.set(serverconnection, newlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class ListenerList<E> extends ArrayList<E> {
		private static final long serialVersionUID = -7891458351187850007L;

		@Override
		public boolean add(final E paramE) {
			try {
				final E a = paramE;
				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							Channel channel;
							for (channel = null; channel == null; channel = (Channel) INCHandler.channelField.get(a)) {
							}
							if (channel.pipeline().get("packet_listener_server") == null) {
								channel.pipeline().addBefore("packet_handler", "packet_listener_server",
										(net.minecraft.util.io.netty.channel.ChannelHandler) new ChannelHandler(null));
							}
						} catch (Exception ex) {
						}
					}
				}, "PacketListenerAPI channel adder (server)").start();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return super.add(paramE);
		}

		@Override
		public boolean remove(final Object arg0) {
			try {
				final Object a = arg0;
				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							Channel channel;
							for (channel = null; channel == null; channel = (Channel) INCHandler.channelField.get(a)) {
							}
							channel.pipeline().remove("packet_listener_server");
						} catch (Exception ex) {
						}
					}
				}, "PacketListenerAPI channel remover (server)").start();
			} catch (Exception ex) {
			}
			return super.remove(arg0);
		}
	}

	class ChannelHandler extends ChannelDuplexHandler {
		private Player player;

		public ChannelHandler(final Player p) {
			this.player = p;
		}

		public void write(final ChannelHandlerContext ctx, final Object msg, final ChannelPromise promise)
				throws Exception {
			final Cancellable cancellable = new Cancellable();
			Object pckt = msg;
			if (INCHandler.packet.isAssignableFrom(msg.getClass())) {
				pckt = ((Main) Main.getPlugin()).onPacketSend(this.player, msg, cancellable);
			}
			if (cancellable.isCancelled()) {
				return;
			}
			super.write(ctx, pckt, promise);
		}

		public void channelRead(final ChannelHandlerContext ctx, final Object msg) throws Exception {
			final Cancellable cancellable = new Cancellable();
			Object pckt = msg;
			if (INCHandler.packet.isAssignableFrom(msg.getClass())) {
				pckt = ((Main) Main.getPlugin()).onPacketReceive(this.player, msg, cancellable);
			}
			if (cancellable.isCancelled()) {
				return;
			}
			super.channelRead(ctx, pckt);
		}

		public String toString() {
			return "ChannelHandler (" + this.player + ")";
		}
	}
}
