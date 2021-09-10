package tk.maze.pvp.conf;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import tk.maze.pvp.Main;
import tk.maze.pvp.API.TopKillStreak;
import tk.maze.pvp.scoreboard.sScoreAPI;

public class cfStatus {
	public static File file;
	public static FileConfiguration cfile;

	public cfStatus() {
		final Plugin plugin = Main.getPlugin();
		if (!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();
		}
		cfStatus.file = new File(plugin.getDataFolder(), "playersstatus.yml");
		if (!cfStatus.file.exists()) {
			try {
				cfStatus.file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		cfStatus.cfile = (FileConfiguration) YamlConfiguration.loadConfiguration(cfStatus.file);
	}

	public static void FirstJoin(final Player jogador) {
		if (cfStatus.cfile.getString(String.valueOf(jogador.getName()) + ".UUID") == null) {
			Save();
		}
	}

	public static void setKills(final Player p) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Kills", (Object) (getKills(p) + 1));
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Ks", (Object) (getKillStreak(p) + 1));
		TopKillStreak.Ks.put(p, TopKillStreak.Ks.get(p) + 1);
		Save();
	}

	public static void addKills(final Player p, final String valor) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Kills", (Object) (String.valueOf(getKills(p)) + valor));
		Save();
	}

	public static void setKillsCmd(final Player p, final String valor) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Kills", (Object) valor);
		Save();
	}

	public static int getKills(final Player p) {
		return cfStatus.cfile.getInt(String.valueOf(p.getName()) + ".Kills");
	}

	public static int getKillsOff(final OfflinePlayer off) {
		return cfStatus.cfile.getInt(String.valueOf(off.getName()) + ".Kills");
	}

	public static int getKillStreak(final Player p) {
		return cfStatus.cfile.getInt(String.valueOf(p.getName()) + ".Ks");
	}

	public static void setDeaths(final Player p) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Deaths", (Object) (getDeaths(p) + 1));
		Save();
	}

	public static void addDeaths(final Player p, final double valor) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Deaths", (Object) valor);
		Save();
	}

	public static void setDeathsCmd(final Player p, final double valor) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Deaths", (Object) (getDeaths(p) + valor));
		Save();
	}

	public static int getDeaths(final Player p) {
		return cfStatus.cfile.getInt(String.valueOf(p.getName()) + ".Deaths");
	}

	public static void setMoney(final Player p, final int Money) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Money", (Object) (getMoney(p) + Money));
		Save();
	}

	public static void addMoney(final Player p, final double Money) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Money", (Object) (getMoney(p) + Money));
		Save();
	}

	public static void setMoneyCmd(final Player p, final double Money) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Money", (Object) (getMoney(p) + Money));
		Save();
	}

	public static void RemoveMoney(final Player p, final int Money) {
		if (getMoney(p) <= 0) {
			return;
		}
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Money", (Object) (getMoney(p) - Money));
		Save();
	}

	public static void RemoverKS(final Player p) {
		cfStatus.cfile.set(String.valueOf(p.getName()) + ".Ks", (Object) (getKillStreak(p) - getKillStreak(p)));
		TopKillStreak.Ks.put(p, 0);
		Player[] onlinePlayers;
		for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
			final Player players = onlinePlayers[i];
			TopKillStreak.createTopKillStreak(players);
			sScoreAPI.scoreboard(players);
		}
		Save();
	}

	public static int getMoney(final Player p) {
		return cfStatus.cfile.getInt(String.valueOf(p.getName()) + ".Money");
	}

	public static void Save() {
		try {
			cfStatus.cfile.save(cfStatus.file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
