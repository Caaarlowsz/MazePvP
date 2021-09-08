package tk.maze.pvp.commands;

import tk.maze.pvp.bans.API;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.Bukkit;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import java.util.ArrayList;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class ScCommand implements Listener, CommandExecutor
{
    public static ArrayList<String> staff;
    
    static {
        ScCommand.staff = new ArrayList<String>();
    }
    
    @EventHandler
    public void onChat(final AsyncPlayerChatEvent e) {
        final Player p = e.getPlayer();
        Player[] onlinePlayers;
        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
            final Player online = onlinePlayers[i];
            if (this.isStaffChatting(p)) {
                e.setCancelled(true);
                if (cfGrupo.ChecarGrupo(online, "Dono") || cfGrupo.ChecarGrupo(online, "Gerente") || cfGrupo.ChecarGrupo(online, "Gc") || cfGrupo.ChecarGrupo(online, "Admin") || cfGrupo.ChecarGrupo(online, "Mod+") || cfGrupo.ChecarGrupo(online, "Mod") || cfGrupo.ChecarGrupo(online, "Trial") || cfGrupo.ChecarGrupo(online, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Helper") || this.isStaffChatting(online)) {
                    online.sendMessage("§7[§cSC§7] " + p.getDisplayName() + " §6\u279f §f" + e.getMessage());
                }
            }
        }
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("sc")) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                API.sendMsg((CommandSender)p, "§4§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
                return true;
            }
            if (this.isStaffChatting(p)) {
                ScCommand.staff.remove(p.getName());
                p.sendMessage("§7[§6StaffChat§7] §cVoc\u00ea saiu do chat da staff.");
                tk.maze.pvp.API.API.sendWarn("§7§o[" + p.getName() + " saiu do STAFFCHAT§7§o]");
            }
            else {
                ScCommand.staff.add(p.getName());
                p.sendMessage("§7[§6StaffChat§7] §aVoc\u00ea entrou no chat da staff.");
                tk.maze.pvp.API.API.sendWarn("§7§o[" + p.getName() + " entrou no STAFFCHAT§7§o]");
            }
        }
        return true;
    }
    
    public boolean isStaffChatting(final Player player) {
        return ScCommand.staff.contains(player.getName());
    }
}
