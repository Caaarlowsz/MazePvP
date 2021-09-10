package tk.maze.pvp.habilidades;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

import tk.maze.pvp.API.CooldownAPI;
import tk.maze.pvp.API.KitAPI;

public class Monk implements Listener {
	@EventHandler
	public void monkHabilidade(final PlayerInteractEntityEvent e) {
		final Player p = e.getPlayer();
		if (!(e.getRightClicked() instanceof Player)) {
			return;
		}
		final Player jogadorClicado = (Player) e.getRightClicked();
		if (p.getItemInHand().getType() == Material.BLAZE_ROD && KitAPI.getKit(p) == "Monk"
				&& CooldownAPI.Cooldown.containsKey(p.getName())) {
			e.setCancelled(true);
			p.sendMessage("�fO seu �3�lCOOLDOWN �facaba em: �c�l" + CooldownAPI.Cooldown(p) + "s");
			return;
		}
		if (p.getItemInHand().getType() == Material.BLAZE_ROD && KitAPI.getKit(p) == "Monk"
				&& !CooldownAPI.Cooldown.containsKey(p.getName())) {
			final int random = new Random().nextInt(jogadorClicado.getInventory().getSize() - 10 + 1 + 10);
			final ItemStack ItemSelecionado = jogadorClicado.getInventory().getItem(random);
			final ItemStack ItemMudado = jogadorClicado.getItemInHand();
			jogadorClicado.setItemInHand(ItemSelecionado);
			jogadorClicado.getInventory().setItem(random, ItemMudado);
			jogadorClicado.sendMessage(
					"�cVoc\u00ea acaba de ser monkado. Certifique-se que nada no seu invent\u00e1rio foi alterado!");
			CooldownAPI.addCooldown(p, 35);
		}
	}
}
