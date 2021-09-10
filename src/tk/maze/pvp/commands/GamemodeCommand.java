package tk.maze.pvp.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.API.API;
import tk.maze.pvp.conf.cfGrupo;

public class GamemodeCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
		final Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("gamemode") || Cmd.getName().equalsIgnoreCase("gm")) {
			if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Gc")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+")) {
				p.sendMessage("�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
				return true;
			}
			if (Args.length == 0) {
				p.sendMessage("�b�lGAMEMODE: �7/gamemode �c�l(0 | 1) ou /gm �c�l(0 | 1)");
				return true;
			}
			if (Args[0].equalsIgnoreCase("1")) {
				p.setGameMode(GameMode.CREATIVE);
				p.sendMessage("�b�lGAMEMODE: �7O seu GAMEMODE foi alterado para o modo CRIATIVO");
				API.sendWarn("�7�o[�7�o" + p.getName() + " �7�oentrou no modo CRIATIVO]");
			}
			if (Args[0].equalsIgnoreCase("0")) {
				p.setGameMode(GameMode.SURVIVAL);
				p.sendMessage("�b�lGAMEMODE: �7O seu GAMEMODE foi alterado para o modo SOBREVIVENCIA");
				API.sendWarn("�7�o[�7�o" + p.getName() + " �7�oentrou no modo SOBREVIVENCIA]");
			}
		}
		return false;
	}
}
