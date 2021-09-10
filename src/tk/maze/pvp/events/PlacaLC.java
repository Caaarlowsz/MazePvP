package tk.maze.pvp.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import tk.maze.pvp.API.API;
import tk.maze.pvp.API.KitAPI;
import tk.maze.pvp.API.WarpsAPI;
import tk.maze.pvp.conf.cfStatus;
import tk.maze.pvp.scoreboard.sScoreAPI;

public class PlacaLC implements Listener {
	@EventHandler
	public void Escrever(final SignChangeEvent e) {
		if (e.getLine(0).equalsIgnoreCase("facil")) {
			e.setLine(0, "");
			e.setLine(1, "§6§lCHALLENGE");
			e.setLine(2, "");
			e.setLine(3, "§7(F\u00e1cil)");
		}
		if (e.getLine(0).equalsIgnoreCase("medio")) {
			e.setLine(0, "");
			e.setLine(1, "§9§lComplete");
			e.setLine(2, "");
			e.setLine(3, "§7(M\u00e9dio)");
		}
		if (e.getLine(0).equalsIgnoreCase("dificil")) {
			e.setLine(0, "");
			e.setLine(1, "§6§lCHALLENGE");
			e.setLine(2, "");
			e.setLine(3, "§7(Dif\u00edcil)");
		}
		if (e.getLine(0).equalsIgnoreCase("extremo")) {
			e.setLine(0, "");
			e.setLine(1, "§6§lCHALLENGE");
			e.setLine(2, "");
			e.setLine(3, "§7(Extremo)");
		}
	}

	@EventHandler
	public void inv(final PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getClickedBlock() != null
				&& (e.getClickedBlock().getType() == Material.WALL_SIGN
						|| e.getClickedBlock().getType() == Material.SIGN_POST)) {
			final Sign s = (Sign) e.getClickedBlock().getState();
			final String[] lines = s.getLines();
			if (lines.length > 0 && lines[0].equals("") && lines.length > 1 && lines[1].equals("§6§lCHALLENGE")
					&& lines.length > 2 && lines[2].equals("") && lines.length > 3 && lines[3].equals("§7(F\u00e1cil)")
					&& API.getWarp(p) == "Challenge") {
				p.sendMessage("§b§lLAVA §7Voc\u00ea completou o §6§lLavaChallenge §ff\u00e1cil!");
				cfStatus.setMoney(p, 20);
				p.getInventory().clear();
				p.getInventory().setArmorContents((ItemStack[]) null);
				KitAPI.removeKits(p);
				WarpsAPI.Ir(p, "Challenge");
				API.setWarp(p, "Challenge");
				KitAPI.setKitAntes(p, "Challenge");
				final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
				for (int i = 0; i < 36; ++i) {
					p.getInventory().setItem(i, sopa);
					p.updateInventory();
				}
				p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short) 0));
				p.getInventory().setItem(14,
						API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short) 0));
				p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short) 0));
				sScoreAPI.scoreboard(p);
				p.sendMessage("§b§lLAVA §7Voc\u00ea ganhou §9§l20XP§f.");
			}
			if (lines.length > 0 && lines[0].equals("") && lines.length > 1 && lines[1].equals("§6§lCHALLENGE")
					&& lines.length > 2 && lines[2].equals("") && lines.length > 3 && lines[3].equals("§7(M\u00e9dio)")
					&& API.getWarp(p) == "Challenge") {
				p.sendMessage("§b§lLAVA §7Voc\u00ea completou o §6§lLavaChallenge §fm\u00e9dio!");
				cfStatus.setMoney(p, 40);
				p.getInventory().clear();
				p.getInventory().setArmorContents((ItemStack[]) null);
				KitAPI.removeKits(p);
				WarpsAPI.Ir(p, "Challenge");
				API.setWarp(p, "Challenge");
				KitAPI.setKitAntes(p, "Challenge");
				final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
				for (int i = 0; i < 36; ++i) {
					p.getInventory().setItem(i, sopa);
					p.updateInventory();
				}
				p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short) 0));
				p.getInventory().setItem(14,
						API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short) 0));
				p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short) 0));
				sScoreAPI.scoreboard(p);
				p.sendMessage("§b§lLAVA §7Voc\u00ea ganhou §9§l40XP§f.");
			}
			if (lines.length > 0 && lines[0].equals("") && lines.length > 1 && lines[1].equals("§6§lCHALLENGE")
					&& lines.length > 2 && lines[2].equals("") && lines.length > 3
					&& lines[3].equals("§7(Dif\u00edcil)") && API.getWarp(p) == "Challenge") {
				p.sendMessage("§b§lLAVA §7Voc\u00ea completou o §6§lLavaChallenge §fdif\u00edcil!");
				cfStatus.setMoney(p, 120);
				p.getInventory().clear();
				p.getInventory().setArmorContents((ItemStack[]) null);
				KitAPI.removeKits(p);
				WarpsAPI.Ir(p, "Challenge");
				API.setWarp(p, "Challenge");
				KitAPI.setKitAntes(p, "Challenge");
				final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
				for (int i = 0; i < 36; ++i) {
					p.getInventory().setItem(i, sopa);
					p.updateInventory();
				}
				p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short) 0));
				p.getInventory().setItem(14,
						API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short) 0));
				p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short) 0));
				sScoreAPI.scoreboard(p);
				p.sendMessage("§b§lLAVA §7Voc\u00ea ganhou §9§l120XP§f.");
			}
			if (lines.length > 0 && lines[0].equals("") && lines.length > 1 && lines[1].equals("§6§lCHALLENGE")
					&& lines.length > 2 && lines[2].equals("") && lines.length > 3 && lines[3].equals("§7(Extremo)")
					&& API.getWarp(p) == "Challenge") {
				p.sendMessage("§b§lLAVA §7Voc\u00ea completou o §6§lLavaChallenge §fExtremo");
				Bukkit.broadcastMessage(" ");
				Bukkit.broadcastMessage("§b§lLAVA §7Parabens §c§l" + p.getName()
						+ " §7Por Completou o n\u00edvel §e§lExtremo §fdo §6§lLavaChallenge§f!");
				Bukkit.broadcastMessage(" ");
				cfStatus.setMoney(p, 300);
				p.getInventory().clear();
				p.getInventory().setArmorContents((ItemStack[]) null);
				KitAPI.removeKits(p);
				WarpsAPI.Ir(p, "Challenge");
				API.setWarp(p, "Challenge");
				KitAPI.setKitAntes(p, "Challenge");
				final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
				for (int i = 0; i < 36; ++i) {
					p.getInventory().setItem(i, sopa);
					p.updateInventory();
				}
				p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short) 0));
				p.getInventory().setItem(14,
						API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short) 0));
				p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short) 0));
				sScoreAPI.scoreboard(p);
				p.sendMessage("§b§lLAVA §7Voc\u00ea ganhou §9§l300XP§f.");
				p.sendMessage("§b§lLAVA §7Voc\u00ea ganhou o kit §9§lFirelauncher§f!");
			}
		}
	}
}
