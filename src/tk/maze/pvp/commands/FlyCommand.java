package tk.maze.pvp.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.API.API;
import tk.maze.pvp.conf.cfGrupo;

public class FlyCommand implements CommandExecutor {
	public static ArrayList<Player> Fly;

	static {
		FlyCommand.Fly = new ArrayList<Player>();
	}

	public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
		final Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("fly")) {
			if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Helper")) {
				p.sendMessage("�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
				return true;
			}
			if (Args.length == 0 && API.getWarp(p) == "Spawn") {
				if (!FlyCommand.Fly.contains(p)) {
					p.sendMessage("�b�lFLY: �7Voc\u00ea ATIVOU o seu modo Fly!");
					p.setAllowFlight(true);
					FlyCommand.Fly.add(p);
					return true;
				}
				p.sendMessage("�b�lFLY: �7Voc\u00ea DESATIVOU o seu modo Fly!");
				p.setAllowFlight(false);
				FlyCommand.Fly.remove(p);
				return false;
			} else {
				if (API.getWarp(p) != "Spawn") {
					p.sendMessage("�cVoc\u00ea n\u00e3o pode ativar seu fly aqui");
					return true;
				}
				if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente")) {
					p.sendMessage("�b�lFLY: �7Voc\u00ea n\u00e3o possui permiss\u00e3o para utilizar este comando!");
					return true;
				}
				final Player target = Bukkit.getPlayer(Args[0]);
				if (target == null || !(target instanceof Player)) {
					p.sendMessage(
							"�b�lFLY: �7O jogador em quest\u00e3o est\u00e1 offline ou nunca entrou no servidor!");
					return true;
				}
				if (!FlyCommand.Fly.contains(target)) {
					target.sendMessage("�b�lFLY: �7O seu modo Fly foi ativado por �a�l" + p.getName());
					p.sendMessage("�b�lFLY: �7Voc\u00ea ativou o modo Fly para o jogador �e�l" + target.getName());
					FlyCommand.Fly.add(target);
					target.setAllowFlight(true);
				} else {
					target.sendMessage("�b�lFLY: �7O seu modo Fly foi desativado por �c�l" + p.getName());
					p.sendMessage("�b�lFLY: �7Voc\u00ea desativou o modo Fly para o jogador �e�l" + target.getName());
					FlyCommand.Fly.remove(target);
					target.setAllowFlight(false);
				}
			}
		}
		return false;
	}
}
