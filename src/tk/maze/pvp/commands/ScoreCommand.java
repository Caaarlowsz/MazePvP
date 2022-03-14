package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.caaarlowsz.mazemc.kitpvp.MazePvP;
import tk.maze.pvp.scoreboard.sScoreAPI;

public class ScoreCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
		final Player p = (Player) Sender;
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
				Bukkit.getScheduler().scheduleSyncDelayedTask(MazePvP.getPlugin(), (Runnable) new Runnable() {
					@Override
					public void run() {
						sScoreAPI.Delay.remove(p);
					}
				}, 120L);
			} else if (!sScoreAPI.Score.contains(p)) {
				p.sendMessage("�b�lSCORE �7A sua Scoreboard foi �a�lATIVADA");
				sScoreAPI.Score.add(p);
				sScoreAPI.scoreboard(p);
				sScoreAPI.Delay.add(p);
				Bukkit.getScheduler().scheduleSyncDelayedTask(MazePvP.getPlugin(), (Runnable) new Runnable() {
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
