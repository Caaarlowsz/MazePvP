package tk.maze.pvp.habilidades;

import org.bukkit.event.EventHandler;
import org.bukkit.util.Vector;
import java.util.Iterator;
import org.bukkit.entity.Entity;
import org.bukkit.Sound;
import org.bukkit.Effect;
import tk.maze.pvp.Main;
import org.bukkit.Bukkit;
import tk.maze.pvp.API.CooldownAPI;
import tk.maze.pvp.API.KitAPI;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import org.bukkit.event.Listener;

public class FireLauncher implements Listener
{
    public static ArrayList<Player> inFire;
    
    static {
        FireLauncher.inFire = new ArrayList<Player>();
    }
    
    @EventHandler
    public void clickar(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getItemInHand().getType() == Material.BLAZE_POWDER && KitAPI.getKit(p) == "FireLauncher" && CooldownAPI.Cooldown.containsKey(p.getName())) {
            e.setCancelled(true);
            p.sendMessage("§fO seu §3§lCOOLDOWN §facaba em: §c§l" + CooldownAPI.Cooldown(p) + "s");
        }
        else if (p.getItemInHand().getType() == Material.BLAZE_POWDER && KitAPI.getKit(p) == "FireLauncher" && !CooldownAPI.Cooldown.containsKey(p.getName())) {
            p.sendMessage("§aVoc\u00ea ativou a sua habilidade!");
            CooldownAPI.addCooldown(p, 35);
            FireLauncher.inFire.add(p);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    if (FireLauncher.inFire.contains(p)) {
                        FireLauncher.inFire.remove(p);
                    }
                }
            }, 200L);
            p.getPlayer().getWorld().playEffect(p.getPlayer().getLocation(), Effect.MOBSPAWNER_FLAMES, 9999999, 9999999);
            p.getPlayer().getWorld().playEffect(p.getPlayer().getLocation(), Effect.SMOKE, 9999999, 99999);
            p.getPlayer().playSound(p.getPlayer().getLocation(), Sound.BLAZE_HIT, 10.0f, 10.0f);
            if (FireLauncher.inFire.contains(p)) {
                for (final Entity s : p.getNearbyEntities(10.5, 1.0, 10.5)) {
                    if (s instanceof Player) {
                        final Player t = (Player)s;
                        t.getPlayer().getWorld().playEffect(t.getPlayer().getLocation(), Effect.SMOKE, 9999999, 9999999);
                        t.sendMessage("§7Voc\u00ea est\u00e1 sendo atacado por um §2§lFirelauncher§7!");
                        final Vector vector = t.getLocation().getDirection();
                        vector.multiply(0.0f);
                        vector.setY(1.2f);
                        t.setVelocity(vector);
                        t.setFireTicks(150);
                    }
                }
            }
        }
    }
}
