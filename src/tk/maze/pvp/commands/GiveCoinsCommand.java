package tk.maze.pvp.commands;

import tk.maze.pvp.scoreboard.sScoreAPI;
import tk.maze.pvp.API.cfStatus;
import org.bukkit.Bukkit;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class GiveCoinsCommand implements CommandExecutor
{
    private boolean Numero(final String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("givecoins")) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Gerente")) {
                p.sendMessage("�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("�b�lGIVECOINS: �7Utilize /givecoins (jogador) (n� de coins)");
                p.sendMessage("�b�lGIVECOINS: �7Lembre-se: O uso deste comando para benef\u00edcio pr\u00f3rprio ou terceiros \u00e9 ilegal e acarreta em puni\u00e7\u00f5es.");
                return true;
            }
            if (args.length == 1) {
                p.sendMessage("�b�lGIVECOINS: �7Utilize �2�l/givecoins (jogador) (n� de coins)");
                p.sendMessage("�b�lGIVECOINS: �7Lembre-se: O uso deste comando para benef\u00edcio pr\u00f3rprio ou terceiros \u00e9 ilegal e acarreta em puni\u00e7\u00f5es.");
                return true;
            }
            final String valorstring = args[1];
            final Player k = Bukkit.getPlayer(args[0]);
            if (!this.Numero(valorstring)) {
                p.sendMessage("�cVoc\u00ea s\u00f3 pode utilizar n\u00fameros!");
                return true;
            }
            if (k == null) {
                p.sendMessage("�cO jogador em quest\u00e3o est\u00e1 offline ou nunca entrou no servidor.");
                return true;
            }
            if (k != null) {
                cfStatus.setMoney(p, valorstring.length());
                p.sendMessage("�7Voc\u00ea adicionou �a�l" + valorstring + " �2�COINS �7para jogador �6�l" + k.getName());
                sScoreAPI.scoreboard(k);
                return true;
            }
        }
        return false;
    }
}
