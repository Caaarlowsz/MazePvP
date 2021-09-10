package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import tk.maze.pvp.bans.API;
import tk.maze.pvp.conf.cfGrupo;

public class InvseeCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (!cmd.getName().equalsIgnoreCase("inv") && !cmd.getName().equalsIgnoreCase("invsee")) {
			return false;
		}
		if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin")
				&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial")
				&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Helper")) {
			p.sendMessage("�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar este comando!");
			return true;
		}
		if (args.length == 0) {
			API.sendMsg((CommandSender) p, "�fUtilize �3�l/invsee �fou �3�l/inv �f(jogador).");
			API.sendSound(p, Sound.NOTE_PLING, 10);
			return true;
		}
		final Player inv = Bukkit.getPlayer(args[0]);
		if (inv == null) {
			p.sendMessage("�cO jogador em quest\u00e3o est\u00e1 offline ou nunca entrou no servidor!");
		}
		p.sendMessage("�eVoc\u00ea abriu o invent\u00e1rio de: �c" + inv.getName());
		tk.maze.pvp.API.API
				.sendWarn("�7�o[" + p.getName() + " �7�oabriu o invent\u00e1rio de " + p.getName() + "�7�o]");
		API.sendSound(p, Sound.NOTE_PLING, 10);
		p.openInventory((Inventory) inv.getInventory());
		return true;
	}
}
