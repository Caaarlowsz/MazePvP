package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class KickAllCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (!cmd.getName().equalsIgnoreCase("kickall")) {
            return false;
        }
        if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Admin")) {
            p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar este comando!");
            return true;
        }
        Player[] onlinePlayers;
        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
            final Player todos = onlinePlayers[i];
            if (!cfGrupo.ChecarGrupo(todos, "Dono") && !cfGrupo.ChecarGrupo(todos, "Gerente") && todos != p && !todos.isOp()) {
                todos.kickPlayer("§e§lKICKALL\n§7Todos os jogadores foram \n kickados do servidor pelo §6§l" + p.getName() + "§7.");
            }
        }
        p.sendMessage("§b§lKICKALL: §7Voc\u00ea kickou todos os jogadores do servidor!");
        Bukkit.broadcastMessage("§b§lKICKALL: §7Todos os jogadores foram KIKADOS.");
        return true;
    }
}
