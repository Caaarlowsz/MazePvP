package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.github.caaarlowsz.mazemc.kitpvp.MazePvP;
import tk.maze.pvp.API.API;
import tk.maze.pvp.API.KitAPI;
import tk.maze.pvp.API.TopKillStreak;
import tk.maze.pvp.API.WarpsAPI;
import tk.maze.pvp.scoreboard.sScoreAPI;

public class SpawnCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
		final Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("spawn")) {
			p.sendMessage("�aVoc\u00ea est\u00e1 sendo teleportado para o spawn.");
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 300, 300));
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 300, 300));
			Bukkit.getScheduler().scheduleSyncDelayedTask(MazePvP.getPlugin(), (Runnable) new Runnable() {
				@Override
				public void run() {
					TopKillStreak.Ks.put(p, 0);
					Player[] onlinePlayers;
					for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
						final Player players = onlinePlayers[i];
						TopKillStreak.KsTop.put(p, TopKillStreak.getKsTop(players));
						TopKillStreak.Name.put(p, TopKillStreak.getNameTop(players));
						sScoreAPI.scoreboard(players);
					}
					WarpsAPI.Ir(p, "Spawn");
					API.setWarp(p, "Spawn");
					API.sendItems(p);
					KitAPI.removeKits(p);
					sScoreAPI.scoreboard(p);
					p.removePotionEffect(PotionEffectType.SLOW);
					p.removePotionEffect(PotionEffectType.BLINDNESS);
					p.setHealth(20.0);
					p.setMaxHealth(20.0);
				}
			}, 60L);
		}
		return false;
	}
}
