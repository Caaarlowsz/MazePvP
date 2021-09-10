package tk.maze.pvp.menus;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import tk.maze.pvp.API.API;

public class MenuMenu implements Listener {
	public static ItemStack criarItemMenu(final Material material, final String nome, final String[] habilidade) {
		final ItemStack item = new ItemStack(material);
		final ItemMeta kitem = item.getItemMeta();
		kitem.setDisplayName(nome);
		kitem.setLore(Arrays.asList(habilidade));
		item.setItemMeta(kitem);
		return item;
	}

	public static void setarInventario(final Player p) {
		final Inventory menu = Bukkit.createInventory((InventoryHolder) p, 9, "�7Qual �6[VIP] �7deseja?");
		menu.setItem(2, criarItemMenu(Material.EMERALD_BLOCK, "�a�lYOUTUBER", new String[0]));
		menu.setItem(4, criarItemMenu(Material.GOLD_BLOCK, "�6�lPREMIUM", new String[0]));
		menu.setItem(6, criarItemMenu(Material.LAPIS_BLOCK, "�d�lULTIMATE", new String[0]));
		p.openInventory(menu);
	}

	@EventHandler
	public void abrirInv(final PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		if ((p.getItemInHand().getType() == Material.DIAMOND && API.getWarp(p) == "Spawn"
				&& e.getAction() == Action.RIGHT_CLICK_AIR)
				|| (e.getAction() == Action.RIGHT_CLICK_BLOCK && p.getItemInHand().hasItemMeta()
						&& p.getItemInHand().getItemMeta().hasDisplayName()
						&& p.getItemInHand().getItemMeta().getDisplayName().equals("�6� �7Loja"))) {
			setarInventario(p);
		}
	}

	@EventHandler
	public void clicarInv(final InventoryClickEvent e) {
		final Player p = (Player) e.getWhoClicked();
		if (e.getCurrentItem().getType() == Material.EMERALD_BLOCK) {
			e.setCancelled(true);
			p.closeInventory();
			p.sendMessage(" ");
			p.sendMessage(" �7\u25ff �7�lBeneficios �7\u25ff ");
			p.sendMessage(" ");
			p.sendMessage("�7TAG �a�lLIGHT �7NO SERVIDOR");
			p.sendMessage("�7SLOT RESERVADO");
			p.sendMessage("�7ACESSO A 11KITS ");
			p.sendMessage(" ");
			p.sendMessage("�7Para comprar o �a�lLIGHT �7acesse o site: �6�lEM BREVE!");
			p.sendMessage(" ");
		}
		if (e.getCurrentItem().getType() == Material.GOLD_BLOCK) {
			e.setCancelled(true);
			p.closeInventory();
			p.sendMessage(" ");
			p.sendMessage(" �7\u25ff �7�lBeneficios �7\u25ff ");
			p.sendMessage(" ");
			p.sendMessage("�7TAG �6�lPREMIUM �7NO SERVIDOR");
			p.sendMessage("�7SLOT RESERVADO");
			p.sendMessage("�7ACESSO A 16KITS ");
			p.sendMessage(" ");
			p.sendMessage("�7Para comprar o �6�lPREMIUM �7acesse o site: �6�lEM BREVE!");
			p.sendMessage(" ");
		}
		if (e.getCurrentItem().getType() == Material.LAPIS_BLOCK) {
			e.setCancelled(true);
			p.closeInventory();
			p.sendMessage(" ");
			p.sendMessage(" �7\u25ff �7�lBeneficios �7\u25ff ");
			p.sendMessage(" ");
			p.sendMessage("�7TAG �d�lULTIMATE �7NO SERVIDOR");
			p.sendMessage("�7SLOT RESERVADO");
			p.sendMessage("�7ACESSO A TODOS OS KITS");
			p.sendMessage(" ");
			p.sendMessage("�7Para comprar o �d�lULTIMATE �7acesse o site: �6�lEM BREVE");
			p.sendMessage(" ");
		}
	}
}
