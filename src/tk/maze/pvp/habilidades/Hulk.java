package tk.maze.pvp.habilidades;

import org.bukkit.util.Vector;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Entity;
import tk.maze.pvp.API.CooldownAPI;
import tk.maze.pvp.API.KitAPI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.Listener;

public class Hulk implements Listener
{
    @EventHandler
    public void hulk(final PlayerInteractEntityEvent event) {
        if (!(event.getRightClicked() instanceof Player)) {
            return;
        }
        final Player p = event.getPlayer();
        final Player r = (Player)event.getRightClicked();
        if (p.getItemInHand().getType() == Material.AIR && KitAPI.getKit(p) == "Hulk" && !CooldownAPI.Cooldown.containsKey(p.getName()) && p.getPassenger() == null && r.getPassenger() == null) {
            p.setPassenger((Entity)r);
            CooldownAPI.addCooldown(p, 15);
            return;
        }
        if (p.getItemInHand().getType() == Material.AIR && KitAPI.getKit(p) == "Hulk" && CooldownAPI.Cooldown.containsKey(p.getName()) && p.getPassenger() == null && r.getPassenger() == null) {
            p.sendMessage("�fO seu �3�lCOOLDOWN �facaba em: �c�l" + CooldownAPI.Cooldown(p) + "s");
        }
    }
    
    @EventHandler
    public static void playerInteract(final PlayerInteractEvent event) {
        if (!event.getAction().equals((Object)Action.LEFT_CLICK_AIR)) {
            return;
        }
        final Player player = event.getPlayer();
        if (player.getPassenger() == null || !(player.getPassenger() instanceof Player)) {
            return;
        }
        final Player pass = (Player)player.getPassenger();
        player.eject();
        pass.damage(0.0, (Entity)player);
        pass.setVelocity(new Vector(pass.getVelocity().getX(), 1.0, pass.getVelocity().getZ()));
    }
}
