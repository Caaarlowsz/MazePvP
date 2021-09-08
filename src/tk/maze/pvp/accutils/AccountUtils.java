package tk.maze.pvp.accutils;

import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.OfflinePlayer;

public class AccountUtils
{
    public static String getGrupo(final OfflinePlayer p) {
        if (cfGrupo.ChecarGrupo(p, "Membro")) {
            return "§7§lMEMBRO";
        }
        if (cfGrupo.ChecarGrupo(p, "light")) {
            return "§a§lVIP";
        }
        if (cfGrupo.ChecarGrupo(p, "Mvp")) {
            return "§9§lMVP";
        }
        if (cfGrupo.ChecarGrupo(p, "Pro")) {
            return "§6§lPRO";
        }
        if (cfGrupo.ChecarGrupo(p, "S-Pro")) {
            return "§e§lSEMIYT";
        }
        if (cfGrupo.ChecarGrupo(p, "Youtuber")) {
            return "§b§lYOUTUBER";
        }
        if (cfGrupo.ChecarGrupo(p, "Youtuber+")) {
            return "§3§lYOUTUBER+";
        }
        if (cfGrupo.ChecarGrupo(p, "Helper")) {
            return "§e§lHELPER";
        }
        if (cfGrupo.ChecarGrupo(p, "Builder")) {
            return "§2§lBUILDER";
        }
        if (cfGrupo.ChecarGrupo(p, "Trial")) {
            return "§5§lTRIAL";
        }
        if (cfGrupo.ChecarGrupo(p, "Mod")) {
            return "§5§lMOD";
        }
        if (cfGrupo.ChecarGrupo(p, "Mod+")) {
            return "§5§lMODPLUS";
        }
        if (cfGrupo.ChecarGrupo(p, "Gerente")) {
            return "§c§lGERENTE";
        }
        if (cfGrupo.ChecarGrupo(p, "Admin")) {
            return "§c§lADMIN";
        }
        if (cfGrupo.ChecarGrupo(p, "Dono")) {
            return "§4§lDONO";
        }
        return "§4§lDONO";
    }
}
