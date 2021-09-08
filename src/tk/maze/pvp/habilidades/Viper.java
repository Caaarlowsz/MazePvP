package tk.maze.pvp.habilidades;

import org.bukkit.event.EventHandler;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.Random;
import tk.maze.pvp.API.KitAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.Listener;

public class Viper implements Listener
{
    @EventHandler
    public void onPosion(final EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            final Player p = (Player)e.getEntity();
            final Player d = (Player)e.getDamager();
            if (KitAPI.getKit(d) == "Viper") {
                final Random r = new Random();
                final int rand = r.nextInt(100);
                if (rand >= 67) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 80, 0));
                }
            }
        }
    }
}
