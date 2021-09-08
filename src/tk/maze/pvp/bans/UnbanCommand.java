package tk.maze.pvp.bans;

import org.bukkit.Bukkit;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandExecutor;

public class UnbanCommand implements CommandExecutor
{
    private static String ip(final OfflinePlayer vitima) {
        return (String)Config.getConfig().getIpBans().get("IPBans." + vitima.getUniqueId() + ".IP do Jogador");
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player jogador = (Player)sender;
        if (!cmd.getName().equalsIgnoreCase("unban")) {
            return false;
        }
        if (!cfGrupo.ChecarGrupo(jogador, "Dono") && !cfGrupo.ChecarGrupo(jogador, "Gerente") && !cfGrupo.ChecarGrupo(jogador, "Admin") && !cfGrupo.ChecarGrupo(jogador, "Mod+") && !cfGrupo.ChecarGrupo(jogador, "Mod") && !cfGrupo.ChecarGrupo(jogador, "Trial") && !cfGrupo.ChecarGrupo(jogador, "Youtuber+")) {
            API.sendMsg((CommandSender)jogador, "�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar este comando!");
            return true;
        }
        if (args.length == 0) {
            API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Utilize /unban (Ban , Ipban , Tempban , Mute , Tempmute) (jogador)");
            return true;
        }
        if (args[0].equalsIgnoreCase("ban")) {
            if (args.length == 1) {
                API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Utilize �6�l/unban �6(Ban , Ipban , Tempban , Mute , Tempmute) (jogador)");
                return true;
            }
            final OfflinePlayer vitima = Bukkit.getOfflinePlayer(args[1]);
            if (Config.getConfig().getBans().get("Bans." + vitima.getUniqueId()) == null) {
                API.sendMsg((CommandSender)jogador, "�fO jogador �6�l" + vitima.getName() + " �fn\u00e3o est\u00e1 �4�lBANIDO�f! ");
                return true;
            }
            if (!(sender instanceof Player)) {
                API.sendStaff("�b�lUNBAN: �7" + vitima.getName() + " �7foi �6�DESBANIDO �fpor: �c�lCONSOLE");
            }
            else {
                API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Voc\u00ea desbaniu o jogador: �6�l" + vitima.getName());
                API.sendStaff("�b�lUNBAN: �7" + jogador.getName() + " desbaniu o jogador: �6�l" + vitima.getName());
            }
            final double l = Config.getConfig().getBans().getDouble("Players Banidos");
            Config.getConfig().getBans().set("Players Banidos", (Object)(l - 1.0));
            Config.getConfig().getBans().set("Bans." + vitima.getUniqueId(), (Object)null);
            Config.getConfig().saveBans();
            return true;
        }
        else if (args[0].equalsIgnoreCase("ipban")) {
            if (args.length == 1) {
                API.sendMsg(sender, "�b�lUNBAN: �7Utilize �2�l/unban �2ipban (jogador)");
                return true;
            }
            final OfflinePlayer vitima = Bukkit.getOfflinePlayer(args[1]);
            if (Config.getConfig().getIpBans().get("IPBans." + vitima.getUniqueId()) == null) {
                API.sendMsg((CommandSender)jogador, "�fO jogador �6�l" + vitima.getName() + " �fn\u00e3o est\u00e1 �4�lBANIDO�f!");
                return true;
            }
            if (!(sender instanceof Player)) {
                API.sendStaff("�b�lUNBAN: �7" + vitima.getName() + " �ffoi �6�lDESBANIDO �fpor: �c�lCONSOLE");
            }
            else {
                API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Voc\u00ea desbaniu o jogador �6�l" + vitima.getName());
                API.sendStaff("�b�lUNBAN: �7" + jogador.getName() + " desbaniu o jogador " + vitima.getName());
            }
            Bukkit.unbanIP(ip(vitima));
            Config.getConfig().getIpBans().set("IPBans." + vitima.getUniqueId(), (Object)null);
            Config.getConfig().saveIpBans();
            return true;
        }
        else if (args[0].equalsIgnoreCase("tempban")) {
            if (args.length == 1) {
                API.sendMsg(sender, "�b�lUNBAN: �7Utilize �3�l/unban �3tempban (jogador)");
                return true;
            }
            final OfflinePlayer vitima = Bukkit.getOfflinePlayer(args[1]);
            if (Config.getConfig().getTempBans().get("TempBans." + vitima.getUniqueId()) == null) {
                API.sendMsg(sender, "�7O jogador �6�l" + vitima.getName() + " �7n\u00e3o est\u00e1 �4�lBANIDO�f!");
                return true;
            }
            if (!(sender instanceof Player)) {
                API.sendStaff("�b�lUNBAN: �7" + vitima.getName() + " �7foi desbanido por: �c�lCONSOLE");
            }
            else {
                API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Voc\u00ea desbaniu o jogador: �6�l" + vitima.getName());
                API.sendStaff("�b�lUNBAN: �7" + jogador.getName() + " �fdesbaniu o jogador: �6�l" + vitima.getName());
            }
            Config.getConfig().getTempBans().set("TempBans." + vitima.getUniqueId(), (Object)null);
            Config.getConfig().saveTempBans();
            return true;
        }
        else if (args[0].equalsIgnoreCase("mute")) {
            if (args.length == 1) {
                API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Utilize �9�l/unban �9mute (jogador)");
                return true;
            }
            final Player vitima2 = Bukkit.getPlayer(args[1]);
            if (vitima2 == null) {
                final OfflinePlayer vitimaoff = Bukkit.getOfflinePlayer(args[1]);
                if (Config.getConfig().getMute().get("Mute." + vitimaoff.getUniqueId()) == null) {
                    API.sendMsg((CommandSender)jogador, "�fO jogador �6�l" + vitimaoff.getName() + "�f n\u00e3o est\u00e1 �9�lMUTADO�f!");
                    return true;
                }
                if (!(sender instanceof Player)) {
                    API.sendStaff("�b�lUNBAN: �7CONSOLE desmutou o jogador: �6�l" + vitimaoff.getName());
                }
                else {
                    API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Voc\u00ea desmutou o jogador: �6�l" + vitimaoff.getName());
                    API.sendStaff("�b�lUNBAN: �7" + jogador.getName() + " desmutou o jogador: �c�" + vitimaoff.getName());
                }
                Config.getConfig().getMute().set("Mute." + vitimaoff.getUniqueId(), (Object)null);
                Config.getConfig().saveMute();
                return true;
            }
            else {
                if (Config.getConfig().getMute().get("Mute." + vitima2.getUniqueId()) == null) {
                    API.sendMsg((CommandSender)jogador, "�fO jogador �6�l" + vitima2.getName() + "�f n\u00e3o est\u00e1 �9�lMUTADO�f!");
                    return true;
                }
                if (!(sender instanceof Player)) {
                    API.sendStaff("�cCONSOLE desmutou " + vitima2.getName());
                }
                else {
                    API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Voc\u00ea desmutou o jogador: �c�l" + vitima2.getName());
                    API.sendStaff("�b�lUNBAN: �7" + jogador.getName() + " desmutou o jogador: �c�l" + vitima2.getName());
                }
                Config.getConfig().getMute().set("Mute." + vitima2.getUniqueId(), (Object)null);
                Config.getConfig().saveMute();
                return true;
            }
        }
        else {
            if (!args[0].equalsIgnoreCase("tempmute")) {
                API.sendMsg(sender, "�b�lUNBAN: �7Utilize /unban �6(Ban , Ipban , Tempban , Mute , Tempmute) <jogador>");
                return true;
            }
            if (args.length == 1) {
                API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Utilize �b/unban �btempmute (jogador)");
                return true;
            }
            final Player vitima2 = Bukkit.getPlayer(args[1]);
            if (vitima2 == null) {
                final OfflinePlayer vitimaoff = Bukkit.getOfflinePlayer(args[1]);
                if (Config.getConfig().getTempMute().get("TempMute." + vitimaoff.getUniqueId()) == null) {
                    API.sendMsg((CommandSender)jogador, "�fO jogador �6�l" + vitimaoff.getName() + "�f n\u00e3o est\u00e1 �4�lMUTADO�f! ");
                    return true;
                }
                if (!(sender instanceof Player)) {
                    API.sendStaff("�b�lUNBAN: �7CONSOLE desmutou o jogador: �c�l" + vitimaoff.getName());
                }
                else {
                    API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Voc\u00ea desmutou o jogador: �c�l" + vitimaoff.getName());
                    API.sendStaff("�b�lUNBAN: �7" + jogador.getName() + " desmutou o jogador: �c�l" + vitimaoff.getName());
                }
                Config.getConfig().getTempMute().set("TempMute." + vitimaoff.getUniqueId(), (Object)null);
                Config.getConfig().saveTempMute();
                return true;
            }
            else {
                if (Config.getConfig().getTempMute().get("TempMute." + vitima2.getUniqueId()) == null) {
                    API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7O jogador �6�l" + vitima2.getName() + "�f n\u00e3o est\u00e1 �4�lMUTADO�f!");
                    return true;
                }
                if (!(sender instanceof Player)) {
                    API.sendStaff("�b�lUNBAN: �7CONSOLE desmutou o jogador: �c�l" + vitima2.getName());
                }
                else {
                    API.sendMsg((CommandSender)jogador, "�b�lUNBAN: �7Voc\u00ea desmutou o jogador: �c�l" + vitima2.getName());
                    API.sendStaff("�b�lUNBAN: �7" + jogador.getName() + " desmutou o jogador: �c�l" + vitima2.getName());
                }
                Config.getConfig().getTempMute().set("TempMute." + vitima2.getUniqueId(), (Object)null);
                Config.getConfig().saveTempMute();
                return true;
            }
        }
    }
}
