package tk.maze.pvp.conf;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class cfClan {
	private static FileConfiguration player_grupo;
	private static File playergrupo;

	public static void setarconfig(final Plugin plugin) {
		if (!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();
		}
		cfClan.playergrupo = new File(plugin.getDataFolder(), "clan.yml");
		if (cfClan.playergrupo.exists()) {
			try {
				cfClan.playergrupo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		cfClan.player_grupo = (FileConfiguration) YamlConfiguration.loadConfiguration(cfClan.playergrupo);
	}

	public static FileConfiguration pegarclan() {
		return cfClan.player_grupo;
	}

	public static void salvarconfiguracao() {
		try {
			cfClan.player_grupo.save(cfClan.playergrupo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean pegarClan(final Player p, final String Clan) {
		return pegarclan().get("clan." + p.getUniqueId() + ".Clan").equals(Clan);
	}

	public static boolean pegarPrefix(final Player p, final String Prefix) {
		return pegarclan().get("clan." + p.getUniqueId() + ".Prefix").equals(Prefix);
	}

	public static void setarClan(final Player p, final String Clan, final String Prefix) {
		pegarclan().set("clan." + p.getUniqueId() + ".Nick", (Object) p.getName());
		pegarclan().set("clan." + p.getUniqueId() + ".Clan", (Object) Clan);
		pegarclan().set("clan." + p.getUniqueId() + ".Prefix", (Object) Prefix);
		salvarconfiguracao();
	}
}
