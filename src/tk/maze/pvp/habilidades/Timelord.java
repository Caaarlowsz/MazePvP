package tk.maze.pvp.habilidades;

import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.EventHandler;
import java.util.Iterator;
import java.util.List;
import tk.maze.pvp.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import tk.maze.pvp.API.CooldownAPI;
import tk.maze.pvp.API.KitAPI;
import org.bukkit.event.block.Action;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.ArrayList;
import org.bukkit.event.Listener;

public class Timelord implements Listener
{
    public static ArrayList<String> frozenPlayers;
    
    static {
        Timelord.frozenPlayers = new ArrayList<String>();
    }
    
    @EventHandler
    public void onTimeLord(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getItemInHand().getType() == Material.WATCH && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
            if (KitAPI.getKit(p) == "Timelord" && CooldownAPI.Cooldown.containsKey(p.getName())) {
                p.sendMessage("§fO seu §3§lCOOLDOWN §facaba em: §c§l" + CooldownAPI.Cooldown(p) + "s");
                return;
            }
            if (KitAPI.getKit(p) == "Timelord") {
                final List<Entity> ne = (List<Entity>)e.getPlayer().getNearbyEntities(5.0, 5.0, 5.0);
                for (final Entity t : ne) {
                    if (t instanceof Player) {
                        final Player ta = (Player)t;
                        Timelord.frozenPlayers.add(((Player)t).getName());
                        ((Player)t).sendMessage("§fVoc\u00ea foi congelado por um §e§lTIMELORD§f!");
                        CooldownAPI.addCooldown(p, 35);
                        p.sendMessage("§aVoc\u00ea congelou os jogador a sua volta");
                        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                            @Override
                            public void run() {
                                Timelord.frozenPlayers.remove(ta.getName());
                            }
                        }, 100L);
                    }
                }
            }
        }
    }
    
    @EventHandler
    public void onTimeLordado(final PlayerMoveEvent e) {
        if (Timelord.frozenPlayers.contains(e.getPlayer().getName())) {
            e.getPlayer().teleport((Entity)e.getPlayer());
        }
    }
}
