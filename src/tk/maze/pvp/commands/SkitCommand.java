package tk.maze.pvp.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import tk.maze.pvp.Main;

public class SkitCommand implements CommandExecutor {
	List<String> sKIT;
	HashMap<String, ItemStack> items;

	public SkitCommand() {
		this.sKIT = new ArrayList<String>();
		this.items = new HashMap<String, ItemStack>();
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (!(sender instanceof Player)) {
			Main.getInstance().getLogger().info("§7[§a!§7] §aComandos apenas no servidor!");
			return true;
		}
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("skit")) {
			if (!p.hasPermission("HungerGames.c.Skit")) {
				p.sendMessage("§7[§a?§7] §7Voc\u00c3ª n\u00c3£o possue permiss\u00c3£o para isso!");
				return true;
			}
			if (args.length <= 0) {
				p.sendMessage("§7[§a?§7] §7Use: /skit (apply | create | remove)");
				return true;
			}
			if (args[0].equalsIgnoreCase("create")) {
				if (args.length != 2) {
					p.sendMessage("§7[§a?§7] Use: /skit create <kit>");
					return true;
				}
				final ItemStack[] is = p.getInventory().getContents();
				final ItemStack[] armor = p.getInventory().getArmorContents();
				if (!Main.skit.containsKey(args[1])) {
					Main.skit.put(args[1], is);
					Main.armor.put(args[1], armor);
					p.sendMessage("§7[§a!§7] " + args[1] + "§7 criado com sucesso");
					Bukkit.getLogger().info(String.valueOf(p.getName()) + " Criou o kit " + args[1]);
					return true;
				}
				p.sendMessage("§7[§a?§7] Este kit ja existe");
				return true;
			} else if (args[0].equalsIgnoreCase("apply")) {
				if (args.length == 2) {
					if (Main.skit.containsKey(args[1])) {
						Player[] onlinePlayers;
						for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
							final Player online = onlinePlayers[i];
							if (p != online && !AdminCommand.admin.contains(p)) {
								online.sendMessage("§7[§a!§7] §a" + args[1] + " §7foi aplicado com sucesso");
								online.getInventory().setContents((ItemStack[]) Main.skit.get(args[1]));
								online.getInventory().setArmorContents((ItemStack[]) Main.armor.get(args[1]));
								Bukkit.getLogger()
										.info(String.valueOf(p.getName()) + " Aplicou o kit para todos jogadores");
							}
						}
						p.sendMessage("§7[§a!§7] Kit §a" + args[1] + " §7foi aplicado a todos os players com sucesso");
						p.getInventory().setContents((ItemStack[]) Main.skit.get(args[1]));
						p.getInventory().setArmorContents((ItemStack[]) Main.armor.get(args[1]));
						return true;
					}
					p.sendMessage("§7[§a?§7] Este kit n\u00c3£o existe");
					return true;
				} else {
					if (args.length != 3) {
						p.sendMessage("§7[§a?§7] Use: /skit apply (<player> | all) <kit>");
						return true;
					}
					final Player pl = Bukkit.getPlayer(args[2]);
					if (pl != null) {
						if (Main.skit.containsKey(args[1])) {
							pl.sendMessage("§7[§a!§7] Kit §a" + args[1] + " §7foi aplicado com sucesso");
							if (pl != p) {
								p.sendMessage("§7[§a!§7] Kit §a" + args[1] + " §7foi aplicado com sucesso em §a"
										+ pl.getName());
							}
							pl.getInventory().setContents((ItemStack[]) Main.skit.get(args[1]));
							pl.getInventory().setArmorContents((ItemStack[]) Main.armor.get(args[1]));
							return true;
						}
						p.sendMessage("§7[§a?§7] §7Este kit n\u00c3£o existe");
						return true;
					}
				}
			} else if (args[0].equalsIgnoreCase("remove")) {
				if (args.length != 2) {
					p.sendMessage("§7[§a?§7] §7Use: /skit remove <kit>");
					return true;
				}
				if (Main.skit.containsKey(args[1])) {
					Main.skit.remove(args[1]);
					Main.armor.remove(args[1]);
					p.sendMessage("§7[§a!§7] Kit §a" + args[1] + " §7removido com sucesso");
					return true;
				}
				p.sendMessage("§7[§a?§7] §7Este kit nao existe");
				return true;
			}
		}
		return false;
	}
}
