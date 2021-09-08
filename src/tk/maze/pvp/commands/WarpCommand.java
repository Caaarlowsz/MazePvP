package tk.maze.pvp.commands;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import tk.maze.pvp.API.KitAPI;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.List;
import java.util.ArrayList;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.Material;
import tk.maze.pvp.invencivel.Prote\u00e7\u00e3o;
import tk.maze.pvp.scoreboard.sScoreAPI;
import tk.maze.pvp.API.API;
import tk.maze.pvp.API.WarpsAPI;
import org.bukkit.GameMode;
import tk.maze.pvp.Main;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import tk.maze.pvp.menus.WarpsMenu;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class WarpCommand implements CommandExecutor, Listener
{
    public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
        final Player p = (Player)Sender;
        if (Cmd.getName().equalsIgnoreCase("warp")) {
            if (Args.length == 0) {
                WarpsMenu.inventory(p);
                return true;
            }
            if (Args[0].equalsIgnoreCase("evento")) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
                p.closeInventory();
                p.getInventory().clear();
                p.getInventory().setArmorContents((ItemStack[])null);
                p.sendMessage("");
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.removePotionEffect(PotionEffectType.BLINDNESS);
                        p.removePotionEffect(PotionEffectType.SLOW);
                        p.removePotionEffect(PotionEffectType.CONFUSION);
                        p.setHealth(20.0);
                        p.setMaxHealth(20.0);
                        p.closeInventory();
                        p.getInventory().clear();
                        p.getInventory().setArmorContents((ItemStack[])null);
                        WarpsAPI.Ir(p, "Evento");
                        API.setWarp(p, "Evento");
                        sScoreAPI.scoreboard(p);
                        Prote\u00e7\u00e3o.setImortal(p, false);
                        final ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);
                        final BookMeta bm = (BookMeta)book.getItemMeta();
                        bm.setAuthor("§b§lEvento!");
                        bm.setTitle("§b§lComo Jogar!");
                        final ArrayList<String> pages = new ArrayList<String>();
                        pages.add("§7Seja bem-vindo ao nosso evento.Aki voce deverar esperar o organizador de evento setar o kit.e depois voces irao batalhar e no final tera um ganhador que levara um vip 1 semana.");
                        bm.setPages((List)pages);
                        book.setItemMeta((ItemMeta)bm);
                        p.getInventory().setItem(4, book);
                        p.updateInventory();
                    }
                }, 60L);
            }
            if (Args[0].equalsIgnoreCase("fps")) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
                p.closeInventory();
                p.getInventory().clear();
                p.getInventory().setArmorContents((ItemStack[])null);
                p.sendMessage("");
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.removePotionEffect(PotionEffectType.BLINDNESS);
                        p.removePotionEffect(PotionEffectType.SLOW);
                        p.removePotionEffect(PotionEffectType.CONFUSION);
                        p.setHealth(20.0);
                        p.setMaxHealth(20.0);
                        p.closeInventory();
                        p.getInventory().clear();
                        p.getInventory().setArmorContents((ItemStack[])null);
                        WarpsAPI.Ir(p, "Fps");
                        API.setWarp(p, "Fps");
                        sScoreAPI.scoreboard(p);
                        Prote\u00e7\u00e3o.setImortal(p, false);
                        final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
                        for (int i = 0; i < 36; ++i) {
                            p.getInventory().setItem(i, sopa);
                            p.updateInventory();
                        }
                        p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
                        p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
                        p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
                        final ItemStack Espada = new ItemStack(Material.STONE_SWORD);
                        Espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                        final ItemMeta kEspada = Espada.getItemMeta();
                        kEspada.setDisplayName("");
                        Espada.setItemMeta(kEspada);
                        p.getInventory().setItem(0, Espada);
                    }
                }, 60L);
            }
            else if (Args[0].equalsIgnoreCase("1v1")) {
                p.sendMessage("");
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
                p.closeInventory();
                p.getInventory().clear();
                p.getInventory().setArmorContents((ItemStack[])null);
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.removePotionEffect(PotionEffectType.BLINDNESS);
                        p.removePotionEffect(PotionEffectType.SLOW);
                        p.removePotionEffect(PotionEffectType.CONFUSION);
                        p.setHealth(20.0);
                        p.setMaxHealth(20.0);
                        p.setGameMode(GameMode.SURVIVAL);
                        p.closeInventory();
                        p.getInventory().clear();
                        p.getInventory().setArmorContents((ItemStack[])null);
                        KitAPI.removeKits(p);
                        WarpsAPI.Ir(p, "1v1");
                        API.setWarp(p, "1v1");
                        Prote\u00e7\u00e3o.setImortal(p, true);
                        sScoreAPI.scoreboard(p);
                        WarpsAPI.segundos.remove(p.getName());
                        final ItemStack Espada = new ItemStack(Material.BLAZE_ROD);
                        final ItemMeta kEspada = Espada.getItemMeta();
                        kEspada.setDisplayName("§eDesafie um jogador! §8(bot\u00e3o direito)");
                        Espada.setItemMeta(kEspada);
                        final ItemStack Espada2 = new ItemStack(Material.INK_SACK, 1, (short)8);
                        final ItemMeta kEspada2 = Espada2.getItemMeta();
                        kEspada2.setDisplayName("§eDuelo r\u00e1pido! §8(bot\u00e3o direito)");
                        Espada2.setItemMeta(kEspada2);
                        p.getInventory().setItem(3, Espada);
                        p.getInventory().setItem(5, Espada2);
                    }
                }, 60L);
            }
            else if (Args[0].equalsIgnoreCase("challenge")) {
                p.sendMessage("");
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
                p.closeInventory();
                p.getInventory().clear();
                p.getInventory().setArmorContents((ItemStack[])null);
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.removePotionEffect(PotionEffectType.BLINDNESS);
                        p.removePotionEffect(PotionEffectType.SLOW);
                        p.removePotionEffect(PotionEffectType.CONFUSION);
                        p.setHealth(20.0);
                        p.setMaxHealth(20.0);
                        p.setGameMode(GameMode.SURVIVAL);
                        p.closeInventory();
                        p.getInventory().clear();
                        p.getInventory().setArmorContents((ItemStack[])null);
                        WarpsAPI.Ir(p, "Challenge");
                        API.setWarp(p, "Challenge");
                        sScoreAPI.scoreboard(p);
                        final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
                        for (int i = 0; i < 36; ++i) {
                            p.getInventory().setItem(i, sopa);
                            p.updateInventory();
                        }
                        p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
                        p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
                        p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
                        final ItemStack Espada = new ItemStack(Material.STONE_SWORD);
                        final ItemMeta kEspada = Espada.getItemMeta();
                        kEspada.setDisplayName("");
                        Espada.setItemMeta(kEspada);
                        p.getInventory().setItem(0, Espada);
                    }
                }, 60L);
            }
            else if (Args[0].equalsIgnoreCase("knockback")) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
                p.closeInventory();
                p.getInventory().clear();
                p.getInventory().setArmorContents((ItemStack[])null);
                p.sendMessage("");
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.removePotionEffect(PotionEffectType.BLINDNESS);
                        p.removePotionEffect(PotionEffectType.SLOW);
                        p.removePotionEffect(PotionEffectType.CONFUSION);
                        p.setHealth(20.0);
                        p.setMaxHealth(20.0);
                        p.closeInventory();
                        p.getInventory().clear();
                        p.getInventory().setArmorContents((ItemStack[])null);
                        WarpsAPI.Ir(p, "Knockback");
                        API.setWarp(p, "Knockback");
                        sScoreAPI.scoreboard(p);
                        Prote\u00e7\u00e3o.setImortal(p, false);
                        final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
                        for (int i = 0; i < 36; ++i) {
                            p.getInventory().setItem(i, sopa);
                            p.updateInventory();
                        }
                        p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
                        p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
                        p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
                        final ItemStack Espada = new ItemStack(Material.STICK);
                        final ItemMeta kEspada = Espada.getItemMeta();
                        kEspada.setDisplayName("§eKnockBack");
                        kEspada.addEnchant(Enchantment.KNOCKBACK, 5, true);
                        Espada.setItemMeta(kEspada);
                        p.getInventory().setItem(0, Espada);
                    }
                }, 60L);
            }
            else if (Args[0].equalsIgnoreCase("main")) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
                p.closeInventory();
                p.getInventory().clear();
                p.getInventory().setArmorContents((ItemStack[])null);
                p.sendMessage("");
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.removePotionEffect(PotionEffectType.BLINDNESS);
                        p.removePotionEffect(PotionEffectType.SLOW);
                        p.removePotionEffect(PotionEffectType.CONFUSION);
                        p.setHealth(20.0);
                        p.setMaxHealth(20.0);
                        p.closeInventory();
                        p.getInventory().clear();
                        p.getInventory().setArmorContents((ItemStack[])null);
                        WarpsAPI.Ir(p, "Main");
                        API.setWarp(p, "Main");
                        sScoreAPI.scoreboard(p);
                        Prote\u00e7\u00e3o.setImortal(p, false);
                        final ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
                        for (int i = 0; i < 36; ++i) {
                            p.getInventory().setItem(i, sopa);
                            p.updateInventory();
                        }
                        final ItemStack peitoral = new ItemStack(Material.IRON_CHESTPLATE);
                        final ItemMeta peitoralm = peitoral.getItemMeta();
                        peitoralm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                        peitoralm.setDisplayName("§b§lPeitoral de Ferro");
                        peitoral.setItemMeta(peitoralm);
                        final ItemStack capacete = new ItemStack(Material.IRON_HELMET);
                        final ItemMeta capacetem = capacete.getItemMeta();
                        capacetem.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                        capacetem.setDisplayName("§b§lCapacete de Ferro");
                        capacete.setItemMeta(capacetem);
                        final ItemStack calca = new ItemStack(Material.IRON_LEGGINGS);
                        final ItemMeta calcam = peitoral.getItemMeta();
                        calcam.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                        calcam.setDisplayName("§b§lCal\u00e7a de Ferro");
                        calca.setItemMeta(calcam);
                        final ItemStack bota = new ItemStack(Material.IRON_BOOTS);
                        final ItemMeta botam = bota.getItemMeta();
                        botam.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                        botam.setDisplayName("§b§lBotas de Ferro");
                        bota.setItemMeta(botam);
                        p.getInventory().setHelmet(capacete);
                        p.getInventory().setChestplate(peitoral);
                        p.getInventory().setLeggings(calca);
                        p.getInventory().setBoots(bota);
                        p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
                        p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
                        p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
                        final ItemStack Espada = new ItemStack(Material.DIAMOND_SWORD);
                        Espada.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                        final ItemMeta kEspada = Espada.getItemMeta();
                        kEspada.setDisplayName("");
                        Espada.setItemMeta(kEspada);
                        p.getInventory().setItem(0, Espada);
                    }
                }, 60L);
            }
            else if (Args[0].equalsIgnoreCase("fisherman")) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
                p.closeInventory();
                p.getInventory().clear();
                p.getInventory().setArmorContents((ItemStack[])null);
                p.sendMessage("");
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.removePotionEffect(PotionEffectType.BLINDNESS);
                        p.removePotionEffect(PotionEffectType.SLOW);
                        p.removePotionEffect(PotionEffectType.CONFUSION);
                        p.setHealth(20.0);
                        p.setMaxHealth(20.0);
                        p.closeInventory();
                        p.getInventory().clear();
                        p.getInventory().setArmorContents((ItemStack[])null);
                        WarpsAPI.Ir(p, "Fisherman");
                        API.setWarp(p, "Fisherman");
                        KitAPI.setKit(p, "Fisherman");
                        sScoreAPI.scoreboard(p);
                        Prote\u00e7\u00e3o.setImortal(p, false);
                        final ItemStack Espada = new ItemStack(Material.FISHING_ROD);
                        final ItemMeta kEspada = Espada.getItemMeta();
                        kEspada.setDisplayName("§5§oVara de pesca");
                        Espada.setItemMeta(kEspada);
                        p.getInventory().setItem(0, Espada);
                    }
                }, 60L);
            }
        }
        return false;
    }
    
    @EventHandler
    public void aoConsume(final PlayerItemConsumeEvent e) {
        final Player p = e.getPlayer();
        if (API.getWarp(p) == "Arena" || API.getWarp(p) == "Main" || API.getWarp(p) == "Fisherman") {
            e.setCancelled(true);
        }
    }
}
