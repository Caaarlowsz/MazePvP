package tk.maze.pvp.commands;

import tk.maze.pvp.bans.API;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class AplicarCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if ((cmd.getName().equalsIgnoreCase("aplicar") || cmd.getName().equalsIgnoreCase("virarstaff")) && args.length == 0) {
            API.sendMsg((CommandSender)p, "            §6» §f§lAPLICAR §6«              ");
            API.sendMsg((CommandSender)p, " ");
            API.sendMsg((CommandSender)p, "§6\u2022 §f§5§lTRIAL : §7Sem vagas !");
            API.sendMsg((CommandSender)p, "§6\u2022 §f§9§lAJUDANTE : §7https://goo.gl/3ap9Sh !");
            API.sendMsg((CommandSender)p, "§6\u2022 §f§2§lBUILDER : §7https://goo.gl/forms/sSb3lWbz4g7QVh2U2 !");
            API.sendMsg((CommandSender)p, "§6\u2022 §fA§6§lHRC : §7Sem vagas !");
            API.sendMsg((CommandSender)p, "");
        }
        return false;
    }
}
