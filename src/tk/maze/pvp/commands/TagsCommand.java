package tk.maze.pvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.conf.cfGrupo;

public class TagsCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
		final Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("taglist")) {
			if (cfGrupo.ChecarGrupo(p, "Dono")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §4§lDONO");
				p.sendMessage("§7 -  §c§lADMIN");
				p.sendMessage("§7 -  §c§lGERENTE");
				p.sendMessage("§7 -  §d§lMOD+");
				p.sendMessage("§7 -  §d§lMOD");
				p.sendMessage("§7 -  §1§lGC");
				p.sendMessage("§7 -  §5§lTRIAL");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §2§lBUILDER+");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Admin")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §c§lADMIN");
				p.sendMessage("§7 -  §c§lGERENTE");
				p.sendMessage("§7 -  §d§lMOD+");
				p.sendMessage("§7 -  §d§lMOD");
				p.sendMessage("§7 -  §1§lGC");
				p.sendMessage("§7 -  §5§lTRIAL");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §2§lBUILDER+");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Gerente")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §c§lGERENTE");
				p.sendMessage("§7 -  §d§lMOD+");
				p.sendMessage("§7 -  §d§lMOD");
				p.sendMessage("§7 -  §1§lGC");
				p.sendMessage("§7 -  §5§lTRIAL");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §2§lBUILDER+");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Mod+")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §1§lGC");
				p.sendMessage("§7 -  §5§lTRIAL");
				p.sendMessage("§7 -  §2§lBUILDER+");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Mod")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §1§lGC");
				p.sendMessage("§7 -  §5§lTRIAL");
				p.sendMessage("§7 -  §2§lBUILDER+");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Gc")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §1§lGC");
				p.sendMessage("§7 -  §5§lTRIAL");
				p.sendMessage("§7 -  §2§lBUILDER+");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Trial")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §5§lTRIAL");
				p.sendMessage("§7 -  §2§lBUILDER+");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Builder+")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §2§lBUILDER+");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Builder")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §2§lBUILDER");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Helper")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §9§lAJUDANTE");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Youtuber+")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §3§lYOUTUBER+");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Youtuber")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §b§lYOUTUBER");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "S-Pro")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §e§lSEMIYT");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Pro")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §d§lULTIMATE");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Mvp")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §6§lPREMIUM");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Light")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §a§lLIGHT");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
			if (cfGrupo.ChecarGrupo(p, "Membro")) {
				p.sendMessage(" ");
				p.sendMessage("§7 -  §7§lNORMAL");
				return true;
			}
		}
		return false;
	}
}
