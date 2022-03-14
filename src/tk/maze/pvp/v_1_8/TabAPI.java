package tk.maze.pvp.v_1_8;

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
import com.github.caaarlowsz.mazemc.kitpvp.MazePvP;

public class TabAPI implements Listener {
	private static int VERSION;

	static {
		TabAPI.VERSION = 47;
	}

	@EventHandler
	void TabDoServidor(final PlayerJoinEvent evento) {
		final Player jogador = evento.getPlayer();
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MazePvP.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				final PlayerConnection connect = ((CraftPlayer) jogador).getHandle().playerConnection;
				final IChatBaseComponent top = ChatSerializer.a(
						"{'extra': [{text: '', color: 'aqua'}],'color': gold, 'text': '              �b�lLower�f�lKits             '}");
				final IChatBaseComponent bottom = ChatSerializer.a(
						"{'extra': [{'color': 'aqua', 'text': '  \n�6�lINFORMA\u00c7\u00d5ES  \n        �7Loja do servidor: �7[EM BREVE] \n�7Em breve Twitter do servidor ', 'underline': 'true'}], 'color': 'gold', 'text': ''}");
				if (((CraftPlayer) jogador).getHandle().playerConnection.networkManager.getVersion() < TabAPI.VERSION) {
					return;
				}
				connect.sendPacket((Packet) new ProtocolInjector.PacketTabHeader(top, bottom));
			}
		}, 1L, 20L);
	}
}
