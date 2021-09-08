package tk.maze.pvp.commands;

import tk.maze.pvp.Main;
import org.bukkit.Bukkit;
import tk.maze.pvp.scoreboard.sScoreAPI;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class ScoreCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
        final Player p = (Player)Sender;
        if (Cmd.getName().equalsIgnoreCase("score")) {
            if (sScoreAPI.Delay.contains(p)) {
                p.sendMessage("�cAguarde para executar este comando novamente!");
                return true;
            }
            if (sScoreAPI.Score.contains(p)) {
                p.sendMessage("�b�lSCORE �7A sua Scoreboard foi �c�lDESATIVADA");
                sScoreAPI.Score.remove(p);
                sScoreAPI.scorenull(p);
                sScoreAPI.Delay.add(p);
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        sScoreAPI.Delay.remove(p);
                    }
                }, 120L);
            }
            else if (!sScoreAPI.Score.contains(p)) {
                p.sendMessage("�b�lSCORE �7A sua Scoreboard foi �a�lATIVADA");
                sScoreAPI.Score.add(p);
                sScoreAPI.scoreboard(p);
                sScoreAPI.Delay.add(p);
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        sScoreAPI.Delay.remove(p);
                    }
                }, 120L);
            }
        }
        return false;
    }
}
