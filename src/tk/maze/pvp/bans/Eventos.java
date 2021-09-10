package tk.maze.pvp.bans;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class Eventos implements Listener {
	@EventHandler
	void chatevent(final PlayerChatEvent evento) {
		final Player jogador = evento.getPlayer();
		if (Config.getConfig().getMute().get("Mute." + jogador.getUniqueId()) != null) {
			API.sendMsg((CommandSender) jogador, "§fVoc\u00ea est\u00e1 §9§lMUTADO§f.");
			API.sendSound(jogador, Sound.ANVIL_USE, 10);
			evento.setCancelled(true);
		} else if (Config.getConfig().getTempMute().get("TempMute." + jogador.getUniqueId()) != null) {
			API.sendMsg((CommandSender) jogador, "§fVoc\u00ea est\u00e1 §9§lMUTADO§f.");
			API.sendSound(jogador, Sound.ANVIL_USE, 10);
			evento.setCancelled(true);
		}
	}

	@EventHandler
	public void loginEvent(final PlayerLoginEvent evento) {
		final Player jogador = evento.getPlayer();
		if (Config.getConfig().getBans().get("Bans." + jogador.getUniqueId()) != null) {
			evento.disallow(PlayerLoginEvent.Result.KICK_OTHER, ChatColor.GRAY
					+ "§7Voc\u00ea est\u00e1 banido §4§lPERMANENTEMENTE §7do servidor!" + "\n" + "§7Player banido: §b§l"
					+ Config.getConfig().getBans().get("Bans." + jogador.getUniqueId() + ".Nome") + "\n"
					+ "§7Pelo Staff: §b§l"
					+ Config.getConfig().getBans().get("Bans." + jogador.getUniqueId() + ".Banido por") + "\n"
					+ "§7Motivo: §b§l" + Config.getConfig().getBans().get("Bans." + jogador.getUniqueId() + ".Motivo")
					+ "\n" + "§7Expira em: §b§lNUNCA" + "\n" + "§7Data do banimento: §b§l"
					+ Config.getConfig().getBans().get("Bans." + jogador.getUniqueId() + ".Data do banimento"));
		} else if (Config.getConfig().getTempBans().get("TempBans." + jogador.getUniqueId()) != null) {
			evento.disallow(PlayerLoginEvent.Result.KICK_OTHER, ChatColor.GRAY
					+ "§7Voc\u00ea est\u00e1 banido §9§TEMPORARIAMENTE §7 do servidor!" + "\n"
					+ "§7Player banido §b§l: "
					+ Config.getConfig().getTempBans().get("TempBans." + jogador.getUniqueId() + ".Nome") + "\n"
					+ "§7Pelo Staff: §b§l"
					+ Config.getConfig().getTempBans().get("TempBans." + jogador.getUniqueId() + ".Banido por") + "\n"
					+ "§7Motivo: §b§l"
					+ Config.getConfig().getTempBans().get("TempBans." + jogador.getUniqueId() + ".Motivo") + "\n"
					+ "§7Expira em: §b§l"
					+ Config.getConfig().getTempBans().get("TempBans." + jogador.getUniqueId() + ".Tempo do Ban") + "\n"
					+ "§7Data do banimento: §b§l"
					+ Config.getConfig().getTempBans().get("TempBans." + jogador.getUniqueId() + ".Data do banimento"));
		} else if (Config.getConfig().getIpBans().get("IPBans." + jogador.getUniqueId()) != null) {
			evento.disallow(PlayerLoginEvent.Result.KICK_OTHER, ChatColor.GRAY
					+ "§7Voc\u00ea est\u00e1 banido  §4§PERMANENTEMENTE§7 do servidor!" + "\n"
					+ "§7Player banido: §b§l "
					+ Config.getConfig().getIpBans().get("IPBans." + jogador.getUniqueId() + ".Nome") + "\n"
					+ "§7IP banido: §b§l"
					+ Config.getConfig().getIpBans().get("IPBans." + jogador.getUniqueId() + ".IP do Jogador") + "\n"
					+ "§7Banido por: §b§l"
					+ Config.getConfig().getIpBans().get("IPBans." + jogador.getUniqueId() + ".Banido por") + "\n"
					+ "§7Motivo: §b§l"
					+ Config.getConfig().getIpBans().get("IPBans." + jogador.getUniqueId() + ".Motivo") + "\n"
					+ "§7Expira em: §b§lNUNCA" + "\n" + "§cData do banimento: "
					+ Config.getConfig().getIpBans().get("IPBans." + jogador.getUniqueId() + ".Data do banimento"));
		} else if (evento.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) {
			evento.setKickMessage("§b§lWHITELIST ATIVADA...\n§7Estamos em manuten\u00e7\u00e3o!");
		}
	}
}
