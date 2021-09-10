package tk.maze.pvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import tk.maze.pvp.bans.API;
import tk.maze.pvp.conf.cfGrupo;

public class DanoCommand implements CommandExecutor, Listener {
	public static boolean dano;

	static {
		DanoCommand.dano = false;
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		final Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("dano")) {
			if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+")) {
				API.sendMsg((CommandSender) p,
						"§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage("§b§lDANO: §7/dano (on | off)");
				return true;
			}
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("on")) {
					if (DanoCommand.dano) {
						p.sendMessage("§b§lDANO: §7O dano global foi ativado!");
						return true;
					}
					DanoCommand.dano = true;
					p.sendMessage("§b§lDANO: §7Voc\u00ea ATIVOU §fo dano global.");
					Bukkit.broadcastMessage("§b§lDANO: §7O dano global foi ativado por: §6§l " + p.getName());
					return true;
				} else if (args[0].equalsIgnoreCase("off")) {
					if (!DanoCommand.dano) {
						p.sendMessage("§b§lDANO: §7O dano global j\u00e1 est\u00e1 desativado!");
						return true;
					}
					DanoCommand.dano = false;
					p.sendMessage("§b§lDANO: §7Voc\u00ea DESATIVOU o dano global.");
					Bukkit.broadcastMessage("§b§lDANO: §7O dano global foi desativado.");
					return true;
				}
			}
		}
		return false;
	}

	@EventHandler
	public void onDamage(final EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player && !DanoCommand.dano) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void aoDano(final EntityDamageEvent e) {
		if (e.getEntity() instanceof Player && !DanoCommand.dano) {
			e.setCancelled(true);
		}
	}
}
