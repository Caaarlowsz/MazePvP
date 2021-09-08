package tk.maze.pvp.commands;

import tk.maze.pvp.API.ArraysAPI;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class InvisCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("invis")) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial")) {
                p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar este comando!");
                return true;
            }
            if (args.length == 0) {
                if (ArraysAPI.Admin.contains(p)) {
                    AdminCommand.setAdmin(p);
                    p.sendMessage("§b§lINVIS: §7Voc\u00ea est\u00e1 invis\u00edvel para todos os jogadores");
                    return true;
                }
                p.sendMessage("§b§lINVIS: §7Voc\u00ea s\u00f3 pode utilizar este comando quando no modo admin.");
                return true;
            }
        }
        return false;
    }
}
