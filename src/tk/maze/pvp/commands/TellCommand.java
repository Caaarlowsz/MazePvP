package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.ArrayList;
import org.bukkit.entity.Player;
import java.util.HashMap;
import org.bukkit.command.CommandExecutor;

public class TellCommand implements CommandExecutor
{
    public static HashMap<Player, Player> gettell;
    static ArrayList<Player> telloff;
    
    static {
        TellCommand.gettell = new HashMap<Player, Player>();
        TellCommand.telloff = new ArrayList<Player>();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (label.equalsIgnoreCase("tell")) {
            if (args.length == 0) {
                p.sendMessage("§b§lTELL: §7/tell <jogador> <mensagem>");
                p.sendMessage("§b§lTELL: §7/tell §c(on | off)");
                return true;
            }
            final Player target = Bukkit.getPlayer(args[0]);
            if (args[0].toLowerCase().equalsIgnoreCase("on")) {
                TellCommand.telloff.remove(p);
                p.sendMessage("§b§lTELL: §7Seu tell est\u00e1 ativado!");
            }
            else if (args[0].toLowerCase().equalsIgnoreCase("off")) {
                TellCommand.telloff.add(p);
                p.sendMessage("§b§lTELL: §7O seu tell est\u00e1 desativado!");
            }
            if (args.length > 1) {
                if (target == null) {
                    p.sendMessage("§b§lTELL: §7Jogador Offiline");
                    return true;
                }
                if (TellCommand.telloff.contains(target)) {
                    p.sendMessage("§b§lTELL: §7Este jogador est\u00e1 com o tell §c§lDESATIVADO§7. Tente novamente mais tarde.");
                    return true;
                }
                final StringBuilder sb = new StringBuilder();
                for (int i = 1; i < args.length; ++i) {
                    sb.append(args[i]).append(" ");
                }
                final String allArgs = sb.toString().trim();
                p.sendMessage("[§7Voce §f> §7" + target.getDisplayName() + "§7] " + allArgs);
                target.sendMessage("§7[§7" + p.getName() + " §f> §7Voc\u00ea §7] " + allArgs);
                TellCommand.gettell.put(p, target);
                TellCommand.gettell.put(target, p);
            }
        }
        else if (label.equalsIgnoreCase("off")) {
            if (args.length == 0) {
                p.sendMessage("§7fale com o player no chat normal");
                return true;
            }
            if (!TellCommand.gettell.containsKey(p)) {
                p.sendMessage("§b§lTELL: §7Voc\u00ea n\u00e3o tem ninguem para responder");
                return true;
            }
            final Player deslogo = TellCommand.gettell.get(p);
            if (deslogo == null) {
                p.sendMessage("§cJogador Offiline");
                return true;
            }
            if (TellCommand.telloff.contains(deslogo)) {
                p.sendMessage("§7Este jogador est\u00e1 com o tell §c§lDESATIVADO§7. Tente novamente mais tarde.");
                return true;
            }
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < args.length; ++i) {
                sb.append(args[i]).append(" ");
            }
            final String allArgs = sb.toString().trim();
            p.sendMessage("§7[§a§lVoc\u00ea §b» §a§l" + deslogo.getDisplayName() + "§7]§f: " + allArgs);
            deslogo.sendMessage("§7[§a" + p.getDisplayName() + " §f--> §aEu§7]§f: " + allArgs);
        }
        return false;
    }
}
