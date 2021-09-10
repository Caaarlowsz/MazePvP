package tk.maze.pvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.bans.API;

public class LojaCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if ((cmd.getName().equalsIgnoreCase("loja") || cmd.getName().equalsIgnoreCase("store")) && args.length == 0) {
			API.sendMsg((CommandSender) p, " ");
			API.sendMsg((CommandSender) p,
					"§b§lLower§f§lMC: §7Compre pacotes de §a§lVIP §fou §6§lKITS §facessando: §bSITE EM BREVE!");
		}
		return false;
	}
}
