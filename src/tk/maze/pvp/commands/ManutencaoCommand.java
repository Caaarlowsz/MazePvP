package tk.maze.pvp.commands;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;
import tk.maze.pvp.bans.Config;
import org.bukkit.Bukkit;
import tk.maze.pvp.conf.cfGrupo;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class ManutencaoCommand implements CommandExecutor, Listener
{
    public static boolean manutencao;
    
    static {
        ManutencaoCommand.manutencao = false;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("manutencao")) {
            if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente")) {
                p.sendMessage("§c§l(!) §cVoc\u00ea nao possui permissao para executar este comando.");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§b§lMANUTEN\u00c7AO: §7/manutencao (on | off)");
                return true;
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("on")) {
                    if (ManutencaoCommand.manutencao) {
                        p.sendMessage("§b§lMANUTEN\u00c7AO: §7O modo manuten\u00e7\u00e3o j\u00e1 est\u00e1 ativado!");
                        return true;
                    }
                    ManutencaoCommand.manutencao = true;
                    p.sendMessage("§b§lMANUTEN\u00c7AO: §7Voc\u00ea §a§lATIVOU §7o modo manuten\u00e7\u00e3o!");
                    Player[] onlinePlayers;
                    for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                        final Player todos = onlinePlayers[i];
                        if (!cfGrupo.ChecarGrupo(todos, "Dono") && !cfGrupo.ChecarGrupo(todos, "Gerente") && !cfGrupo.ChecarGrupo(todos, "Admin") && !cfGrupo.ChecarGrupo(todos, "Mod+") && !cfGrupo.ChecarGrupo(todos, "Mod") && !cfGrupo.ChecarGrupo(todos, "Trial")) {
                            todos.kickPlayer("§c§lSERVIDOR FECHADO!\n   §7O servidor acabou de ser fechado para manuten\u00e7\u00f5es\nAssim que poss\u00edvel, n\u00f3s estaremos de volta!\n§7Atenciosamente, §b§lLower§f§lMC.");
                            return true;
                        }
                    }
                    Config.getConfig().saveManutencao();
                    return true;
                }
                else if (args[0].equalsIgnoreCase("off")) {
                    if (!ManutencaoCommand.manutencao) {
                        p.sendMessage("§b§lMANUTEN\u00c7AO: §7O modo manuten\u00e7\u00e3o j\u00e1 est\u00e1 desativado!");
                        return true;
                    }
                    ManutencaoCommand.manutencao = false;
                    p.sendMessage("§b§lMANUTEN\u00c7AO: §7Voc\u00ea §c§lDESATIVOU §7o modo manuten\u00e7\u00e3o!");
                    return true;
                }
            }
        }
        return false;
    }
    
    @EventHandler
    public void aoEntrarManutencao(final PlayerLoginEvent e) {
        final Player p = e.getPlayer();
        if (ManutencaoCommand.manutencao && !cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin") && !cfGrupo.ChecarGrupo(p, "Builder") && !cfGrupo.ChecarGrupo(p, "Trial") && !cfGrupo.ChecarGrupo(p, "Mod") && !cfGrupo.ChecarGrupo(p, "Mod+")) {
            e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "§c§lMANUTENCAO...\n§7O servidor est\u00e1 em manuten\u00e7\u00e3o. Estamos com certeza aprimorando\n§7a sua jogatina. Contamos com a compreens\u00e3o de todos\n§7Atenciosamente, §b§lLower§f§lMC");
        }
    }
}
