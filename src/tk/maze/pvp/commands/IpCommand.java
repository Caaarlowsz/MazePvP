package tk.maze.pvp.commands;

import tk.maze.pvp.bans.API;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class IpCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if ((cmd.getName().equalsIgnoreCase("ip") || cmd.getName().equalsIgnoreCase("servidor")) && args.length == 0) {
            API.sendMsg((CommandSender)p, "§b§lIP: §7Voc\u00ea est\u00e1 conectado ao: §blowerkits.desire.host ");
        }
        return false;
    }
}
