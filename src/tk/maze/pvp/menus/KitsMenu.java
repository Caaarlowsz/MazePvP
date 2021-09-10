package tk.maze.pvp.menus;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import tk.maze.pvp.commands.GiveAllCommand;
import tk.maze.pvp.conf.cfGrupo;
import tk.maze.pvp.conf.cfPermiss\u00e3o;

public class KitsMenu {
	public static ItemStack possui;
	public static ItemMeta possuim;
	public static ItemStack vidro;
	public static ItemMeta vidrom;
	public static ItemStack loja;
	public static ItemMeta lojam;

	public static ItemStack criarItemMenu(final Material material, final String nome, final String[] habilidade) {
		final ItemStack item = new ItemStack(material);
		final ItemMeta kitem = item.getItemMeta();
		kitem.setDisplayName(nome);
		kitem.setLore(Arrays.asList(habilidade));
		item.setItemMeta(kitem);
		return item;
	}

	public static void inventory(final Player p) {
		final Inventory menu = Bukkit.createInventory((InventoryHolder) p, 54, "�bKits");
		final ItemStack kits = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
		final ItemMeta kkits = kits.getItemMeta();
		kkits.setDisplayName("�b�lKits");
		kits.setItemMeta(kkits);
		final ItemStack lojadekits = new ItemStack(Material.getMaterial(54));
		final ItemMeta klojadekits = lojadekits.getItemMeta();
		klojadekits.setDisplayName("�2�lLOJA DE KITS");
		lojadekits.setItemMeta(klojadekits);
		final ItemStack possui = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
		final ItemMeta possuim = possui.getItemMeta();
		possuim.setDisplayName("�aKits que voc\u00ea possui !");
		possui.setItemMeta(possuim);
		final ItemStack vidro = new ItemStack(Material.getMaterial(102));
		final ItemMeta vidrom = vidro.getItemMeta();
		vidrom.setDisplayName("");
		vidro.setItemMeta(vidrom);
		menu.setItem(0, vidro);
		menu.setItem(1, vidro);
		menu.setItem(2, vidro);
		menu.setItem(3, possui);
		menu.setItem(4, kits);
		menu.setItem(5, kits);
		menu.setItem(6, vidro);
		menu.setItem(7, vidro);
		menu.setItem(8, vidro);
		if (cfGrupo.ChecarGrupo(p, "Membro") || cfGrupo.ChecarGrupo(p, "Builder+") || cfGrupo.ChecarGrupo(p, "Gc")
				|| cfGrupo.ChecarGrupo(p, "Builder") || cfGrupo.ChecarGrupo(p, "Helper")
				|| cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "S-Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
				|| cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.light || GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.STONE_SWORD, "�b�lPvP",
					new String[] { "�7Derrote seus advers\u00e1rios ", "�7utilizando sua espada avan\u00e7ada" }) });
		}
		if (cfGrupo.ChecarGrupo(p, "Membro") || cfGrupo.ChecarGrupo(p, "Builder+") || cfGrupo.ChecarGrupo(p, "Gc")
				|| cfGrupo.ChecarGrupo(p, "Builder") || cfGrupo.ChecarGrupo(p, "Helper")
				|| cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "S-Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
				|| cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.light || GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.BOW, "�b�lArcher",
					new String[] { "�7Acabe com os oponentes usando", "�7seu arco!" }) });
		}
		if (cfGrupo.ChecarGrupo(p, "Membro") || cfGrupo.ChecarGrupo(p, "Builder+") || cfGrupo.ChecarGrupo(p, "Gc")
				|| cfGrupo.ChecarGrupo(p, "Builder") || cfGrupo.ChecarGrupo(p, "Helper")
				|| cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "S-Pro")
				|| cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.light || GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.FIREWORK, "�b�lKangaroo",
					new String[] { "�7D\u00ea saltos como um", "�7canguru utilizando seu item" }) });
		}
		if (cfGrupo.ChecarGrupo(p, "Membro") || cfGrupo.ChecarGrupo(p, "Builder+") || cfGrupo.ChecarGrupo(p, "Gc")
				|| cfGrupo.ChecarGrupo(p, "Builder") || cfGrupo.ChecarGrupo(p, "Helper")
				|| cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "S-Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
				|| cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.light || GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.FISHING_ROD, "�b�lFisherman",
					new String[] { "�7Pesque o seu advers\u00e1rio e fa\u00e7a estrat\u00e9gias!" }) });
		}
		if (cfGrupo.ChecarGrupo(p, "Membro") || cfGrupo.ChecarGrupo(p, "Builder+") || cfGrupo.ChecarGrupo(p, "Gc")
				|| cfGrupo.ChecarGrupo(p, "Builder") || cfGrupo.ChecarGrupo(p, "Helper")
				|| cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "S-Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
				|| cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.light || GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.CACTUS, "�b�lCactus",
					new String[] { "�7Vire um cacto e", "�7espete seus inimigos!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.monk") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Helper") || cfGrupo.ChecarGrupo(p, "Light")
				|| cfGrupo.ChecarGrupo(p, "S-Pro") || cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Pro")
				|| cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Trial")
				|| cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.light
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.BLAZE_ROD, "�b�lMonk",
					new String[] { "�7Fa\u00e7a altera\u00e7\u00f5es no invent\u00e1rio", "�7dos seus oponentes!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.ninja") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Helper") || cfGrupo.ChecarGrupo(p, "Light")
				|| cfGrupo.ChecarGrupo(p, "S-Pro") || cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Pro")
				|| cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Trial")
				|| cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.light
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.COMPASS, "�b�lNinja",
					new String[] { "�7Teleporte-se at\u00e9 o", "�7\u00faltimo jogador hitado clicando Shift!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.phantom") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "S-Pro")
				|| cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod")
				|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.light
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.FEATHER, "�b�lPhantom",
					new String[] { "�7Utilize sua pena para", "�7voar como um p\u00e1ssaro!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.grappler") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "S-Pro")
				|| cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod")
				|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.light
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.LEASH, "�b�lGrappler",
					new String[] { "�7Escale paredes utilizando", "�7sua corda m\u00e1gica!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.viper") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "S-Pro")
				|| cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod")
				|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.light
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.SPIDER_EYE, "�b�lViper",
					new String[] { "�7Aplique veneno em seus", "�7advers\u00e1rios ao entra em combate!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.snail") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "S-Pro")
				|| cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod")
				|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.light
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.STRING, "�b�lSnail",
					new String[] { "�7Aplique lentid\u00e3o profunda", "�7e ganhe vantagem!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.hulk") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "S-Pro")
				|| cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.SADDLE, "�b�lHulk",
					new String[] { "�7Puxe seus inimigos para cima", "�7e os detenha!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.timelord") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "S-Pro")
				|| cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.WATCH, "�b�lTimelord",
					new String[] { "�7Congele os players de", "�7sua volta" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.thor") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Pro")
				|| cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Trial")
				|| cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.mvp
				|| GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.WOOD_AXE, "�b�lThor",
					new String[] { "�7Vire o thor e lan\u00e7e raios", "�7em seus inimigos" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.switcher") || cfGrupo.ChecarGrupo(p, "Mvp")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.mvp || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.SNOW_BALL, "�b�lSwitcher",
					new String[] { "�7Troque de lugar com seus inimigos ao", "�7acertar uma bola de neve nele" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.gladiator") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Pro")
				|| cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Trial")
				|| cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.mvp
				|| GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.IRON_FENCE, "�b�lGladiator",
					new String[] { "�7Puxe seus inimigos para um", "�7duelo nas alturas!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.stomper") || cfGrupo.ChecarGrupo(p, "Builder+")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
				|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+")
				|| cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Youtuber+")
				|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit
				|| GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.IRON_BOOTS, "�b�lStomper",
					new String[] { "�7Transfira seu dano de", "�7queda para seus inimigos ao pular neles." }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.magma") || cfGrupo.ChecarGrupo(p, "Pro")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Trial")
				|| cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.FIRE, "�b�lMagma",
					new String[] { "�7Receba 30% de chance de queimar", "�7seus inimigos!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.grandpa") || cfGrupo.ChecarGrupo(p, "Pro")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Trial")
				|| cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.STICK, "�b�lGrandpa",
					new String[] { "�7Jogue seus inimigos para longe", "�7utilizando seu graveto!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.ajnin") || cfGrupo.ChecarGrupo(p, "Pro")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Trial")
				|| cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.NETHER_STAR, "�b�lAjnin",
					new String[] { "�7Puxe o \u00faltimo jogador hitado", "�7at\u00e9 voc\u00ea clicando shift!" }) });
		}
		if (cfPermiss\u00e3o.getPermissao(p, "kit.firelauncher") || cfGrupo.ChecarGrupo(p, "Pro")
				|| cfGrupo.ChecarGrupo(p, "Gc") || cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Trial")
				|| cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
				|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Admin")
				|| cfGrupo.ChecarGrupo(p, "Dono") || GiveAllCommand.fullkit || GiveAllCommand.pro) {
			menu.addItem(new ItemStack[] { criarItemMenu(Material.FIREBALL, "�b�lFirelauncher",
					new String[] { "�7Utilize a sua habilidade para", "�7queimar seus inimigos" }) });
		}
		p.openInventory(menu);
	}
}
