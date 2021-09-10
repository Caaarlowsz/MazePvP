package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import tk.maze.pvp.API.API;
import tk.maze.pvp.conf.cfGrupo;
import tk.maze.pvp.invencivel.Prote\u00e7\u00e3o;

public class TpAllCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("tpall")) {
			if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Mod")) {
				p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar este comando!");
				return true;
			}
			if (args.length == 0) {
				Prote\u00e7\u00e3o.setImortal(p, false);
				p.sendMessage("§b§lTP: §7Voc\u00ea puxou todos os jogadores at\u00e9 voc\u00ea!");
				Bukkit.broadcastMessage("§b§lTP: §7O jogador §6§l" + p.getName() + "§f puxou todos os jogadores!");
				API.sendWarn("§7§o[" + p.getName() + " §7§opuxou todos os jogadores]");
				Player[] onlinePlayers;
				for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
					final Player todos = onlinePlayers[i];
					if (todos != p) {
						todos.teleport((Entity) p);
						Prote\u00e7\u00e3o.setImortal(p, false);
					}
				}
			}
		}
		return false;
	}
}
