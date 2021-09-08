package tk.maze.pvp.habilidades;

import org.bukkit.event.EventHandler;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.util.HashSet;
import tk.maze.pvp.API.CooldownAPI;
import tk.maze.pvp.API.KitAPI;
import org.bukkit.event.block.Action;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class Thor implements Listener
{
    @EventHandler
    public void ThorKit(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getItemInHand().getType() == Material.GOLD_AXE && e.getAction() == Action.RIGHT_CLICK_BLOCK && KitAPI.getKit(p) == "Thor") {
            if (CooldownAPI.Cooldown.containsKey(p.getName())) {
                p.sendMessage("§fO seu §3§lCOOLDOWN §facaba em: §c§l" + CooldownAPI.Cooldown(p) + "s");
                return;
            }
            CooldownAPI.addCooldown(p, 5);
            final Location loc = p.getTargetBlock((HashSet)null, 25).getLocation();
            p.getWorld().strikeLightning(loc);
            e.setCancelled(true);
            p.damage(0.0);
        }
    }
}
