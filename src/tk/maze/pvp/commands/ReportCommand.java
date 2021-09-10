package tk.maze.pvp.commands;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.Main;
import tk.maze.pvp.API.ChatInterativo;
import tk.maze.pvp.conf.cfGrupo;

public class ReportCommand implements CommandExecutor {
	public ArrayList<String> reported;

	public ReportCommand() {
		this.reported = new ArrayList<String>();
	}

	public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
		final Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("report")) {
			if (Args.length >= 2) {
				final Player target = p.getServer().getPlayer(Args[0]);
				if (target != null) {
					if (this.reported.contains(p.getName())) {
						p.sendMessage("�b�lREPORT: �7Aguarde para reportar novamente.");
						return true;
					}
					if (target == p) {
						return true;
					}
					final String reportMsg = StringUtils.join((Object[]) Arrays.copyOfRange(Args, 1, Args.length), " ");
					this.reported.add(p.getName());
					p.sendMessage(
							"�aO seu reporte foi enviado com sucesso! Assim que poss\u00edvel, um membro da equipe ir\u00e1 verifica-lo.");
					Player[] onlinePlayers;
					for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
						final Player s = onlinePlayers[i];
						if (cfGrupo.ChecarGrupo(s, "Dono") || cfGrupo.ChecarGrupo(s, "Gerente")
								|| cfGrupo.ChecarGrupo(s, "Admin") || cfGrupo.ChecarGrupo(s, "Mod+")
								|| cfGrupo.ChecarGrupo(s, "Mod") || cfGrupo.ChecarGrupo(s, "Trial")
								|| cfGrupo.ChecarGrupo(s, "Youtuber+")) {
							s.getPlayer().playSound(p.getPlayer().getLocation(), Sound.ANVIL_USE, 5.0f, 5.0f);
							s.sendMessage("        �6� �f�lREPORT �6�                     ");
							s.sendMessage("�6�l �fJogador reportado: �7" + target.getName());
							s.sendMessage("�6�l �fReportado por: �7" + p.getName());
							s.sendMessage("�6�l �fMotivo: �7" + reportMsg);
							s.sendMessage("�6�l �fServidor: �7KitPvP ");
							ChatInterativo.Comando(s.getName(),
									"�7Clique �b�l�nAQUI �fpara teleportar at\u00e9 o jogador.",
									"/tp " + target.getName(), "�eClique! �8(bot\u00e3o esquerdo)");
							Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(),
									(Runnable) new Runnable() {
										@Override
										public void run() {
											ReportCommand.this.reported.remove(p.getName());
										}
									}, 300L);
						}
					}
				} else {
					p.sendMessage(
							"�b�lREPORT: �7O jogador em quest\u00e3o est\u00e1 offline ou nunca entrou no servidor!");
				}
			} else {
				p.sendMessage("�b�lREPORT: �7/report (jogador) (motivo)�f!");
			}
		}
		return false;
	}
}
