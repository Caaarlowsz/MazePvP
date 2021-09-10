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
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class PlacaSopas implements Listener {
	@EventHandler
	public void Escrever(final SignChangeEvent e) {
		if (e.getLine(0).equalsIgnoreCase("sopas")) {
			e.setLine(0, "");
			e.setLine(1, "�c\u279c �7Sopas");
			e.setLine(2, "�c\u279c �7Sopas");
			e.setLine(3, "");
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
			if (lines.length > 0 && lines[0].equals("") && lines.length > 1 && lines[1].equals("�c\u279c �7Sopas")
					&& lines.length > 2 && lines[2].equals("�c\u279c �7Sopas") && lines.length > 3
					&& lines[3].equals("")) {
				final Inventory inv = Bukkit.createInventory((InventoryHolder) p, 54, "�3�lSopas");
				final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
				for (int i = 0; i != 54; ++i) {
					inv.setItem(i, sopa);
				}
				p.openInventory(inv);
			}
		}
	}
}
