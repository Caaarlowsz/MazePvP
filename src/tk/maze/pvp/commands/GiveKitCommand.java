package tk.maze.pvp.commands;

import tk.maze.pvp.conf.cfPermiss\u00e3o;
import org.bukkit.Bukkit;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class GiveKitCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("givekit")) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Gerente")) {
                p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§b§lGIVEKIT: §7/givekit (jogador) (kit)§f.");
                return true;
            }
            final int length = args.length;
            if (args.length == 2) {
                final String kit = args[1];
                final Player k = Bukkit.getPlayer(args[0]);
                if (kit.equalsIgnoreCase("pvp")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit PVP §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: PVP§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.pvp", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("archer")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit ARCHER §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: ARCHER§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.archer", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("kangaroo")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit KANGAROO §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: KANGAROO§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.kangaroo", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("fisherman")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit FISHERMAN §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: FISHERMAN§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.fisherman", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("cactus")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit CACTUS §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: CACTUS§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.cactus", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("monk")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit MONK §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: MONK§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("ninja")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit NINJA §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: NINJA§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.ninja", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("phantom")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit PHANTOM §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: PHANTOM§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.phantom", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("grappler")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit GRAPPLER §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: GRAPPLER§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.grappler", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("viper")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit VIPER §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: VIPER§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.viper", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("snail")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit SNAIL §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: SNAIL7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.snail", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("hulk")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit HULK §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: HULK§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.hulk", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("timelord")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit TIMELORD §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: TIMELORD§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.timelord", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("thor")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit THOR §7para o jogador: " + k.getName());
                    k.sendMessage("New§f§lPvP §6» §7Voce ganhou o KIT §6Thor");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.thor", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("switcher")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit SWITCHER §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: SWITCHER§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.switcher", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("gladiator")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit GLADIATOR §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: GLADIATOR§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.gladiator", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("stomper")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit STOMPER §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: STOMPER");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.stomper", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("magma")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit MAGMA §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: MAGMA§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.magma", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("grandpa")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit GRANDPA §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: GRANDPA§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.grandpa", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("ajnin")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit AJNIN §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: AJNIN§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.ajnin", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("firelauncher")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit FIRELAUNCHER §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: FIRELAUNCHER§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.firelauncher", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("strong")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit STRONG §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: STRONG§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.strong", "true");
                    return true;
                }
                if (kit.equalsIgnoreCase("sumo")) {
                    p.sendMessage("§b§lGIVEKIT: §7Voc\u00ea aplicou o kit SUMO §7para o jogador: " + k.getName());
                    k.sendMessage("§b§lGIVEKIT: §7Voc\u00ea recebeu o kit: SUMO§7!");
                    cfPermiss\u00e3o.setarPermissao(k, "kit.sumo", "true");
                    return true;
                }
                p.sendMessage("§cEsse kit n\u00e3o existe!");
                return true;
            }
        }
        return false;
    }
}
