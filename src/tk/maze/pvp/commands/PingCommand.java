package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (cmd.getName().equalsIgnoreCase("ping") && sender instanceof Player) {
			final Player p = (Player) sender;
			final int ping = ((CraftPlayer) p).getHandle().ping;
			if (args.length == 0) {
				p.sendMessage("§aSeu ping \u00e9: §a" + ping + "§ams");
				return true;
			}
			if (args.length == 1) {
				final Player k = Bukkit.getPlayer(args[0]);
				if (k == null) {
					p.sendMessage("Jogador offline!");
					return true;
				}
				final int ping2 = ((CraftPlayer) k).getHandle().ping;
				p.sendMessage("§aO ping de " + k.getName() + "§a\u00e9 de " + ping2 + "§ams.");
				return true;
			}
		}
		return false;
	}
}
