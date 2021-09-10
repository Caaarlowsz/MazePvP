package tk.maze.pvp.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.API.KitAPI;
import tk.maze.pvp.conf.cfGrupo;
import tk.maze.pvp.conf.cfPermiss\u00e3o;
import tk.maze.pvp.scoreboard.sScoreAPI;

public class KitCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
		final Player p = (Player) Sender;
		Cmd.getName().equalsIgnoreCase("kit");
		if (Args.length == 0) {
			p.sendMessage("�aUtilize /kit (kit)");
			return true;
		}
		if (KitAPI.getKit(p) != "Nenhum") {
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKit(p));
			p.sendMessage("");
			return true;
		}
		if (Args[0].equalsIgnoreCase("pvp")) {
			if (!cfGrupo.ChecarGrupo(p, "Membro") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Light") && !cfGrupo.ChecarGrupo(p, "S-Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Helper") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.light && !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "PvP");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("archer")) {
			if (!cfGrupo.ChecarGrupo(p, "Membro") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Helper")
					&& !cfGrupo.ChecarGrupo(p, "Light") && !cfGrupo.ChecarGrupo(p, "S-Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.light
					&& !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Archer");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("kangaroo")) {
			if (!cfGrupo.ChecarGrupo(p, "Membro") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Helper")
					&& !cfGrupo.ChecarGrupo(p, "Light") && !cfGrupo.ChecarGrupo(p, "S-Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.light
					&& !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Kangaroo");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("fisherman")) {
			if (!cfGrupo.ChecarGrupo(p, "Membro") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Helper")
					&& !cfGrupo.ChecarGrupo(p, "Light") && !cfGrupo.ChecarGrupo(p, "S-Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.light
					&& !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Fisherman");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("cactus")) {
			if (!cfGrupo.ChecarGrupo(p, "Membro") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Helper")
					&& !cfGrupo.ChecarGrupo(p, "Light") && !cfGrupo.ChecarGrupo(p, "S-Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.light
					&& !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Cactus");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("monk")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.monk") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Helper") && !cfGrupo.ChecarGrupo(p, "Light")
					&& !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.light && !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Monk");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("ninja")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.ninja") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Helper")
					&& !cfGrupo.ChecarGrupo(p, "Light") && !cfGrupo.ChecarGrupo(p, "S-Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.light
					&& !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Ninja");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("phantom")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.phantom") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Light")
					&& !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.light && !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Phantom");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("grappler")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.grappler") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Light")
					&& !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.light && !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Grappler");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("viper")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.viper") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Light")
					&& !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.light && !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Viper");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("snail")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.snail") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Light")
					&& !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.light && !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Snail");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("hulk")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.hulk") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.mvp
					&& !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Hulk");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("timelord")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.timelord") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.mvp
					&& !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Timelord");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("thor")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.thor") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Thor");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("switcher")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.switcher") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.mvp && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Switcher");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("gladiator")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.gladiator") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Mvp")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono")
					&& !cfGrupo.ChecarGrupo(p, "Membro") && !GiveAllCommand.fullkit && !GiveAllCommand.mvp
					&& !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Gladiator");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("stomper")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.stomper") && !cfGrupo.ChecarGrupo(p, "Builder+")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Trial")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Stomper");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("magma")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.magma") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Magma");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("grandpa")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.grandpa") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Grandpa");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
		}
		if (Args[0].equalsIgnoreCase("ajnin")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.ajnin") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Admin")
					&& !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit && !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta permiss\u00e3o.");
				return true;
			}
			KitAPI.setKitAntes(p, "Ajnin");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("firelauncher")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.firelauncher") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Gc") && !cfGrupo.ChecarGrupo(p, "Builder")
					&& !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "Mod")
					&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "FireLauncher");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("strong")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.strong") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Youtuber+")
					&& !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Dono") && !GiveAllCommand.fullkit
					&& !GiveAllCommand.pro) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Strong");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		if (Args[0].equalsIgnoreCase("sumo")) {
			if (!cfPermiss\u00e3o.getPermissao(p, "kit.sumo") && !cfGrupo.ChecarGrupo(p, "Pro")
					&& !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Youtuber")
					&& !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")
					&& !cfGrupo.ChecarGrupo(p, "Gerente")
					&& !(cfGrupo.ChecarGrupo(p, "Youtuber+") | (cfGrupo.ChecarGrupo(p, "Admin")
							|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono")
							|| GiveAllCommand.fullkit || GiveAllCommand.pro))) {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui este kit.");
				return true;
			}
			KitAPI.setKitAntes(p, "Sumo");
			p.sendMessage("�7Voc\u00ea selecionou o kit �a" + KitAPI.getKitAntes(p));
			p.sendMessage("");
			sScoreAPI.scoreboard(p);
			if (p.getGameMode() == GameMode.CREATIVE) {
				p.setGameMode(GameMode.SURVIVAL);
			}
		}
		return false;
	}
}
