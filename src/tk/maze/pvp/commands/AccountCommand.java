package tk.maze.pvp.commands;

import org.bukkit.OfflinePlayer;
import tk.maze.pvp.accutils.AccountUtils;
import tk.maze.pvp.bans.Config;
import org.bukkit.Bukkit;
import tk.maze.pvp.bans.API;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class AccountCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("account") || cmd.getName().equalsIgnoreCase("acc")) {
            if (args.length == 0) {
                p.sendMessage("§ACCOUNT: §7/account (jogador)§f!");
                API.sendSound(p, Sound.NOTE_PLING, 10);
                return true;
            }
            final Player acc = Bukkit.getPlayer(args[0]);
            if (acc == null) {
                final OfflinePlayer off = Bukkit.getOfflinePlayer(args[0]);
                if (Config.getConfig().getJogadores().get("Jogadores." + off.getUniqueId()) == null) {
                    API.sendMsg((CommandSender)p, "§b§lMAZE: §7O jogador §9§l" + off.getName() + "§7 nunca entrou no servidor!");
                    API.sendSound(p, Sound.NOTE_PLING, 10);
                    return true;
                }
                if (Config.getConfig().getJogadores().get("Jogadores." + off.getUniqueId()) != null) {
                    API.sendMsg((CommandSender)p, "               §6» §f§lACCOUNT §6«     ");
                    API.sendMsg((CommandSender)p, "");
                    API.sendMsg((CommandSender)p, "§6\u27a2 §ainforma\u00e7\u00f5es de: §6§l" + off.getName());
                    API.sendMsg((CommandSender)p, "  ");
                    API.sendMsg((CommandSender)p, "§7Rank: " + AccountUtils.getGrupo(off));
                    API.sendMsg((CommandSender)p, "§7Status: §c§lOFFLINE");
                    API.sendMsg((CommandSender)p, "§7Nickname: §7" + Config.getConfig().getJogadores().get("Jogadores." + off.getUniqueId() + ".Nome"));
                    API.sendMsg((CommandSender)p, "§7Coins: §7" + Config.getConfig().getJogadores().get("Jogadores." + off.getUniqueId() + ".Coins"));
                    API.sendMsg((CommandSender)p, "  ");
                }
            }
            if (acc != null) {
                API.sendMsg((CommandSender)p, "               §6» §f§lACCOUNT §6«     ");
                API.sendMsg((CommandSender)p, "");
                API.sendMsg((CommandSender)p, "§6\u27a2 §aConta de: §6§l" + acc.getName());
                API.sendMsg((CommandSender)p, "  ");
                API.sendMsg((CommandSender)p, "§7Ranking: " + AccountUtils.getGrupo((OfflinePlayer)acc));
                API.sendMsg((CommandSender)p, "§7Status: §a§lONLINE");
                API.sendMsg((CommandSender)p, "§7Nickname: §7" + Config.getConfig().getJogadores().get("Jogadores." + acc.getUniqueId() + ".Nome"));
                API.sendMsg((CommandSender)p, "§7Coins: §7" + Config.getConfig().getJogadores().get("Jogadores." + acc.getUniqueId() + ".Coins"));
                API.sendMsg((CommandSender)p, "  ");
            }
        }
        return false;
    }
}
