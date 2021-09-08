package tk.maze.pvp.check;

import tk.maze.pvp.API.cfStatus;
import tk.maze.pvp.scoreboard.sScoreAPI;
import tk.maze.pvp.API.API;
import tk.maze.pvp.API.KitAPI;
import tk.maze.pvp.commands.FlyCommand;
import org.bukkit.GameMode;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;

public class CheckUtils
{
    public static String Grupo(final Player p) {
        if (cfGrupo.ChecarGrupo(p, "Membro")) {
            return "§7§lNORMAL";
        }
        if (cfGrupo.ChecarGrupo(p, "Light")) {
            return "§a§lLIGHT";
        }
        if (cfGrupo.ChecarGrupo(p, "Mvp")) {
            return "§6§lPREMIUM";
        }
        if (cfGrupo.ChecarGrupo(p, "Pro")) {
            return "§d§lULTIMATE";
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
            return "§9§lAJUDANTE";
        }
        if (cfGrupo.ChecarGrupo(p, "Builder")) {
            return "§2§lBUILDER";
        }
        if (cfGrupo.ChecarGrupo(p, "Builder+")) {
            return "§2§lBUILDER+";
        }
        if (cfGrupo.ChecarGrupo(p, "Trial")) {
            return "§d§lTRIAL";
        }
        if (cfGrupo.ChecarGrupo(p, "Gc")) {
            return "§1§lGCDETECTOR";
        }
        if (cfGrupo.ChecarGrupo(p, "Mod")) {
            return "§5§lMOD";
        }
        if (cfGrupo.ChecarGrupo(p, "Mod+")) {
            return "§5§lMOD+";
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
    
    public static String Nickname(final Player p) {
        return "§6" + p.getName();
    }
    
    public static String UUID(final Player p) {
        return "§7" + p.getUniqueId().toString();
    }
    
    public static String IP(final Player p) {
        return "§7" + p.getAddress().getHostString();
    }
    
    public static String IPReverso(final Player p) {
        return "§7" + p.getAddress().getHostName();
    }
    
    public static String GeoIP(final Player p) {
        return "§7https://www.geoiptool.com/pt/?ip=" + p.getAddress().getHostString();
    }
    
    public static String Gamemode(final Player p) {
        if (p.getGameMode() == GameMode.CREATIVE) {
            return "§9§lCRIATIVO";
        }
        if (p.getGameMode() == GameMode.SURVIVAL) {
            return "§9§lSOBREVIVENCIA";
        }
        if (p.getGameMode() == GameMode.ADVENTURE) {
            return "§9§lAVENTURA";
        }
        return "§9§lAVENTURA";
    }
    
    public static String Fly(final Player p) {
        if (FlyCommand.Fly.contains(p)) {
            return "§a§lATIVADO";
        }
        if (!FlyCommand.Fly.contains(p)) {
            return "§c§lDESATIVADO";
        }
        return "§c§lDESATIVADO";
    }
    
    public static String Vida(final Player p) {
        return "§7" + p.getHealthScale();
    }
    
    public static String Fome(final Player p) {
        return "§7" + p.getFoodLevel();
    }
    
    public static String Kit(final Player p) {
        return "§7" + KitAPI.getKitAntes(p);
    }
    
    public static String Warp(final Player p) {
        return "§7" + API.getWarp(p);
    }
    
    public static String Rank(final Player p) {
        return "§7" + sScoreAPI.getRank(p) + " " + sScoreAPI.getNomeRank(p);
    }
    
    public static String Coins(final Player p) {
        return "§7" + cfStatus.getMoney(p);
    }
    
    public static String Kills(final Player p) {
        return "§7" + cfStatus.getKills(p);
    }
    
    public static String Deaths(final Player p) {
        return "§7" + cfStatus.getDeaths(p);
    }
    
    public static String KillStreak(final Player p) {
        return "§7" + cfStatus.getKillStreak(p);
    }
}
