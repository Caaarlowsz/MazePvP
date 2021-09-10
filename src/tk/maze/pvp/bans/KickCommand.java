package tk.maze.pvp.bans;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.conf.cfGrupo;

public class KickCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		final Player jogador = (Player) sender;
		if (!cmd.getName().equalsIgnoreCase("kick")) {
			return false;
		}
		if (!cfGrupo.ChecarGrupo(jogador, "Dono") && !cfGrupo.ChecarGrupo(jogador, "Gerente")
				&& !cfGrupo.ChecarGrupo(jogador, "Gc") && !cfGrupo.ChecarGrupo(jogador, "Admin")
				&& !cfGrupo.ChecarGrupo(jogador, "Mod+") && !cfGrupo.ChecarGrupo(jogador, "Mod")
				&& !cfGrupo.ChecarGrupo(jogador, "Trial") && !cfGrupo.ChecarGrupo(jogador, "Youtuber+")) {
			API.sendMsg((CommandSender) jogador,
					"§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
			return true;
		}
		if (args.length == 0) {
			API.sendMsg((CommandSender) jogador, "§d§l/kick §d(jogador) (motivo)");
			API.sendSound(jogador, Sound.NOTE_PLING, 10);
			return true;
		}
		final Player vitima = Bukkit.getPlayer(args[0]);
		if (vitima == null) {
			API.sendMsg((CommandSender) jogador,
					"§cO jogador em quest\u00e3o est\u00e1 offline ou nunca entrou no servidor!");
			API.sendSound(jogador, Sound.NOTE_PLING, 10);
			return true;
		}
		if (vitima.getName() == jogador.getName()) {
			API.sendMsg((CommandSender) jogador, "§cVoc\u00ea n\u00e3o pode kikar a si mesmo!");
			API.sendSound(jogador, Sound.NOTE_PLING, 10);
			return true;
		}
		if (args.length == 1) {
			API.sendMsg((CommandSender) jogador, "§d§l/kick §d(jogador) (motivo)");
			API.sendSound(jogador, Sound.NOTE_PLING, 10);
			return true;
		}
		String Motivo = "";
		for (int i = 1; i < args.length; ++i) {
			Motivo = String.valueOf(Motivo) + args[i] + " ";
		}
		API.sendMsg((CommandSender) jogador, "§fVoc\u00ea kickou o jogador §3§l" + vitima.getName() + "§f.");
		API.sendStaff(
				"§f" + jogador.getName() + " kickou o jogador §c§l" + vitima.getName() + "§f. Motivo: §3§l" + Motivo);
		vitima.kickPlayer("§7Voc\u00ea foi §d§lKICKADO §fdo servidor!\n§7Username kickado: §c§l" + vitima.getName()
				+ "\n" + "§7Kickado por: §c§l" + jogador.getName() + "\n" + "§7Motivo: §c§l" + Motivo);
		return true;
	}
}
