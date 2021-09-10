package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import tk.maze.pvp.API.ArraysAPI;
import tk.maze.pvp.API.KitAPI;
import tk.maze.pvp.bans.API;
import tk.maze.pvp.conf.cfGrupo;

public class ClearAllCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin")) {
			API.sendMsg((CommandSender) p,
					"�c�l(!) �cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("clearall")) {
			API.sendMsg((CommandSender) p, "�b�lCLEARALL: �7Voc\u00ea limpou o invent\u00e1rio de todos os jogadores!");
			tk.maze.pvp.API.API.sendWarn("�a�l" + p.getName() + " �7acabou de limpar todos os invent\u00e1rios.");
			Player[] onlinePlayers;
			for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
				final Player todos = onlinePlayers[i];
				if (todos != p && !ArraysAPI.Admin.contains(todos)) {
					todos.getInventory().clear();
					todos.getInventory().setArmorContents((ItemStack[]) null);
					todos.updateInventory();
					KitAPI.removeKits(p);
					tk.maze.pvp.API.API.setWarp(todos, "Spawn");
					return true;
				}
			}
			return true;
		}
		return false;
	}
}
