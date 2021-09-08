package tk.maze.pvp.menus;

import tk.maze.pvp.API.HatAPI;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.Sound;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.event.block.Action;
import tk.maze.pvp.API.API;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class HeadsMenu implements Listener
{
    public static void setarInventario(final Player p) {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)null, 54, "§7\u27b3 §b§lHEADS");
        final ItemStack vidro = new ItemStack(Material.GLASS);
        final ItemMeta vidrom = vidro.getItemMeta();
        vidrom.setDisplayName("§b§lVIDRO");
        vidro.setItemMeta(vidrom);
        final ItemStack beacon = new ItemStack(Material.BEACON);
        final ItemMeta beaconm = vidro.getItemMeta();
        beaconm.setDisplayName("§b§lBEACON");
        beacon.setItemMeta(beaconm);
        final ItemStack pedra = new ItemStack(Material.STONE);
        final ItemMeta pedram = pedra.getItemMeta();
        pedram.setDisplayName("§b§lPEDRA");
        pedra.setItemMeta(pedram);
        final ItemStack bedrock = new ItemStack(Material.BEDROCK);
        final ItemMeta bedrockm = bedrock.getItemMeta();
        bedrockm.setDisplayName("§b§lBEDROCK");
        bedrock.setItemMeta(bedrockm);
        final ItemStack areia = new ItemStack(Material.SAND);
        final ItemMeta areiam = areia.getItemMeta();
        areiam.setDisplayName("§b§lAREIA");
        areia.setItemMeta(areiam);
        final ItemStack esponja = new ItemStack(Material.SPONGE);
        final ItemMeta esponjam = esponja.getItemMeta();
        esponjam.setDisplayName("§b§lESPONJA");
        esponja.setItemMeta(esponjam);
        final ItemStack lapislazuli = new ItemStack(Material.LAPIS_BLOCK);
        final ItemMeta lapislazulim = lapislazuli.getItemMeta();
        lapislazulim.setDisplayName("§b§lLAPIS LAZULI");
        lapislazuli.setItemMeta(lapislazulim);
        final ItemStack la = new ItemStack(Material.WOOL);
        final ItemMeta lam = la.getItemMeta();
        lam.setDisplayName("§b§lL\u00c3");
        la.setItemMeta(lam);
        final ItemStack ouro = new ItemStack(Material.GOLD_BLOCK);
        final ItemMeta ourom = ouro.getItemMeta();
        ourom.setDisplayName("§b§lBLOCO DE OURO");
        ouro.setItemMeta(ourom);
        final ItemStack ferro = new ItemStack(Material.IRON_BLOCK);
        final ItemMeta ferrom = ferro.getItemMeta();
        ferrom.setDisplayName("§b§lBLOCO DE FERRO");
        ferro.setItemMeta(ferrom);
        final ItemStack tijolo = new ItemStack(Material.BRICK);
        final ItemMeta tijolom = tijolo.getItemMeta();
        tijolom.setDisplayName("§b§lTIJOLO");
        tijolo.setItemMeta(tijolom);
        final ItemStack estante = new ItemStack(Material.BOOKSHELF);
        final ItemMeta estantem = estante.getItemMeta();
        estantem.setDisplayName("§b§lESTANTE");
        estante.setItemMeta(estantem);
        final ItemStack pedramusgo = new ItemStack(Material.MOSSY_COBBLESTONE);
        final ItemMeta pedramusgom = pedramusgo.getItemMeta();
        pedramusgom.setDisplayName("§b§lPEDRA DE MUSGO");
        pedramusgo.setItemMeta(pedramusgom);
        final ItemStack obsidian = new ItemStack(Material.OBSIDIAN);
        final ItemMeta obsidianm = obsidian.getItemMeta();
        obsidianm.setDisplayName("§b§lOBSIDIAN");
        obsidian.setItemMeta(obsidianm);
        final ItemStack diamante = new ItemStack(Material.DIAMOND_BLOCK);
        final ItemMeta diamantem = diamante.getItemMeta();
        diamantem.setDisplayName("§b§lBLOCO DE DIAMANTE");
        diamante.setItemMeta(diamantem);
        final ItemStack gelo = new ItemStack(Material.ICE);
        final ItemMeta gelom = gelo.getItemMeta();
        gelom.setDisplayName("§b§lGELO");
        gelo.setItemMeta(gelom);
        final ItemStack neve = new ItemStack(Material.SNOW_BLOCK);
        final ItemMeta nevem = neve.getItemMeta();
        nevem.setDisplayName("§b§lBLOCO DE NEVE");
        neve.setItemMeta(nevem);
        final ItemStack nether = new ItemStack(Material.NETHERRACK);
        final ItemMeta netherm = nether.getItemMeta();
        netherm.setDisplayName("§b§lROCHA DO NETHER");
        nether.setItemMeta(netherm);
        final ItemStack glow = new ItemStack(Material.GLOWSTONE);
        final ItemMeta glowm = glow.getItemMeta();
        glowm.setDisplayName("§b§lGLOWSTONE");
        glow.setItemMeta(glowm);
        final ItemStack abobora = new ItemStack(Material.JACK_O_LANTERN);
        final ItemMeta aboboram = abobora.getItemMeta();
        aboboram.setDisplayName("§b§lABOBORA");
        abobora.setItemMeta(aboboram);
        final ItemStack esmeralda = new ItemStack(Material.EMERALD_BLOCK);
        final ItemMeta esmeraldam = esmeralda.getItemMeta();
        esmeraldam.setDisplayName("§b§lBLOCO DE ESMERALDA");
        esmeralda.setItemMeta(esmeraldam);
        final ItemStack sair = new ItemStack(Material.getMaterial(351), 1, (short)1);
        final ItemMeta sairm = esmeralda.getItemMeta();
        sairm.setDisplayName("§c§lSAIR DO MENU");
        sair.setItemMeta(sairm);
        final ItemStack remover = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
        final ItemMeta removerm = remover.getItemMeta();
        removerm.setDisplayName("§c§lREMOVER HEAD");
        remover.setItemMeta(removerm);
        final ItemStack vidros = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
        final ItemMeta vidrosm = vidros.getItemMeta();
        vidrosm.setDisplayName("§b§lLower§f§lKits");
        vidros.setItemMeta(vidrosm);
        inv.setItem(1, vidro);
        inv.setItem(2, beacon);
        inv.setItem(3, pedra);
        inv.setItem(4, pedramusgo);
        inv.setItem(5, areia);
        inv.setItem(6, lapislazuli);
        inv.setItem(7, ferro);
        inv.setItem(10, ouro);
        inv.setItem(11, diamante);
        inv.setItem(12, esmeralda);
        inv.setItem(13, esponja);
        inv.setItem(14, bedrock);
        inv.setItem(15, la);
        inv.setItem(16, estante);
        inv.setItem(19, obsidian);
        inv.setItem(20, abobora);
        inv.setItem(21, glow);
        inv.setItem(22, nether);
        inv.setItem(23, neve);
        inv.setItem(24, gelo);
        inv.setItem(25, tijolo);
        inv.setItem(38, sair);
        inv.setItem(42, remover);
        p.openInventory(inv);
    }
    
    @EventHandler
    public void abrirMenu(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if ((p.getItemInHand().getType() == Material.NOTE_BLOCK && API.getWarp(p) == "Spawn" && e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK && p.getItemInHand().hasItemMeta() && p.getItemInHand().getItemMeta().hasDisplayName() && p.getItemInHand().getItemMeta().getDisplayName().equals("§6» §7Heads"))) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
            }
            else {
                setarInventario(p);
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 20.0f, 20.0f);
            }
        }
    }
    
    @EventHandler
    public void clicarInv(final InventoryClickEvent e) {
        final ItemStack vidro = new ItemStack(Material.GLASS);
        final ItemMeta vidrom = vidro.getItemMeta();
        vidrom.setDisplayName("§b§lVIDRO");
        vidro.setItemMeta(vidrom);
        final ItemStack beacon = new ItemStack(Material.BEACON);
        final ItemMeta beaconm = vidro.getItemMeta();
        beaconm.setDisplayName("§b§lBEACON");
        beacon.setItemMeta(beaconm);
        final ItemStack pedra = new ItemStack(Material.STONE);
        final ItemMeta pedram = pedra.getItemMeta();
        pedram.setDisplayName("§b§lPEDRA");
        pedra.setItemMeta(pedram);
        final ItemStack bedrock = new ItemStack(Material.BEDROCK);
        final ItemMeta bedrockm = bedrock.getItemMeta();
        bedrockm.setDisplayName("§b§lBEDROCK");
        bedrock.setItemMeta(bedrockm);
        final ItemStack areia = new ItemStack(Material.SAND);
        final ItemMeta areiam = areia.getItemMeta();
        areiam.setDisplayName("§b§lAREIA");
        areia.setItemMeta(areiam);
        final ItemStack esponja = new ItemStack(Material.SPONGE);
        final ItemMeta esponjam = esponja.getItemMeta();
        esponjam.setDisplayName("§b§lESPONJA");
        esponja.setItemMeta(esponjam);
        final ItemStack lapislazuli = new ItemStack(Material.LAPIS_BLOCK);
        final ItemMeta lapislazulim = lapislazuli.getItemMeta();
        lapislazulim.setDisplayName("§b§lLAPIS LAZULI");
        lapislazuli.setItemMeta(lapislazulim);
        final ItemStack la = new ItemStack(Material.WOOL);
        final ItemMeta lam = la.getItemMeta();
        lam.setDisplayName("§b§lL\u00c3");
        la.setItemMeta(lam);
        final ItemStack ouro = new ItemStack(Material.GOLD_BLOCK);
        final ItemMeta ourom = ouro.getItemMeta();
        ourom.setDisplayName("§b§lBLOCO DE OURO");
        ouro.setItemMeta(ourom);
        final ItemStack ferro = new ItemStack(Material.IRON_BLOCK);
        final ItemMeta ferrom = ferro.getItemMeta();
        ferrom.setDisplayName("§b§lBLOCO DE FERRO");
        ferro.setItemMeta(ferrom);
        final ItemStack tijolo = new ItemStack(Material.BRICK);
        final ItemMeta tijolom = tijolo.getItemMeta();
        tijolom.setDisplayName("§b§lTIJOLO");
        tijolo.setItemMeta(tijolom);
        final ItemStack estante = new ItemStack(Material.BOOKSHELF);
        final ItemMeta estantem = estante.getItemMeta();
        estantem.setDisplayName("§b§lESTANTE");
        estante.setItemMeta(estantem);
        final ItemStack pedramusgo = new ItemStack(Material.MOSSY_COBBLESTONE);
        final ItemMeta pedramusgom = pedramusgo.getItemMeta();
        pedramusgom.setDisplayName("§b§lPEDRA DE MUSGO");
        pedramusgo.setItemMeta(pedramusgom);
        final ItemStack obsidian = new ItemStack(Material.OBSIDIAN);
        final ItemMeta obsidianm = obsidian.getItemMeta();
        obsidianm.setDisplayName("§b§lOBSIDIAN");
        obsidian.setItemMeta(obsidianm);
        final ItemStack diamante = new ItemStack(Material.DIAMOND_BLOCK);
        final ItemMeta diamantem = diamante.getItemMeta();
        diamantem.setDisplayName("§b§lBLOCO DE DIAMANTE");
        diamante.setItemMeta(diamantem);
        final ItemStack gelo = new ItemStack(Material.ICE);
        final ItemMeta gelom = gelo.getItemMeta();
        gelom.setDisplayName("§b§lGELO");
        gelo.setItemMeta(gelom);
        final ItemStack neve = new ItemStack(Material.SNOW_BLOCK);
        final ItemMeta nevem = neve.getItemMeta();
        nevem.setDisplayName("§b§lBLOCO DE NEVE");
        neve.setItemMeta(nevem);
        final ItemStack nether = new ItemStack(Material.NETHERRACK);
        final ItemMeta netherm = nether.getItemMeta();
        netherm.setDisplayName("§b§lROCHA DO NETHER");
        nether.setItemMeta(netherm);
        final ItemStack glow = new ItemStack(Material.GLOWSTONE);
        final ItemMeta glowm = glow.getItemMeta();
        glowm.setDisplayName("§b§lGLOWSTONE");
        glow.setItemMeta(glowm);
        final ItemStack abobora = new ItemStack(Material.JACK_O_LANTERN);
        final ItemMeta aboboram = abobora.getItemMeta();
        aboboram.setDisplayName("§b§lABOBORA");
        abobora.setItemMeta(aboboram);
        final ItemStack esmeralda = new ItemStack(Material.EMERALD_BLOCK);
        final ItemMeta esmeraldam = esmeralda.getItemMeta();
        esmeraldam.setDisplayName("§b§lBLOCO DE ESMERALDA");
        esmeralda.setItemMeta(esmeraldam);
        final Player p = (Player)e.getWhoClicked();
        if (e.getInventory().getTitle().equalsIgnoreCase("§7\u27b3 §b§lHEADS")) {
            if (e.getCurrentItem().getType() == Material.GLASS) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(vidro);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lVIDRO");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.BEACON) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(beacon);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lBEACON");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.STONE) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(pedra);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lPEDRA");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.MOSSY_COBBLESTONE) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(pedramusgo);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lPEDRA DE MUSGO");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.SAND) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(areia);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lAREIA");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.LAPIS_BLOCK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(lapislazuli);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lLAPIS LAZULI");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.IRON_BLOCK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(ferro);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lBLOCO DE FERRO");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.GOLD_BLOCK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(ouro);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lBLOCO DE OURO");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.DIAMOND_BLOCK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(diamante);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lBLOCO DE DIAMANTE");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.EMERALD_BLOCK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(esmeralda);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lBLOCO DE ESMERALDA");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.SPONGE) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(esponja);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lESPONJA");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.BEDROCK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(bedrock);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lBEDROCK");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.WOOL) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(la);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lL\u00c3");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.BOOKSHELF) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(estante);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lESPONJA");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.OBSIDIAN) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(obsidian);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lOBSIDIAN");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.JACK_O_LANTERN) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(abobora);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lABOBORA");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.GLOWSTONE) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(glow);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lGLOWSTONE");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.NETHERRACK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(nether);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lROCHA DO NETHER");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.SNOW_BLOCK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(neve);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lBLOCO DE NEVE");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.ICE) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(gelo);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lGELO");
                p.closeInventory();
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getType() == Material.BRICK) {
                if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                    p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para utilizar uma cabe\u00e7a!");
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                p.getInventory().setHelmet(tijolo);
                tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                p.sendMessage("§b§lLower§f§lKits §7» §fA sua cabe\u00e7a foi alterada para: §6§lTIJOLO");
                p.closeInventory();
                e.setCancelled(true);
            }
            else {
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lSAIR DO MENU")) {
                    tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                    p.closeInventory();
                    e.setCancelled(true);
                    return;
                }
                if (e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) {
                    if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Youtuber") && !cfGrupo.ChecarGrupo(p, "S-Pro") && !cfGrupo.ChecarGrupo(p, "Pro") && !cfGrupo.ChecarGrupo(p, "Mvp") && !cfGrupo.ChecarGrupo(p, "Helper")) {
                        p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar esta a\u00e7\u00e3o!");
                        p.closeInventory();
                        e.setCancelled(true);
                        return;
                    }
                    HatAPI.removeHat(p);
                    tk.maze.pvp.bans.API.sendSound(p, Sound.LEVEL_UP, 10);
                    p.sendMessage("§aCabe\u00e7a removida com sucesso!");
                    p.closeInventory();
                    e.setCancelled(true);
                }
            }
        }
    }
}
