package tk.maze.pvp.commands;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.Bukkit;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class ChatCommand implements CommandExecutor, Listener
{
    public static boolean pausado;
    
    static {
        ChatCommand.pausado = false;
    }
    
    public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
        if (Cmd.getName().equalsIgnoreCase("chat")) {
            final Player p = (Player)Sender;
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+")) {
                p.sendMessage("�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
                return true;
            }
            if (Args.length == 0) {
                p.sendMessage("�b�lCHAT: �7Use: /chat <clear | on | off>");
                return true;
            }
            if (Args[0].equalsIgnoreCase("clear")) {
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("  ");
                Bukkit.getServer().broadcastMessage("�b�lCHAT: �7O chat do servidor foi limpo por: �3�l" + p.getName());
            }
            else if (Args[0].equalsIgnoreCase("off")) {
                Bukkit.getServer().broadcastMessage("�b�lCHAT: �7O chat do servidor foi �4�lDESATIVADO�f!");
                ChatCommand.pausado = true;
            }
            else if (Args[0].equalsIgnoreCase("on")) {
                Bukkit.getServer().broadcastMessage("�b�lCHAT: �7O chat do servidor foi �a�lATIVADO�f!");
                ChatCommand.pausado = false;
            }
        }
        return true;
    }
    
    @EventHandler
    public void onChat(final PlayerChatEvent e) {
        final Player p = e.getPlayer();
        if (ChatCommand.pausado && !cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Dono")) {
            e.setCancelled(true);
            p.sendMessage("�b�lCHAT: �7O chat est\u00e1 desativado!");
        }
    }
}
