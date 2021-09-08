package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class BcCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("bc")) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Gerente")) {
                p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§4§l/bc §4(mensagem)");
                return true;
            }
            if (args.length >= 1) {
                String bc = "";
                for (int i = 0; i < args.length; ++i) {
                    bc = String.valueOf(bc) + args[i] + " ";
                }
                Bukkit.broadcastMessage(" ");
                Bukkit.broadcastMessage("§4§lBROAD: §7" + bc.replace("&", "§"));
                Bukkit.broadcastMessage(" ");
                return true;
            }
        }
        return false;
    }
}
