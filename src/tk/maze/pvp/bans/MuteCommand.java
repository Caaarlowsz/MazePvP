package tk.maze.pvp.bans;

import tk.maze.pvp.API.HorarioAPI;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class MuteCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        final Player jogador = (Player)sender;
        if (!cmd.getName().equalsIgnoreCase("mute")) {
            return false;
        }
        if (!cfGrupo.ChecarGrupo(jogador, "Dono") && !cfGrupo.ChecarGrupo(jogador, "Gc") && !cfGrupo.ChecarGrupo(jogador, "Gc") && !cfGrupo.ChecarGrupo(jogador, "Admin") && !cfGrupo.ChecarGrupo(jogador, "Mod+") && !cfGrupo.ChecarGrupo(jogador, "Mod") && !cfGrupo.ChecarGrupo(jogador, "Trial") && !cfGrupo.ChecarGrupo(jogador, "Youtuber+") && !cfGrupo.ChecarGrupo(jogador, "Helper")) {
            API.sendMsg((CommandSender)jogador, "�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
            return true;
        }
        if (args.length == 0) {
            API.sendMsg((CommandSender)jogador, "�b�lMUTE: �9�l/mute (jogador) (motivo)");
            API.sendSound(jogador, Sound.NOTE_PLING, 10);
            return true;
        }
        final Player vitima = Bukkit.getPlayer(args[0]);
        if (vitima == null) {
            API.sendMsg((CommandSender)jogador, "�cO jogador em quest\u00e3o est\u00e1 offline ou nunca entrou no servidor!");
            API.sendSound(jogador, Sound.NOTE_PLING, 10);
            return true;
        }
        if (vitima.getName() == jogador.getName()) {
            API.sendMsg((CommandSender)jogador, "�cVoc\u00ea n\u00e3o pode mutar a si mesmo!");
            API.sendSound(jogador, Sound.NOTE_PLING, 10);
            return true;
        }
        if (Config.getConfig().getBans().get("Mute." + vitima.getUniqueId()) != null) {
            API.sendMsg((CommandSender)jogador, "�fO jogador �6�l" + vitima.getName() + " �fj\u00e1 est\u00e1 �9�lMUTADO�f!");
            API.sendSound(jogador, Sound.NOTE_PLING, 10);
            return true;
        }
        if (Config.getConfig().getIpBans().get("TempMute." + vitima.getUniqueId()) != null) {
            API.sendMsg((CommandSender)jogador, "�fO jogador �6�l" + vitima.getName() + " �fj\u00e1 est\u00e1 �9�lMUTADO�f!");
            API.sendSound(jogador, Sound.NOTE_PLING, 10);
            return true;
        }
        if (args.length == 1) {
            API.sendMsg((CommandSender)jogador, "�9�lMUTE? �7/mute Jo");
            API.sendSound(jogador, Sound.NOTE_PLING, 10);
            return true;
        }
        String Motivo = "";
        for (int i = 1; i < args.length; ++i) {
            Motivo = String.valueOf(Motivo) + args[i] + " ";
        }
        API.sendMsg((CommandSender)jogador, "�9�lMUTE �fVoc\u00ea mutou o jogador �c�l" + vitima.getName() + "�f.");
        API.sendStaff("�9�lMUTE �f" + jogador.getName() + " mutou o jogador �c�l" + vitima.getName() + "�f. Motivo: �6�l" + Motivo);
        API.sendMsg((CommandSender)vitima, "�7Voc\u00ea foi Mutado por: �b�l" + jogador.getName() + "�7. Motivo: �c�l" + Motivo);
        Config.getConfig().getMute().set("Mute." + vitima.getUniqueId() + ".Nome", (Object)vitima.getName());
        Config.getConfig().getMute().set("Mute." + vitima.getUniqueId() + ".Mutado por", (Object)jogador.getName());
        Config.getConfig().getMute().set("Mute." + vitima.getUniqueId() + ".Motivo", (Object)Motivo);
        Config.getConfig().getMute().set("Mute." + vitima.getUniqueId() + ".Data do mute", (Object)HorarioAPI.getHorario());
        Config.getConfig().saveMute();
        return true;
    }
}
