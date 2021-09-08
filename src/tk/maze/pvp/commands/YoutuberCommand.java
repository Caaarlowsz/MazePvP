package tk.maze.pvp.commands;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class YoutuberCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
        final Player p = (Player)Sender;
        if (Cmd.getName().equalsIgnoreCase("youtuber")) {
            p.sendMessage("               §6» §f§lYOUTUBER §6«     ");
            p.sendMessage("");
            p.sendMessage("§3§lYT+ : §7 Sera necessario 120 likes + 800 view !");
            p.sendMessage("§b§lYT : §7 Sera necessario 70 likes + 500 view !");
            p.sendMessage("§e§lSemiYT : §7 Sera necessario 40 likes + 300 view !");
            p.sendMessage("");
        }
        return false;
    }
}
