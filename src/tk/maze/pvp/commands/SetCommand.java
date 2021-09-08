package tk.maze.pvp.commands;

import tk.maze.pvp.API.WarpsAPI;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class SetCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("set")) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Builder")) {
                p.sendMessage("§c§l(!) §cVoc\u00ea n\u00e3o possui permiss\u00e3o para executar este comando!");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§7Use §b§l/set <local>§7!");
                p.sendMessage("§aAlguns locais... ");
                p.sendMessage(" ");
                p.sendMessage("§a-> §6Spawn");
                p.sendMessage("§a-> §6loc1");
                p.sendMessage("§a-> §6loc2");
                p.sendMessage("§a-> §6loc3");
                p.sendMessage("§a-> §6loc4");
                p.sendMessage("§a-> §6loc5");
                p.sendMessage("§a-> §6Parkour");
                p.sendMessage("§a-> §6Villagerparkour");
                p.sendMessage("§a-> §6Fps");
                p.sendMessage("§a-> §61v1loc1");
                p.sendMessage("§a-> §61v1loc2");
                p.sendMessage("§a-> §6Challenge");
                p.sendMessage("§a-> §6Fisherman");
                return true;
            }
            if (args[0].equalsIgnoreCase("spawn")) {
                WarpsAPI.Set(p, "Spawn");
                p.sendMessage("§aVoc\u00ea setou o spawn");
                return true;
            }
            if (args[0].equalsIgnoreCase("loc1")) {
                WarpsAPI.Set(p, "Loc1");
                p.sendMessage("§b§lSET: §7O §b§lLoc1 §7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("loc2")) {
                WarpsAPI.Set(p, "Loc2");
                p.sendMessage("§b§lSET: §7O §b§lLoc2 §7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("loc3")) {
                WarpsAPI.Set(p, "Loc3");
                p.sendMessage("§b§lSET: §7O §b§lLoc3 §7§7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("loc4")) {
                WarpsAPI.Set(p, "Loc4");
                p.sendMessage("§b§lSET: §7O §b§lLoc4 §7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("loc5")) {
                WarpsAPI.Set(p, "Loc5");
                p.sendMessage("§7O §b§lLoc5 §7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("parkour")) {
                WarpsAPI.Set(p, "Parkour");
                p.sendMessage("§b§lSET: §7O §b§lParkour §7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("villagerparkour")) {
                WarpsAPI.Set(p, "VillagerParkour");
                p.sendMessage("§b§lSET: §7O §b§lVillagerParkour §7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("fps")) {
                WarpsAPI.Set(p, "Fps");
                p.sendMessage("§b§lSET: §7A §b§lFps §7foi setada com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("evento")) {
                WarpsAPI.Set(p, "Evento");
                p.sendMessage("§aVoc\u00ea setou o local do Evento");
                return true;
            }
            if (args[0].equalsIgnoreCase("1v1")) {
                WarpsAPI.Set(p, "1v1");
                p.sendMessage("§b§lSET: §7A §b§l1v1 §7foi setada com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("1v1loc1")) {
                WarpsAPI.Set(p, "1v1loc1");
                p.sendMessage("§b§lSET: §7O §b§l1v1Loc1 §7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("1v1loc2")) {
                WarpsAPI.Set(p, "1v1loc2");
                p.sendMessage("§b§lSET: §7O §b§l1v1Loc2 §7foi setado com sucesso!");
                return true;
            }
            if (args[0].equalsIgnoreCase("challenge")) {
                WarpsAPI.Set(p, "Challenge");
                p.sendMessage("§aVoc\u00ea setou o local do Lava Challenge");
                return true;
            }
            if (args[0].equalsIgnoreCase("knockback")) {
                WarpsAPI.Set(p, "Knockback");
                p.sendMessage("§aVoc\u00ea setou o local da Warp Knockback");
                return true;
            }
            if (args[0].equalsIgnoreCase("main")) {
                WarpsAPI.Set(p, "Main");
                p.sendMessage("§aVoc\u00ea setou o local da Warp Main");
                return true;
            }
            if (args[0].equalsIgnoreCase("fisherman")) {
                WarpsAPI.Set(p, "Fisherman");
                p.sendMessage("§aVoc\u00ea setou o local da Warp Fisherman");
                return true;
            }
        }
        return false;
    }
}
