package tk.maze.pvp.events;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.spigotmc.ProtocolInjector;

import net.minecraft.server.v1_7_R4.ChatSerializer;
import net.minecraft.server.v1_7_R4.IChatBaseComponent;
import net.minecraft.server.v1_7_R4.Packet;
import net.minecraft.server.v1_7_R4.PlayerConnection;
import tk.maze.pvp.Main;
import tk.maze.pvp.check.CheckUtils;
import tk.maze.pvp.conf.cfStatus;

public class eTab implements Listener {
	private static int VERSION;

	static {
		eTab.VERSION = 47;
	}

	@EventHandler
	void TabDoServidor(final PlayerJoinEvent evento) {
		final Player jogador = evento.getPlayer();
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				final PlayerConnection connect = ((CraftPlayer) jogador).getHandle().playerConnection;
				final IChatBaseComponent top = ChatSerializer.a(
						"{'extra': [{text: '', color: 'aqua'}],'color': gold, 'text': '        §b§lBROWK§f§lPVP             '}");
				final IChatBaseComponent bottom = ChatSerializer
						.a("{'extra': [{'color': 'aqua', 'text': ' \n      §7Kills: §b" + cfStatus.getKills(jogador)
								+ "  §f-  §7Deaths: §b" + cfStatus.getDeaths(jogador) + "§f  -  §7KillStreak: §b"
								+ cfStatus.getKillStreak(jogador) + "\n" + "§7Grupo: " + CheckUtils.Grupo(jogador)
								+ "  §f-  §7Ping: §b" + ((CraftPlayer) jogador).getHandle().ping + "  §f-  §7XP: §b"
								+ cfStatus.getMoney(jogador) + "\n"
								+ "', 'underline': 'true'}], 'color': 'gold', 'text': ''}");
				if (((CraftPlayer) jogador).getHandle().playerConnection.networkManager.getVersion() < eTab.VERSION) {
					return;
				}
				connect.sendPacket((Packet) new ProtocolInjector.PacketTabHeader(top, bottom));
			}
		}, 1L, 20L);
	}
}
