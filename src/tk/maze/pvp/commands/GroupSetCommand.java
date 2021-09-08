package tk.maze.pvp.commands;

import org.bukkit.OfflinePlayer;
import tk.maze.pvp.scoreboard.sScoreAPI;
import tk.maze.pvp.events.CorGrupo;
import tk.maze.pvp.v_1_8.TituloAPI;
import tk.maze.pvp.conf.cfConfig;
import org.bukkit.Bukkit;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class GroupSetCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
        if (Cmd.getName().equalsIgnoreCase("groupset") && Sender instanceof Player) {
            final Player p = (Player)Sender;
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Gerente")) {
                p.sendMessage("�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para manipular grupos.");
                return true;
            }
            if (Args.length == 0) {
                p.sendMessage("�3�lGROUPSET �b�l/groupset �f(jogador) (grupo)");
                return true;
            }
            final Player target = Bukkit.getPlayerExact(Args[0]);
            if (target == null) {
                final OfflinePlayer targetoff = Bukkit.getOfflinePlayer(Args[0]);
                if (Args.length == 1) {
                    p.sendMessage("�3�lGROUPSET �fUse �b�l/groupset �7(nickname) (grupo)");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("membro")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �7�lMEMBRO");
                    cfGrupo.setarGrupo(targetoff, "Membro");
                    cfGrupo.salvarconfiguracao();
                    cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".Silent", (Object)"OFF");
                    cfConfig.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("light")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �a�lLIGHT");
                    cfGrupo.setarGrupo(targetoff, "Light");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("premium")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �1�lBETA");
                    cfGrupo.setarGrupo(targetoff, "premium");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("semiyt")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �d�lSEMIYT");
                    cfGrupo.setarGrupo(targetoff, "S-Pro");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("ultima")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �d�lULTIMATE");
                    cfGrupo.setarGrupo(targetoff, "Pro");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("youtuber")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �b�lYOUTUBER");
                    cfGrupo.setarGrupo(targetoff, "Youtuber");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("youtuber+")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �3�lYOUTUBER+");
                    cfGrupo.setarGrupo(targetoff, "Youtuber+");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("ajudante")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �9�lAJUDANTE");
                    cfGrupo.setarGrupo(targetoff, "Helper");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("builder")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �2�lBUILDER");
                    cfGrupo.setarGrupo(targetoff, "Builder");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("builder+")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �2�lBUILDER+");
                    cfGrupo.setarGrupo(targetoff, "Builder+");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("gc")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �1�lGCDETECTOR");
                    cfGrupo.setarGrupo(targetoff, "gc");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("trial")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �5�lTRIAL");
                    cfGrupo.setarGrupo(targetoff, "Trial");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("mod")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �5�lMOD");
                    cfGrupo.setarGrupo(targetoff, "Mod");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("mod+")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �5�lMOD+");
                    cfGrupo.setarGrupo(targetoff, "Mod+");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("admin")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �c�lADMIN");
                    cfGrupo.setarGrupo(targetoff, "Admin");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("gerente")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �c�lGERENTE");
                    cfGrupo.setarGrupo(targetoff, "Gerente");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("dono")) {
                    p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff.getName() + " �7para: �4�lDONO");
                    cfGrupo.setarGrupo(targetoff, "Dono");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                p.sendMessage("�eEsse grupo n\u00e3o existe!");
            }
            if (Args.length == 1) {
                p.sendMessage("�3�lGROUPSET �b�l/groupset �7(nickname) (grupo)");
                return true;
            }
            if (Args[1].equalsIgnoreCase("membro")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �7�lMEMBRO");
                target.sendMessage("�eO seu grupo foi alterado para Membro!");
                cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + target.getUniqueId() + ".Silent", (Object)"OFF");
                cfConfig.salvarconfiguracao();
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �7�lMEMBRO");
                cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + target.getUniqueId() + ".Silent", (Object)"OFF");
                cfConfig.salvarconfiguracao();
                cfGrupo.setarGrupo(target, "Membro");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag normal");
                return true;
            }
            if (Args[1].equalsIgnoreCase("light")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �a�lLIGHT");
                target.sendMessage("�eO seu grupo foi alterado para light!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �a�lLIGHT");
                cfGrupo.setarGrupo(target, "Light");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag light");
                return true;
            }
            if (Args[1].equalsIgnoreCase("premium")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �1�lBETA");
                target.sendMessage("�eO seu grupo foi alterado para BETA!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �1�lBETA");
                cfGrupo.setarGrupo(target, "Mvp");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag beta");
                return true;
            }
            if (Args[1].equalsIgnoreCase("semiyt")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �e�lSEMIYT");
                target.sendMessage("�eO seu grupo foi alterado para SemiPro!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �e�lSEMIYT");
                cfGrupo.setarGrupo(target, "S-Pro");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag semipro");
                return true;
            }
            if (Args[1].equalsIgnoreCase("ultimate")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �d�lULTIMATE");
                target.sendMessage("�eO seu grupo foi alterado para Pro!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �d�lULTIMATE");
                cfGrupo.setarGrupo(target, "Pro");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag ultimate");
                return true;
            }
            if (Args[1].equalsIgnoreCase("youtuber")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �b�lYOUTUBER");
                target.sendMessage("�eO seu grupo foi alterado para Youtuber!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �b�lYOUTUBER");
                cfGrupo.setarGrupo(target, "Youtuber");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag youtuber");
                return true;
            }
            if (Args[1].equalsIgnoreCase("youtuber+")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �3�lYOUTUBER+");
                target.sendMessage("�eO seu grupo foi alterado para Youtuberplus");
                TituloAPI.MandarTitulo(target, "�a�lGROUP");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �3�lYOUTUBER+");
                cfGrupo.setarGrupo(target, "Youtuber+");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag youtuber+");
                return true;
            }
            if (Args[1].equalsIgnoreCase("builder")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �2�lBUILDER");
                target.sendMessage("�eO seu grupo foi alterado para Builder!");
                TituloAPI.MandarTitulo(target, "�a�lGROUP");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �2�lBUILDER");
                cfGrupo.setarGrupo(target, "Builder");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag builder");
                return true;
            }
            if (Args[1].equalsIgnoreCase("builder+")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �2�lBUILDER+");
                target.sendMessage("�eO seu grupo foi alterado para Admin!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �2�lBUILDER+");
                cfGrupo.setarGrupo(target, "Admin");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag builder+");
                return true;
            }
            if (Args[1].equalsIgnoreCase("ajudante")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �9�lAJUDANTE");
                target.sendMessage("�eO seu grupo foi alterado para Helper!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �9�lAJUDANTE");
                cfGrupo.setarGrupo(target, "Ajudante");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag ajudante");
                return true;
            }
            if (Args[1].equalsIgnoreCase("gc")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �1�lGCDETECTOR");
                target.sendMessage("�eO seu grupo foi alterado para Helper!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �1�lGCDETECTOR");
                cfGrupo.setarGrupo(target, "Gc");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag gc");
                return true;
            }
            if (Args[1].equalsIgnoreCase("trial")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �5�lTRIAL");
                target.sendMessage("�eO seu grupo foi alterado para Trial!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �5�lTRIAL");
                cfGrupo.setarGrupo(target, "Trial");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag trial");
                return true;
            }
            if (Args[1].equalsIgnoreCase("mod")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �5�lMOD");
                target.sendMessage("�eO seu grupo foi alterado para Mod!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �5�lMOD");
                cfGrupo.setarGrupo(target, "Mod");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag mod");
                return true;
            }
            if (Args[1].equalsIgnoreCase("mod+")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �5�lMOD+");
                target.sendMessage("�eO seu grupo foi alterado para Mod+!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �5�lMOD+");
                cfGrupo.setarGrupo(target, "Mod+");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag mod+");
                return true;
            }
            if (Args[1].equalsIgnoreCase("admin")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �c�lADMIN");
                target.sendMessage("�eO seu grupo foi alterado para Admin!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �c�lADMIN");
                cfGrupo.setarGrupo(target, "Admin");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag admin");
                return true;
            }
            if (Args[1].equalsIgnoreCase("gerente")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �c�lGERENTE");
                target.sendMessage("�eO seu grupo foi alterado para Gerente!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �c�lGERENTE");
                cfGrupo.setarGrupo(target, "Gerente");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag gerente");
                return true;
            }
            if (Args[1].equalsIgnoreCase("dono")) {
                p.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target.getName() + " �7para: �4�lDONO");
                target.sendMessage("�eO seu grupo foi alterado para Dono!");
                TituloAPI.MandarTitulo(target, "�a�lGRUPO");
                TituloAPI.MandarSubTitulo(target, "�7Voc\u00ea teve o seu grupo alterado para: �4�lDONO");
                cfGrupo.setarGrupo(target, "Dono");
                cfGrupo.salvarconfiguracao();
                if (cfGrupo.ChecarGrupo(target, "Dono")) {
                    CorGrupo.setarTag(target, "�4�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Gerente")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Admin")) {
                    CorGrupo.setarTag(target, "�c�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod+")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mod")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Trial")) {
                    CorGrupo.setarTag(target, "�5�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber+")) {
                    CorGrupo.setarTag(target, "�3�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Builder")) {
                    CorGrupo.setarTag(target, "�2�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Helper")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Youtuber")) {
                    CorGrupo.setarTag(target, "�b�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "S-Pro")) {
                    CorGrupo.setarTag(target, "�e�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Pro")) {
                    CorGrupo.setarTag(target, "�6�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Mvp")) {
                    CorGrupo.setarTag(target, "�9�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Light")) {
                    CorGrupo.setarTag(target, "�a�l");
                }
                else if (cfGrupo.ChecarGrupo(target, "Membro")) {
                    CorGrupo.setarTag(target, "�7�l");
                }
                sScoreAPI.scoreboard(target);
                target.chat("/tag dono");
                return true;
            }
            p.sendMessage("�cEsse grupo n\u00e3o existe!");
        }
        if (!(Sender instanceof Player)) {
            if (Args.length == 0) {
                Sender.sendMessage("�3�lGROUPSET �b�l/groupset �f(jogador) (grupo)");
                return true;
            }
            final Player target2 = Bukkit.getPlayerExact(Args[0]);
            if (target2 == null) {
                final OfflinePlayer targetoff2 = Bukkit.getOfflinePlayer(Args[0]);
                if (Args.length == 1) {
                    Sender.sendMessage("�3�lGROUPSET �b�l/groupset �f(nickname) (grupo)");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("membro")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �7�lMEMBRO");
                    cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + targetoff2.getUniqueId() + ".Silent", (Object)"OFF");
                    cfConfig.salvarconfiguracao();
                    cfGrupo.setarGrupo(targetoff2, "Membro");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("light")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �a�lLIGHT");
                    cfGrupo.setarGrupo(targetoff2, "Light");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("premium")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �1�lBETA");
                    cfGrupo.setarGrupo(targetoff2, "Mvp");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("semiyt")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �e�lSEMIYT");
                    cfGrupo.setarGrupo(targetoff2, "S-Pro");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("ultimate")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �d�lULTIMATE");
                    cfGrupo.setarGrupo(targetoff2, "Pro");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("youtuber")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �b�lYOUTUBER");
                    cfGrupo.setarGrupo(targetoff2, "Youtuber");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("youtuber+")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �3�lYOUTUBER+");
                    cfGrupo.setarGrupo(targetoff2, "Youtuber+");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("builder")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �2�lBUILDER");
                    cfGrupo.setarGrupo(targetoff2, "Builder");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("builder+")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �2�lBUILDER+");
                    cfGrupo.setarGrupo(targetoff2, "Builder+");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("ajudante")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �9�lAJUDANTE");
                    cfGrupo.setarGrupo(targetoff2, "Helper");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("gc")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �1�lGCDETECTOR");
                    cfGrupo.setarGrupo(targetoff2, "Gc");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("trial")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �5�lTRIAL");
                    cfGrupo.setarGrupo(targetoff2, "Trial");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("mod")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �5�lMOD");
                    cfGrupo.setarGrupo(targetoff2, "Mod");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("mod+")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �5�lMOD+");
                    cfGrupo.setarGrupo(targetoff2, "Mod+");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("admin")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �c�lADMIN");
                    cfGrupo.setarGrupo(targetoff2, "Admin");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("gerente")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �c�lGERENTE");
                    cfGrupo.setarGrupo(targetoff2, "Gerente");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                if (Args[1].equalsIgnoreCase("dono")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + targetoff2.getName() + " �7para: �4�lDONO");
                    cfGrupo.setarGrupo(targetoff2, "Dono");
                    cfGrupo.salvarconfiguracao();
                    return true;
                }
                Sender.sendMessage("�cEsse grupo n\u00e3o existe!");
            }
            if (target2 != null) {
                if (Args.length == 1) {
                    Sender.sendMessage("�3�lGROUPSET �b�l/groupset �f(jogador) (grupo)");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("membro")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �7�lMEMBRO");
                    target2.sendMessage("�eO seu grupo foi alterado para Membro!");
                    cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + target2.getUniqueId() + ".Silent", (Object)"OFF");
                    cfConfig.salvarconfiguracao();
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �7�lMEMBRO");
                    cfGrupo.setarGrupo(target2, "Membro");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag normal");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("light")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �a�lLIGTH");
                    target2.sendMessage("�eO seu grupo foi alterado para LIGHT!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �a�lLIGHT");
                    cfGrupo.setarGrupo(target2, "Light");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag light");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("premium")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �1�lBETA");
                    target2.sendMessage("�eO seu grupo foi alterado para beta!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �1�lBETA");
                    cfGrupo.setarGrupo(target2, "premium");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag premium");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("semiyt")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �e�lSEMIYT");
                    target2.sendMessage("�eO seu grupo foi alterado para Semiyt!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �e�lSEMIYT");
                    cfGrupo.setarGrupo(target2, "S-Pro");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag semiyt");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("ultimate")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �d�lULTIMATE");
                    target2.sendMessage("�eO seu grupo foi alterado para Pro!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �d�lULTIMATE");
                    cfGrupo.setarGrupo(target2, "Pro");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag ultimate");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("youtuber")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �b�lYOUTUBER");
                    target2.sendMessage("�eO seu grupo foi alterado para Youtuber!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo foi alterado para: �b�lYOUTUBER");
                    cfGrupo.setarGrupo(target2, "Youtuber");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag youtuber");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("youtuber+")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �3�lYOUTUBER+");
                    target2.sendMessage("�eO seu grupo foi alterado para Youtuberplus!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �3�lYOUTUBER+");
                    cfGrupo.setarGrupo(target2, "Youtuber+");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag youtuber+");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("builder")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �2�lBUILDER");
                    target2.sendMessage("�eO seu grupo foi alterado para Builder");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �2�lBUILDER");
                    cfGrupo.setarGrupo(target2, "Builder");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag builder");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("builder+")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �2�lBUILDER+");
                    target2.sendMessage("�eO seu grupo foi alterado para LIGHT!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �2�lBUILDER+");
                    cfGrupo.setarGrupo(target2, "Builder+");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag builder+");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("ajudante")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �6�lAJUDANTE");
                    target2.sendMessage("�eO seu grupo foi alterado para Helper!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �e�lAJUDANTE");
                    cfGrupo.setarGrupo(target2, "Helper");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag ajudante");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("gc")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �1�lGCDETECTOR");
                    target2.sendMessage("�eO seu grupo foi alterado para Trial!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �1�lGCDETECTOR");
                    cfGrupo.setarGrupo(target2, "Gc");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag gc");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("trial")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �5�lTRIAL");
                    target2.sendMessage("�eO seu grupo foi alterado para Trial!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �5�lTRIAL");
                    cfGrupo.setarGrupo(target2, "Trial");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag trial");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("mod")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �5�lMOD");
                    target2.sendMessage("�eO seu grupo foi alterado para Mod!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �5�lMOD");
                    cfGrupo.setarGrupo(target2, "Mod");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag mod");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("mod+")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �5�lMOD+");
                    target2.sendMessage("�eO seu grupo foi alterado para Mod+!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �5�lMOD+");
                    cfGrupo.setarGrupo(target2, "Mod+");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag mod+");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("admin")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �c�lADMIN");
                    target2.sendMessage("�eO seu grupo foi alterado para Admin");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �c�lADMIN");
                    cfGrupo.setarGrupo(target2, "Admin");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag admin");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("gerente")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �c�lGERENTE");
                    target2.sendMessage("�eO seu grupo foi alterado para Gerente!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �c�lGERENTE");
                    cfGrupo.setarGrupo(target2, "Gerente");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag gerente");
                    return true;
                }
                if (Args[1].equalsIgnoreCase("dono")) {
                    Sender.sendMessage("�7Voc\u00ea alterou o grupo de �6�l" + target2.getName() + " �7para: �4�lDONO");
                    target2.sendMessage("�eO seu grupo foi alterado para Dono!");
                    TituloAPI.MandarTitulo(target2, "�a�lGRUPO");
                    TituloAPI.MandarSubTitulo(target2, "�7Voc\u00ea teve o seu grupo alterado para: �4�lDONO");
                    cfGrupo.setarGrupo(target2, "Dono");
                    cfGrupo.salvarconfiguracao();
                    if (cfGrupo.ChecarGrupo(target2, "Dono")) {
                        CorGrupo.setarTag(target2, "�4�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Gerente")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Admin")) {
                        CorGrupo.setarTag(target2, "�c�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod+")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mod")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber+")) {
                        CorGrupo.setarTag(target2, "�3�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Builder")) {
                        CorGrupo.setarTag(target2, "�2�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Helper")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Youtuber")) {
                        CorGrupo.setarTag(target2, "�b�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "S-Pro")) {
                        CorGrupo.setarTag(target2, "�e�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Pro")) {
                        CorGrupo.setarTag(target2, "�6�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Mvp")) {
                        CorGrupo.setarTag(target2, "�9�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Light")) {
                        CorGrupo.setarTag(target2, "�a�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Trial")) {
                        CorGrupo.setarTag(target2, "�5�l");
                    }
                    else if (cfGrupo.ChecarGrupo(target2, "Membro")) {
                        CorGrupo.setarTag(target2, "�7�l");
                    }
                    sScoreAPI.scoreboard(target2);
                    target2.chat("/tag dono");
                    return true;
                }
                Sender.sendMessage("�cEsse grupo n\u00e3o existe!");
            }
        }
        return false;
    }
}
