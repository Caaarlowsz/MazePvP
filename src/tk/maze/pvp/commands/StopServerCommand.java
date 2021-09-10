package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.conf.cfGrupo;

public class StopServerCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("stopserver")) {
			if (!cfGrupo.ChecarGrupo(p, "Dono") || !p.isOp()) {
				p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
				return true;
			}
			Player[] onlinePlayers;
			for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
				final Player todos = onlinePlayers[i];
				todos.kickPlayer(
						"§b§lLower§f§lKits\n§c§lSERVIDOR FECHADO!\n    §7Podemos estar fechando por v\u00e1rios motivos,\n  §7mas com certeza estamos fazendo algo\n§7em fun\u00e7\u00e3o de sua jogatina.\n §7Esperamos a compreens\u00e3o de todos.\n§7[Att. §b§lLower§f§lKits§7]");
			}
			Bukkit.shutdown();
		}
		return false;
	}
}
