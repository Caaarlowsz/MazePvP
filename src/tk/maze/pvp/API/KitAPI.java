package tk.maze.pvp.API;

import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.enchantments.Enchantment;
import tk.maze.pvp.commands.FlyCommand;
import tk.maze.pvp.invencivel.Prote\u00e7\u00e3o;
import tk.maze.pvp.Main;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import tk.maze.pvp.scoreboard.sScoreAPI;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import java.util.HashMap;

public class KitAPI
{
    private static HashMap<Player, String> Kit;
    private static HashMap<Player, String> KitAntes;
    
    static {
        KitAPI.Kit = new HashMap<Player, String>();
        KitAPI.KitAntes = new HashMap<Player, String>();
    }
    
    public static String getKit(final Player p) {
        if (KitAPI.Kit.containsKey(p)) {
            return KitAPI.Kit.get(p);
        }
        return "Nenhum";
    }
    
    public static String getKitAntes(final Player p) {
        if (KitAPI.KitAntes.containsKey(p)) {
            return KitAPI.KitAntes.get(p);
        }
        return "Nenhum";
    }
    
    public static void setKit(final Player p, final String kit) {
        KitAPI.Kit.put(p, kit);
    }
    
    public static void setKitAntes(final Player p, final String kit) {
        KitAPI.KitAntes.put(p, kit);
    }
    
    public static void removeKits(final Player p) {
        KitAPI.Kit.remove(p);
        KitAPI.KitAntes.remove(p);
    }
    
    public static void darKit(final Player p, final String kit) {
        if (p.getLocation().getY() < 160.0) {
            p.setGameMode(GameMode.SURVIVAL);
            p.setAllowFlight(false);
            p.getInventory().clear();
            API.setWarp(p, "Arena");
            sScoreAPI.scoreboard(p);
            p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
            p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
            p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
            p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    Prote\u00e7\u00e3o.setImortal(p, false);
                }
            }, 20L);
            FlyCommand.Fly.remove(p);
            final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
            for (int i = 0; i < 36; ++i) {
                p.getInventory().setItem(i, sopa);
                p.updateInventory();
            }
            p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
            p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
            p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
            if (getKitAntes(p) == "PvP") {
                final ItemStack Espada = new ItemStack(Material.DIAMOND_SWORD);
                Espada.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                final ItemMeta kEspada = Espada.getItemMeta();
                kEspada.setDisplayName("");
                Espada.setItemMeta(kEspada);
                final ItemStack Bussula = new ItemStack(Material.COMPASS);
                final ItemMeta kBussula = Bussula.getItemMeta();
                kBussula.setDisplayName("");
                Bussula.setItemMeta(kBussula);
                p.getInventory().setItem(8, Bussula);
                p.getInventory().setItem(0, Espada);
            }
            else {
                final ItemStack Bussula2 = new ItemStack(Material.COMPASS);
                final ItemMeta kBussula2 = Bussula2.getItemMeta();
                kBussula2.setDisplayName("");
                Bussula2.setItemMeta(kBussula2);
                final ItemStack Espada2 = new ItemStack(Material.DIAMOND_SWORD);
                final ItemMeta kEspada2 = Espada2.getItemMeta();
                kEspada2.setDisplayName("");
                Espada2.setItemMeta(kEspada2);
                p.getInventory().setItem(0, Espada2);
                p.getInventory().setItem(8, Bussula2);
            }
            if (getKitAntes(p) == "Kangaroo") {
                final ItemStack Item = new ItemStack(Material.FIREWORK);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Archer") {
                final ItemStack Item = new ItemStack(Material.BOW);
                Item.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                final ItemStack Item2 = new ItemStack(Material.ARROW);
                final ItemMeta kItem2 = Item2.getItemMeta();
                kItem2.setDisplayName("");
                Item2.setItemMeta(kItem2);
                p.getInventory().setItem(1, Item);
                p.getInventory().setItem(9, Item2);
            }
            if (getKitAntes(p) == "Grappler") {
                final ItemStack Item = new ItemStack(Material.LEASH);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Gladiator") {
                final ItemStack Item = new ItemStack(Material.IRON_FENCE);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Fisherman") {
                final ItemStack Item = new ItemStack(Material.FISHING_ROD);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Monk") {
                final ItemStack Item = new ItemStack(Material.BLAZE_ROD);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Phantom") {
                final ItemStack Item = new ItemStack(Material.FEATHER);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Thor") {
                final ItemStack Item = new ItemStack(Material.GOLD_AXE);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Stomper") {
                final ItemStack Item = new ItemStack(Material.GOLDEN_APPLE);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Timelord") {
                final ItemStack Item = new ItemStack(Material.WATCH);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Cactus") {
                final ItemStack Item = new ItemStack(Material.CACTUS);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.addEnchant(Enchantment.THORNS, 2, true);
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setHelmet(Item);
            }
            if (getKitAntes(p) == "Grandpa") {
                final ItemStack Item = new ItemStack(Material.STICK);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.addEnchant(Enchantment.KNOCKBACK, 3, true);
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Switcher") {
                final ItemStack Item = new ItemStack(Material.SNOW_BALL, 10);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "FireLauncher") {
                final ItemStack Item = new ItemStack(Material.BLAZE_POWDER);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Strong") {
                final ItemStack Item = new ItemStack(Material.WATCH);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Forcefield") {
                final ItemStack Item = new ItemStack(Material.IRON_FENCE);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
            if (getKitAntes(p) == "Sumo") {
                final ItemStack Item = new ItemStack(Material.APPLE);
                final ItemMeta kItem = Item.getItemMeta();
                kItem.setDisplayName("");
                Item.setItemMeta(kItem);
                p.getInventory().setItem(1, Item);
            }
        }
    }
}
