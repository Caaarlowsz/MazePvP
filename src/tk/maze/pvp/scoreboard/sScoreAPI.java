package tk.maze.pvp.scoreboard;

import tk.maze.pvp.API.ArraysAPI;
import tk.maze.pvp.API.KitAPI;
import tk.maze.pvp.conf.cfStatus;
import org.bukkit.entity.Player;
import java.util.ArrayList;

public class sScoreAPI
{
    public static ArrayList<Player> Score;
    public static ArrayList<Player> Delay;
    
    static {
        sScoreAPI.Score = new ArrayList<Player>();
        sScoreAPI.Delay = new ArrayList<Player>();
    }
    
    public static String getRank(final Player p) {
        final double a = cfStatus.getKills(p);
        if (a <= 30.0) {
            return "§f\u268a";
        }
        if (a <= 50.0) {
            return "§a\u268c";
        }
        if (a <= 70.0) {
            return "§e\u2630";
        }
        if (a <= 100.0) {
            return "§1\u2725";
        }
        if (a <= 140.0) {
            return "§7\u272f";
        }
        if (a <= 200.0) {
            return "§6\u272a";
        }
        if (a <= 230.0) {
            return "§b\ufffd?\ufffd";
        }
        if (a <= 290.0) {
            return "§2\u2738";
        }
        if (a <= 340.0) {
            return "§5\u2739";
        }
        if (a <= 430.0) {
            return "§c\u2737";
        }
        if (a <= 600.0) {
            return "§4\ufffd?\ufffd";
        }
        if (a <= 1000.0) {
            return "§d§l\ufffd?\ufffd";
        }
        return "§d§l\ufffd?\ufffd";
    }
    
    public static String getRankConfig(final Player p) {
        final double a = cfStatus.getKills(p);
        if (a <= 30.0) {
            return "§fFIRST";
        }
        if (a <= 50.0) {
            return "§aSECOND";
        }
        if (a <= 70.0) {
            return "§eAPRENDIZ";
        }
        if (a <= 100.0) {
            return "§1EXPERT";
        }
        if (a <= 140.0) {
            return "§7SILVER";
        }
        if (a <= 200.0) {
            return "§6GOLD";
        }
        if (a <= 230.0) {
            return "§bDIAMOND";
        }
        if (a <= 290.0) {
            return "§2EMERALD";
        }
        if (a <= 340.0) {
            return "§5ELITE";
        }
        if (a <= 430.0) {
            return "§cMASTER";
        }
        if (a <= 600.0) {
            return "§4LEGENDARY";
        }
        if (a <= 1500.0) {
            return "§4LOWER";
        }
        return "§4LOWER";
    }
    
    public static String getNomeRank(final Player p) {
        final double a = cfStatus.getKills(p);
        if (a <= 30.0) {
            return "§fFIRST";
        }
        if (a <= 50.0) {
            return "§aSECOND";
        }
        if (a <= 70.0) {
            return "§eAPRENDIZ";
        }
        if (a <= 100.0) {
            return "§1EXPERT";
        }
        if (a <= 140.0) {
            return "§7SILVER";
        }
        if (a <= 200.0) {
            return "§6GOLD";
        }
        if (a <= 230.0) {
            return "§bDIAMOND";
        }
        if (a <= 290.0) {
            return "§2EMERALD";
        }
        if (a <= 340.0) {
            return "§5ELITE";
        }
        if (a <= 430.0) {
            return "§cMASTER";
        }
        if (a <= 600.0) {
            return "§4LEGENDARY";
        }
        if (a <= 1500.0) {
            return "§4LOWER";
        }
        return "§4LEGENDARY";
    }
    
    public static String getNomeRankConfig(final Player p) {
        final double a = cfStatus.getKills(p);
        if (a <= 30.0) {
            return "§fFIRST";
        }
        if (a <= 50.0) {
            return "§aSECOND";
        }
        if (a <= 70.0) {
            return "§eAPRENDIZ";
        }
        if (a <= 100.0) {
            return "§1EXPERT";
        }
        if (a <= 140.0) {
            return "§7SILVER";
        }
        if (a <= 200.0) {
            return "§6GOLD";
        }
        if (a <= 230.0) {
            return "§bDIAMOND";
        }
        if (a <= 290.0) {
            return "§2EMERALD";
        }
        if (a <= 330.0) {
            return "§5ELITE";
        }
        if (a <= 430.0) {
            return "§cMASTER";
        }
        if (a <= 600.0) {
            return "§4LEGENDARY";
        }
        if (a <= 1500.0) {
            return "§4LOWER";
        }
        return "§4LOWER";
    }
    
    public static void scoreboard(final Player p) {
        final uScore scoreboard = new uScore("§b§lKITPVP");
        scoreboard.addLine("§3 ", 10);
        scoreboard.addLine("§fKills: §7" + cfStatus.getKills(p), 9);
        scoreboard.addLine("§fDeaths: §7" + cfStatus.getDeaths(p), 8);
        scoreboard.addLine("§fKillstreak: §7" + cfStatus.getKillStreak(p), 7);
        scoreboard.addLine("§7 ", 6);
        scoreboard.addLine("§fKit: §a" + KitAPI.getKit(p), 5);
        scoreboard.addLine("§fRanking: §eBronze I", 4);
        scoreboard.addLine("§fJogadores: §7" + ArraysAPI.Jogando.size(), 3);
        scoreboard.addLine("§7", 2);
        scoreboard.addLine("§ayoutube.com/c/browk", 1);
        if (sScoreAPI.Score.contains(p)) {
            scoreboard.setScoreboard();
            p.setScoreboard(scoreboard.getScoreboard());
        }
        else {
            scorenull(p);
        }
    }
    
    public static void scorenull(final Player p) {
        final uScore scoreboard = new uScore("");
        scoreboard.setScoreboard();
        p.setScoreboard(scoreboard.getScoreboard());
    }
}
