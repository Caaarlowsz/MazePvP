package tk.maze.pvp.API;

import tk.maze.pvp.scoreboard.sScoreAPI;
import tk.maze.pvp.conf.cfConfig;
import org.bukkit.entity.Player;

public class PadraoAPI
{
    public static void setKit(final Player p, final String kit) {
        cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object)kit);
        cfConfig.salvarconfiguracao();
        sScoreAPI.scoreboard(p);
    }
}
