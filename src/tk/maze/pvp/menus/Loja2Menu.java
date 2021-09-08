package tk.maze.pvp.menus;

import org.bukkit.inventory.Inventory;
import tk.maze.pvp.conf.cfPermiss\u00e3o;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.List;
import java.util.Arrays;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class Loja2Menu
{
    public static ItemStack criarItemMenu(final Material material, final String nome, final String[] habilidade) {
        final ItemStack item = new ItemStack(material);
        final ItemMeta kitem = item.getItemMeta();
        kitem.setDisplayName(nome);
        kitem.setLore((List)Arrays.asList(habilidade));
        item.setItemMeta(kitem);
        return item;
    }
    
    public static void inventory(final Player p) {
        final Inventory menu = Bukkit.createInventory((InventoryHolder)p, 54, "�2�lLOJA DE KITS �8(p\u00e1g. 2)");
        final ItemStack maiskits = new ItemStack(Material.getMaterial(351), 1, (short)1);
        final ItemMeta kmaiskits = maiskits.getItemMeta();
        kmaiskits.setDisplayName("�c�lPAGINA ANTERIOR");
        maiskits.setItemMeta(kmaiskits);
        final ItemStack kits = new ItemStack(Material.getMaterial(54));
        final ItemMeta kkits = kits.getItemMeta();
        kkits.setDisplayName("�a�lSEUS KITS");
        kits.setItemMeta(kkits);
        final ItemStack lojadekits = new ItemStack(Material.getMaterial(388));
        final ItemMeta klojadekits = lojadekits.getItemMeta();
        klojadekits.setDisplayName("�2�lLOJA DE KITS");
        lojadekits.setItemMeta(klojadekits);
        final ItemStack padraokit = new ItemStack(Material.getMaterial(351), 1, (short)6);
        final ItemMeta kpadraokit = padraokit.getItemMeta();
        kpadraokit.setDisplayName("�3�lKIT PADRAO");
        kpadraokit.setLore((List)Arrays.asList("�7Facilite seu modo de jogo", "�7usando o sistema �e�lPADRAO KIT.", " "));
        padraokit.setItemMeta(kpadraokit);
        final ItemStack todososkits = new ItemStack(Material.getMaterial(399));
        final ItemMeta ktodososkits = todososkits.getItemMeta();
        ktodososkits.setDisplayName("�9�lTODOS OS KITS");
        todososkits.setItemMeta(ktodososkits);
        final ItemStack ConfigureKit = new ItemStack(Material.getMaterial(131));
        final ItemMeta kConfigureKit = ConfigureKit.getItemMeta();
        kConfigureKit.setDisplayName("�6�lCUSTOM KIT");
        kConfigureKit.setLore((List)Arrays.asList("�c�l[�4�lEM BREVE�c�l] ", "�7Configure seu kit", "�7para uma melhor jogabilidade.", " "));
        ConfigureKit.setItemMeta(kConfigureKit);
        final ItemStack vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
        final ItemMeta kvidro = vidro.getItemMeta();
        kvidro.setDisplayName("�b�lLower�f�lKits");
        vidro.setItemMeta(kvidro);
        menu.setItem(0, padraokit);
        menu.setItem(8, padraokit);
        menu.setItem(1, vidro);
        menu.setItem(2, vidro);
        menu.setItem(6, vidro);
        menu.setItem(7, vidro);
        menu.setItem(9, vidro);
        menu.setItem(10, vidro);
        menu.setItem(11, vidro);
        menu.setItem(12, vidro);
        menu.setItem(13, vidro);
        menu.setItem(14, vidro);
        menu.setItem(15, vidro);
        menu.setItem(16, vidro);
        menu.setItem(17, vidro);
        menu.setItem(3, todososkits);
        menu.setItem(4, kits);
        menu.setItem(5, lojadekits);
        menu.setItem(27, maiskits);
        if (cfGrupo.ChecarGrupo(p, "Membro") || cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Trial")) {
            if (!cfPermiss\u00e3o.getPermissao(p, "kit.strong")) {
                menu.addItem(new ItemStack[] { criarItemMenu(Material.WATCH, "�cStrong �c�l30.000", new String[] { "�7Fique fulliron por 10s" }) });
            }
            else {
                menu.remove(Material.WATCH);
            }
            if (!cfPermiss\u00e3o.getPermissao(p, "kit.sumo")) {
                menu.addItem(new ItemStack[] { criarItemMenu(Material.APPLE, "�cSumo �c�l15.000", new String[] { "�7Voc\u00ea \u00e9 t\u00e3o gordo que joga ", "�7seus inimigos pro alto" }) });
            }
            else {
                menu.remove(Material.APPLE);
            }
        }
        final ItemStack PossuiTodos = new ItemStack(Material.MAGMA_CREAM);
        final ItemMeta kPossuiTodos = kits.getItemMeta();
        kPossuiTodos.setDisplayName("�4�l(!) �cVoc\u00ea j\u00e1 possui todos os kits!");
        PossuiTodos.setItemMeta(kPossuiTodos);
        if (cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Mod") || cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Dono")) {
            menu.setItem(31, PossuiTodos);
        }
        if (cfPermiss\u00e3o.getPermissao(p, "kit.monk") && cfPermiss\u00e3o.getPermissao(p, "kit.ninja") && cfPermiss\u00e3o.getPermissao(p, "kit.phantom") && cfPermiss\u00e3o.getPermissao(p, "kit.grappler") && cfPermiss\u00e3o.getPermissao(p, "kit.viper") && cfPermiss\u00e3o.getPermissao(p, "kit.snail") && cfPermiss\u00e3o.getPermissao(p, "kit.hulk") && cfPermiss\u00e3o.getPermissao(p, "kit.timelord") && cfPermiss\u00e3o.getPermissao(p, "kit.thor") && cfPermiss\u00e3o.getPermissao(p, "kit.switcher") && cfPermiss\u00e3o.getPermissao(p, "kit.gladiator") && cfPermiss\u00e3o.getPermissao(p, "kit.endermage") && cfPermiss\u00e3o.getPermissao(p, "kit.stomper") && cfPermiss\u00e3o.getPermissao(p, "kit.firelauncher") && cfPermiss\u00e3o.getPermissao(p, "kit.strong") && cfPermiss\u00e3o.getPermissao(p, "kit.sumo") && cfPermiss\u00e3o.getPermissao(p, "kit.magma") && cfPermiss\u00e3o.getPermissao(p, "kit.grandpa") && cfPermiss\u00e3o.getPermissao(p, "kit.ajnin")) {
            menu.setItem(31, PossuiTodos);
        }
        p.openInventory(menu);
    }
}
