package tk.maze.pvp.habilidades;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import com.github.caaarlowsz.mazemc.kitpvp.MazePvP;
import tk.maze.pvp.API.CooldownAPI;
import tk.maze.pvp.API.KitAPI;

public class Ajnin implements Listener {
	public static HashMap<Player, Player> a;

	static {
		Ajnin.a = new HashMap<Player, Player>();
	}

	@EventHandler
	public void a(final EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
			final Player hitou = (Player) e.getDamager();
			final Player hitado = (Player) e.getEntity();
			if (KitAPI.getKit(hitou) == "Ajnin" && !Ajnin.a.containsKey(hitou)) {
				Ajnin.a.put(hitou, hitado);
				Bukkit.getScheduler().scheduleSyncDelayedTask(MazePvP.getPlugin(), (Runnable) new Runnable() {
					@Override
					public void run() {
						Ajnin.a.remove(hitou);
						Ajnin.a.remove(hitado);
					}
				}, 220L);
			}
		}
	}

	@EventHandler
	public void a(final PlayerToggleSneakEvent e) {
		final Player hitou = e.getPlayer();
		if (e.isSneaking() && KitAPI.getKit(hitou) == "Ajnin" && CooldownAPI.Cooldown.containsKey(hitou.getName())) {
			hitou.sendMessage("�fO seu �3�lCOOLDOWN �facaba em: �c�l" + CooldownAPI.Cooldown(hitou) + "s");
			return;
		}
		if (e.isSneaking() && KitAPI.getKit(hitou) == "Ajnin" && Ajnin.a.containsKey(hitou)) {
			final Player hitado = Ajnin.a.get(hitou);
			if (hitado != null) {
				if (Gladiator.noExecut.contains(hitado)) {
					hitou.sendMessage("�cEste jogador est\u00e1 em um duelo nas alturas!");
					return;
				}
				if (Gladiator.noExecut.contains(hitou)) {
					hitou.sendMessage("�cVoc\u00ea n\u00e3o pode utilizar o kit Ninja durante um duelo no Gladiator!");
					return;
				}
				if (hitou.getLocation().distance(hitado.getLocation()) < 40.0) {
					hitado.teleport(hitou.getLocation());
					CooldownAPI.addCooldown(hitou, 7);
				} else {
					hitou.sendMessage("�cO \u00faltimo jogador hitado est\u00e1 muito longe!");
				}
			}
		}
	}
}
