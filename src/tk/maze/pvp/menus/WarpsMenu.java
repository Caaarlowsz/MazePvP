package tk.maze.pvp.menus;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;

public class WarpsMenu
{
    public static ItemStack possui;
    public static ItemMeta possuim;
    public static ItemStack vidro;
    public static ItemMeta vidrom;
    
    public static ItemStack criarItemMenu(final Material material, final String nome) {
        final ItemStack item = new ItemStack(material);
        final ItemMeta kitem = item.getItemMeta();
        kitem.setDisplayName(nome);
        item.setItemMeta(kitem);
        return item;
    }
    
    public static void inventory(final Player p) {
        final Inventory menu = Bukkit.createInventory((InventoryHolder)p, 27, "§bWarps");
        menu.setItem(10, criarItemMenu(Material.GLASS, "§bFps"));
        menu.setItem(12, criarItemMenu(Material.BLAZE_ROD, "§b1v1"));
        menu.setItem(14, criarItemMenu(Material.LAVA_BUCKET, "§bLavaChallenge"));
        menu.setItem(16, criarItemMenu(Material.FIREWORK, "§bEvento"));
        p.openInventory(menu);
    }
}
