package tk.maze.pvp.events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.help.HelpTopic;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

import com.github.caaarlowsz.mazemc.kitpvp.MazePvP;
import tk.maze.pvp.API.API;
import tk.maze.pvp.API.ArraysAPI;
import tk.maze.pvp.API.KitAPI;
import tk.maze.pvp.API.TopKillStreak;
import tk.maze.pvp.API.WarpsAPI;
import tk.maze.pvp.bans.Config;
import tk.maze.pvp.commands.AdminCommand;
import tk.maze.pvp.conf.cfGrupo;
import tk.maze.pvp.conf.cfStatus;
\u00e7\u00e3o;
import tk.maze.pvp.scoreboard.sScoreAPI;

public class eEvents implements Listener {
	@EventHandler
	public void login(final PlayerLoginEvent e) {
		final Player p = e.getPlayer();
		final PlayerLoginEvent.Result result = e.getResult();
		e.getResult();
		if (result != PlayerLoginEvent.Result.KICK_WHITELIST) {
			API.checarNameTag(p);
		}
	}

	@EventHandler
	public void join(final PlayerJoinEvent e) {
		e.setJoinMessage((String) null);
		final Player p = e.getPlayer();
		Config.getConfig().getJogadores().set("Jogadores." + p.getUniqueId() + ".Nome", (Object) p.getName());
		Config.getConfig().getJogadores().set("Jogadores." + p.getUniqueId() + ".Grupo",
				cfGrupo.pegargrupo().get("grupos." + p.getUniqueId() + ".grupo"));
		Config.getConfig().getJogadores().set("Jogadores." + p.getUniqueId() + ".Coins", (Object) cfStatus.getMoney(p));
		Config.getConfig().getJogadores().set("Jogadores." + p.getUniqueId() + ".Kills", (Object) cfStatus.getKills(p));
		Config.getConfig().getJogadores().set("Jogadores." + p.getUniqueId() + ".Deaths",
				(Object) cfStatus.getDeaths(p));
		Config.getConfig().saveJogadores();
		p.setWalkSpeed(0.2f);
		Prote\u00e7\u00e3o.setImortal(p, true);
		Prote\u00e7\u00e3o.isImortal(p);
		p.getInventory().clear();
		p.getInventory().setArmorContents((ItemStack[]) null);
		p.setGameMode(GameMode.ADVENTURE);
		sScoreAPI.Score.add(p);
		ArraysAPI.Jogando.add(p);
		ArraysAPI.Admin.remove(p);
		API.setWarp(p, "Spawn");
		WarpsAPI.Ir(p, "Spawn");
		API.mandarTitulo(p, "�b�lBROWK�f�lPVP");
		API.mandarSubTitulo(p, "�eSeja bem vindo ao �6�lKITPVP");
		API.checarPermissao(p);
		API.checarGrupo(p);
		API.corGrupo(p);
		API.checarConfig(p);
		API.checarAlgumasCoisas(p);
		API.setarKitPadrao(p);
		ArraysAPI.CooldownChat.remove(p);
		KitAPI.removeKits(p);
		AdminCommand.checarAdmin();
		cfStatus.FirstJoin(p);
		p.removePotionEffect(PotionEffectType.SPEED);
		p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
		p.setHealth(20.0);
		p.setMaxHealth(20.0);
		sScoreAPI.scoreboard(p);
		Bukkit.getScheduler().scheduleSyncDelayedTask(MazePvP.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				API.sendItems(p);
			}
		}, 1L);
		for (int i = 1; i < 100; ++i) {
		}
		if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin")
				&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial")
				&& !cfGrupo.ChecarGrupo(p, "Youtuber+")) {
			cfGrupo.ChecarGrupo(p, "Helper");
		}
		TopKillStreak.Ks.put(p, 0);
		Player[] onlinePlayers;
		for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, j = 0; j < length; ++j) {
			final Player players = onlinePlayers[j];
			TopKillStreak.KsTop.put(p, TopKillStreak.getKsTop(players));
			TopKillStreak.Name.put(p, TopKillStreak.getNameTop(players));
		}
		if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente")) {
			ArraysAPI.Monitor.add(p);
		}
		ArraysAPI.CooldownChat.remove(p);
	}

	@EventHandler
	public void death(final PlayerDeathEvent e) {
		final Player p = e.getEntity();
		final Player d = e.getEntity().getKiller();
		WarpsAPI.Ir(p, "Spawn");
		API.setWarp(p, "Spawn");
		Bukkit.getScheduler().scheduleSyncDelayedTask(MazePvP.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				p.spigot().respawn();
			}
		}, 1L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(MazePvP.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				API.sendItems(p);
			}
		}, 2L);
		if (KitAPI.getKit(p) != "1v1") {
			WarpsAPI.Ir(p, "Spawn");
			API.setWarp(p, "Spawn");
			KitAPI.removeKits(p);
			if (d != null) {
				p.sendMessage("�b�lMORREU: �7Voc\u00ea morreu para: �c�l" + d.getName());
				d.sendMessage("�b�lMATOU: �7Voc\u00ea matou o : �a�l" + p.getName());
				final ItemStack Peito = new ItemStack(Material.IRON_CHESTPLATE);
				final ItemMeta kPeito = Peito.getItemMeta();
				Peito.setItemMeta(kPeito);
				final short k = Peito.getDurability();
				final ItemStack Peito2 = new ItemStack(Material.IRON_LEGGINGS);
				final ItemMeta kPeito2 = Peito2.getItemMeta();
				Peito2.setItemMeta(kPeito2);
				final short k2 = Peito.getDurability();
				final ItemStack Peito3 = new ItemStack(Material.IRON_BOOTS);
				final ItemMeta kPeito3 = Peito3.getItemMeta();
				Peito3.setItemMeta(kPeito3);
				final short k3 = Peito.getDurability();
				final ItemStack Peito4 = new ItemStack(Material.IRON_HELMET);
				final ItemMeta kPeito4 = Peito4.getItemMeta();
				Peito4.setItemMeta(kPeito4);
				final short k4 = Peito.getDurability();
				p.getInventory().getChestplate().setDurability(k);
				p.getInventory().getLeggings().setDurability(k2);
				p.getInventory().getBoots().setDurability(k3);
				p.getInventory().getHelmet().setDurability(k4);
				cfStatus.setKills(d);
				cfStatus.setDeaths(p);
				cfStatus.setMoney(d, 5);
				cfStatus.RemoveMoney(p, 2);
				cfStatus.RemoverKS(p);
				TopKillStreak.createTopKillStreak(d);
				sScoreAPI.scoreboard(p);
				sScoreAPI.scoreboard(d);
				e.setDeathMessage((String) null);
				e.getDrops().clear();
				if (TopKillStreak.getKsTop(p) == 5) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l5");
				}
				if (TopKillStreak.getKsTop(p) == 10) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l10");
				}
				if (TopKillStreak.getKsTop(p) == 15) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l15");
				}
				if (TopKillStreak.getKsTop(p) == 20) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l20");
				}
				if (TopKillStreak.getKsTop(p) == 25) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l25");
				}
				if (TopKillStreak.getKsTop(p) == 30) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l30");
				}
				if (TopKillStreak.getKsTop(p) == 35) {
					Bukkit.broadcastMessage("�e�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l35");
				}
				if (TopKillStreak.getKsTop(p) == 40) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l40");
				}
				if (TopKillStreak.getKsTop(p) == 45) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l45");
				}
				if (TopKillStreak.getKsTop(p) == 50) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l50");
				}
				if (TopKillStreak.getKsTop(p) == 55) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l55");
				}
				if (TopKillStreak.getKsTop(p) == 60) {
					Bukkit.broadcastMessage("�e�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l60");
				}
				if (TopKillStreak.getKsTop(p) == 65) {
					Bukkit.broadcastMessage("�e�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l65");
				}
				if (TopKillStreak.getKsTop(p) == 70) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l70");
				}
				if (TopKillStreak.getKsTop(p) == 75) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l75");
				}
				if (TopKillStreak.getKsTop(p) == 80) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l80");
				}
				if (TopKillStreak.getKsTop(p) == 85) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l85");
				}
				if (TopKillStreak.getKsTop(p) == 90) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l90");
				}
				if (TopKillStreak.getKsTop(p) == 95) {
					Bukkit.broadcastMessage("�b�l" + d.getName() + " �7est\u00e1 com um killstreak de �a�l95");
				}
				if (TopKillStreak.getKsTop(p) == 100) {
					Bukkit.broadcastMessage(
							"�b�l" + d.getName() + " �6alcan\u00e7ou o �6�lKILLSTREAK �fm\u00e1ximo de �a�l100�f!");
				} else {
					e.setDeathMessage((String) null);
					e.getDrops().clear();
					TopKillStreak.Ks.put(p, 0);
					Player[] onlinePlayers;
					for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
						final Player players = onlinePlayers[i];
						TopKillStreak.createTopKillStreak(players);
					}
				}
			}
		}
	}

	@EventHandler
	public void quit(final PlayerQuitEvent e) {
		final Player p = e.getPlayer();
		ArraysAPI.Jogando.remove(p);
		KitAPI.removeKits(p);
		e.setQuitMessage((String) null);
	}

	@EventHandler
	public void cmdnotfound(final PlayerCommandPreprocessEvent e) {
		if (e.isCancelled()) {
			return;
		}
		final Player p = e.getPlayer();
		final String msg = e.getMessage().split(" ")[0];
		final HelpTopic t = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
		if (t == null) {
			e.setCancelled(true);
			p.sendMessage("�7Este comando nao existe!");
		}
	}

	@EventHandler
	void BuildConstruct(final BlockPlaceEvent evento) {
		final Player jogador = evento.getPlayer();
		if (jogador.getGameMode() != GameMode.CREATIVE) {
			evento.setCancelled(true);
		} else {
			evento.setCancelled(false);
		}
	}

	@EventHandler
	void BuildBreak(final BlockBreakEvent evento) {
		final Player jogador = evento.getPlayer();
		if (jogador.getGameMode() != GameMode.CREATIVE) {
			evento.setCancelled(true);
		} else if (jogador.getItemInHand().getTypeId() == 268 || jogador.getItemInHand().getTypeId() == 272
				|| jogador.getItemInHand().getTypeId() == 267 || jogador.getItemInHand().getTypeId() == 276
				|| jogador.getItemInHand().getTypeId() == 283) {
			evento.setCancelled(true);
		} else {
			evento.setCancelled(false);
		}
	}
}
