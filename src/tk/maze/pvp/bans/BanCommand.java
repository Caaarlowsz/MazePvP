package tk.maze.pvp.bans;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.API.HorarioAPI;
import tk.maze.pvp.conf.cfGrupo;

public class BanCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		final Player jogador = (Player) sender;
		if (!cmd.getName().equalsIgnoreCase("ban")) {
			return false;
		}
		if (!cfGrupo.ChecarGrupo(jogador, "Dono") && !cfGrupo.ChecarGrupo(jogador, "Gerente")
				&& !cfGrupo.ChecarGrupo(jogador, "Gcwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww")
				&& !cfGrupo.ChecarGrupo(jogador, "Admin") && !cfGrupo.ChecarGrupo(jogador, "Mod+")
				&& !cfGrupo.ChecarGrupo(jogador, "Mod") && !cfGrupo.ChecarGrupo(jogador, "Trial")
				&& !cfGrupo.ChecarGrupo(jogador, "Youtuber+")) {
			API.sendMsg((CommandSender) jogador,
					"�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
			return true;
		}
		if (args.length == 0) {
			API.sendMsg((CommandSender) jogador, "�7/ban (jogador) (motivo)");
			API.sendSound(jogador, Sound.NOTE_PLING, 10);
			return true;
		}
		final Player vitima = Bukkit.getPlayer(args[0]);
		if (vitima == null) {
			final OfflinePlayer vitimaoff = Bukkit.getOfflinePlayer(args[0]);
			if (vitimaoff.getName() == jogador.getName()) {
				API.sendMsg((CommandSender) jogador, "�7Voc\u00ea n\u00e3o pode banir a si mesmo!");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			if (Config.getConfig().getBans().get("Bans." + vitimaoff.getUniqueId()) != null) {
				API.sendMsg((CommandSender) jogador,
						"�7O jogador �c�l" + vitimaoff.getName() + " �fj\u00e1 est\u00e1 �4�lBANIDO");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			if (Config.getConfig().getIpBans().get("IPBans." + vitimaoff.getUniqueId()) != null) {
				API.sendMsg((CommandSender) jogador,
						"�7O jogador �c�l" + vitimaoff.getName() + " �fj\u00e1 est\u00e1 �4�lBANIDO�e(IP)");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			if (Config.getConfig().getTempBans().get("TempBans." + vitimaoff.getUniqueId()) != null) {
				API.sendMsg((CommandSender) jogador,
						"�7O jogador �c�l" + vitimaoff.getName() + " �7j\u00e1 est\u00e1 �9�lBANIDO�e(tempban).");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			if (vitimaoff.getName() == "FelpsMatch") {
				API.sendMsg((CommandSender) jogador, "�fVoc\u00ea n\u00e3o pode banir o �4�lFelps ;-;");
			}
			String Motivo = "";
			for (int i = 1; i < args.length; ++i) {
				Motivo = String.valueOf(Motivo) + args[i] + " ";
			}
			final double l = Config.getConfig().getBans().getDouble("Players Banidos");
			API.sendBC("�7O Staff �e" + jogador.getName() + " �7baniu �4�lPERMANENTEMENTE �7O Player: �c"
					+ vitimaoff.getName() + "�7. Motivo: �e" + Motivo);
			API.sendMsg((CommandSender) jogador, "�7Voc\u00ea baniu o jogador �c�l" + vitimaoff.getName() + "�f.");
			API.sendStaff("�7O Staffer �e�l" + jogador.getName() + " �7baniu o jogador �c�l" + vitimaoff.getName()
					+ "�f. Motivo: �c�l" + Motivo);
			Config.getConfig().getBans().set("Players Banidos", (Object) (l + 1.0));
			Config.getConfig().getBans().set("Bans." + vitimaoff.getUniqueId() + ".Nome", (Object) vitimaoff.getName());
			Config.getConfig().getBans().set("Bans." + vitimaoff.getUniqueId() + ".Banido por",
					(Object) jogador.getName());
			Config.getConfig().getBans().set("Bans." + vitimaoff.getUniqueId() + ".Motivo", (Object) Motivo);
			Config.getConfig().getBans().set("Bans." + vitimaoff.getUniqueId() + ".Data do banimento",
					(Object) HorarioAPI.getHorario());
			Config.getConfig().saveBans();
			return true;
		} else {
			if (vitima.getName() == jogador.getName()) {
				API.sendMsg((CommandSender) jogador, "�7Voc\u00ea n\u00e3o pode banir a si mesmo!");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			if (Config.getConfig().getBans().get("Bans." + vitima.getUniqueId()) != null) {
				API.sendMsg((CommandSender) jogador,
						"�7O jogador �c�l" + vitima.getName() + " �7j\u00e1 est\u00e1 �4�lBANIDO");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			if (Config.getConfig().getIpBans().get("IPBans." + vitima.getUniqueId()) != null) {
				API.sendMsg((CommandSender) jogador,
						"�7O jogador �c�l" + vitima.getName() + " �7j\u00e1 est\u00e1 �4�lBANIDO�4(IP)");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			if (Config.getConfig().getTempBans().get("TempBans." + vitima.getUniqueId()) != null) {
				API.sendMsg((CommandSender) jogador,
						"�7O jogador �c�l" + vitima.getName() + " �7j\u00e1 est\u00e1 �4�lBANIDO�9(tempban)");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			if (args.length == 1) {
				API.sendMsg((CommandSender) jogador, "�7Utilize /ban (nickname) (motivo)");
				API.sendSound(jogador, Sound.NOTE_PLING, 10);
				return true;
			}
			String Motivo2 = "";
			for (int j = 1; j < args.length; ++j) {
				Motivo2 = String.valueOf(Motivo2) + args[j] + " ";
			}
			final double k = Config.getConfig().getBans().getDouble("Players Banidos");
			API.sendMsg((CommandSender) jogador, "�4�lBAN �7Voc\u00ea baniu o jogador �c�l" + vitima.getName() + "�f.");
			API.sendBC("�6�l" + jogador.getName() + " �fbaniu �c�lPERMANENTEMENTE �7o jogador �c�l" + vitima.getName());
			API.sendStaff("�7O Staffer: �e�l" + jogador.getName() + "�7baniu o jogador �c�l" + vitima.getName()
					+ "�f. Motivo: �c�l" + Motivo2);
			vitima.kickPlayer(
					"�7Voce foi banido do �b�lMAZE �7!\n�7Voc\u00ea foi banido �4�lPERMANENTEMENTE �7do servidor!\n�7Banido: �c�l"
							+ vitima.getName() + "\n" + "�c�l" + jogador.getName() + "\n" + "�7Motivo: �c�l" + Motivo2
							+ "\n" + "�7Expira em: �c�lNUNCA" + "\n" + "�7Data do banimento: �c"
							+ HorarioAPI.getHorario() + "\n" + "�7Compre UNBAN em nossa loja: �eBREVE!");
			vitima.kickPlayer("�7Voce foi banido do �b�lMAZE �7!\n�7Por" + jogador.getName() + "�7No dia "
					+ HorarioAPI.getHorario() + "�7");
			Config.getConfig().getBans().set("Players Banidos", (Object) (k + 1.0));
			Config.getConfig().getBans().set("Bans." + vitima.getUniqueId() + ".Nome", (Object) vitima.getName());
			Config.getConfig().getBans().set("Bans." + vitima.getUniqueId() + ".Banido por",
					(Object) jogador.getName());
			Config.getConfig().getBans().set("Bans." + vitima.getUniqueId() + ".Motivo", (Object) Motivo2);
			Config.getConfig().getBans().set("Bans." + vitima.getUniqueId() + ".Data do banimento",
					(Object) HorarioAPI.getHorario());
			Config.getConfig().saveBans();
			return true;
		}
	}
}
