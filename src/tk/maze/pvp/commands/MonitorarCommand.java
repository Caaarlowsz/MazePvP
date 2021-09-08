package tk.maze.pvp.commands;

import tk.maze.pvp.API.ArraysAPI;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class MonitorarCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("monitorar")) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Admin")) {
                p.sendMessage("§cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar este comando.");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§cUso correto: /monitorar <on | off>.");
                return true;
            }
            if (args[0].equalsIgnoreCase("on")) {
                ArraysAPI.Monitor.add(p);
                p.sendMessage("§aModo monitorar ativado.");
                return true;
            }
            if (args[0].equalsIgnoreCase("off")) {
                ArraysAPI.Monitor.remove(p);
                p.sendMessage("§cModo monitorar desativado.");
                return true;
            }
        }
        return false;
    }
}
