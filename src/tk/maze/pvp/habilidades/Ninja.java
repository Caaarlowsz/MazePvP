package tk.maze.pvp.habilidades;

import java.text.DecimalFormat;
import tk.maze.pvp.API.CooldownAPI;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.EventHandler;
import tk.maze.pvp.API.KitAPI;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import tk.maze.pvp.Main;
import org.bukkit.entity.Player;
import java.util.HashMap;
import org.bukkit.event.Listener;

public class Ninja implements Listener
{
    public static HashMap<Player, Player> a;
    public static HashMap<Player, Long> b;
    public static Main plugin;
    
    static {
        Ninja.a = new HashMap<Player, Player>();
        Ninja.b = new HashMap<Player, Long>();
    }
    
    @EventHandler
    public void a(final EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
        if (paramEntityDamageByEntityEvent.getDamager() instanceof Player && paramEntityDamageByEntityEvent.getEntity() instanceof Player) {
            final Player localPlayer1 = (Player)paramEntityDamageByEntityEvent.getDamager();
            final Player localPlayer2 = (Player)paramEntityDamageByEntityEvent.getEntity();
            if (KitAPI.getKit(localPlayer1) == "Ninja") {
                Ninja.a.put(localPlayer1, localPlayer2);
            }
        }
    }
    
    @EventHandler
    public void a(final PlayerToggleSneakEvent paramPlayerToggleSneakEvent) {
        final Player localPlayer1 = paramPlayerToggleSneakEvent.getPlayer();
        if (paramPlayerToggleSneakEvent.isSneaking() && KitAPI.getKit(localPlayer1) == "Ninja" && CooldownAPI.Cooldown.containsKey(localPlayer1.getName())) {
            localPlayer1.sendMessage("§fO seu §3§lCOOLDOWN §facaba em: §c§l" + CooldownAPI.Cooldown(localPlayer1) + "s");
            return;
        }
        if (paramPlayerToggleSneakEvent.isSneaking() && KitAPI.getKit(localPlayer1) == "Ninja" && Ninja.a.containsKey(localPlayer1)) {
            final Player localPlayer2 = Ninja.a.get(localPlayer1);
            if (localPlayer2 != null && !localPlayer2.isDead()) {
                if (Gladiator.noExecut.contains(localPlayer2)) {
                    localPlayer1.sendMessage("§cEste jogador est\u00e1 em um duelo nas alturas!");
                    return;
                }
                if (Gladiator.noExecut.contains(localPlayer1)) {
                    localPlayer1.sendMessage("§cVoc\u00ea n\u00e3o pode utilizar o kit Ninja durante um duelo no Gladiator!");
                    return;
                }
                String str = null;
                if (Ninja.b.get(localPlayer1) != null) {
                    final long l = Ninja.b.get(localPlayer1) - System.currentTimeMillis();
                    final DecimalFormat localDecimalFormat = new DecimalFormat("##");
                    final int i = (int)l / 1000;
                    str = localDecimalFormat.format(i);
                }
            }
            if (Ninja.b.get(localPlayer1) == null || Ninja.b.get(localPlayer1) < System.currentTimeMillis()) {
                if (localPlayer1.getLocation().distance(localPlayer2.getLocation()) < 100.0) {
                    localPlayer1.teleport(localPlayer2.getLocation());
                    CooldownAPI.addCooldown(localPlayer1, 7);
                    Ninja.b.put(localPlayer1, System.currentTimeMillis() + 10000L);
                }
                else {
                    localPlayer1.sendMessage("§cO \u00faltimo jogador hitado est\u00e1 muito longe!");
                }
            }
        }
    }
}
