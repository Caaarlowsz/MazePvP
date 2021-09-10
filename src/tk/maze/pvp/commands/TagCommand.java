package tk.maze.pvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.maze.pvp.conf.cfGrupo;
import tk.maze.pvp.nametag.Array;
import tk.maze.pvp.nametag.NameTagChangeEvento;
import tk.maze.pvp.nametag.NametagUtils;
import tk.maze.pvp.nametag.PlayerLoader;
import tk.maze.pvp.scoreboard.sScoreAPI;

public class TagCommand implements CommandExecutor {
	public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] Args) {
		final Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("tag") && Args.length == 0) {
			p.sendMessage("�aUtilize /tag ou /taglist");
			return true;
		}
		if (Args[0].equalsIgnoreCase("beta")) {
			if (cfGrupo.ChecarGrupo(p, "premium")) {
				p.sendMessage("�aSua tag foi alterada para: �1�lBET");
				p.setDisplayName("�1�lBETA �1" + p.getName());
				String prefix = "�1�lBETA �1";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cTag inexistente.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("irineu")) {
			if (cfGrupo.ChecarGrupo(p, "Dono")) {
				p.sendMessage("�aSua tag foi alterada para �9�lIRINEU");
				p.setDisplayName("�9�lIRINEU �9" + p.getName());
				String prefix = "�9�lIRINEU �9";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cTag inexistente.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("amor")) {
			if (cfGrupo.ChecarGrupo(p, "Dono")) {
				p.sendMessage("�aSua tag foi alterada para: �4�lAMOR");
				p.setDisplayName("�4�lAMOR �4" + p.getName());
				String prefix = "�4�lAMOR �4";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cTag inexistente.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("gc")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Gc")
					|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Builder+")
					|| cfGrupo.ChecarGrupo(p, "Mod+")) {
				p.sendMessage("�aSua tag foi alterada para: �1�lGCDETECTOR");
				p.setDisplayName("�1�lGC �1" + p.getName());
				String prefix = "�1�lGC �1";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cTag inexistente.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("builder+")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Admin")
					|| cfGrupo.ChecarGrupo(p, "Builder+") || cfGrupo.ChecarGrupo(p, "Mod+")) {
				p.sendMessage("�aSua tag foi alterada para: �2�lBUILDER+");
				p.setDisplayName("�2�lBUILDER+ �2" + p.getName());
				String prefix = "�2�lBUILDER+ �2";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cTag inexistente.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("dono")) {
			if (cfGrupo.ChecarGrupo(p, "Dono")) {
				p.sendMessage("�aSua tag foi alterada para: �4�lDONO");
				p.setDisplayName("�4�lDONO �4" + p.getName());
				String prefix = "�4�lDONO �4";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("gerente")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente")
					|| cfGrupo.ChecarGrupo(p, "Admin")) {
				p.sendMessage("�aSua tag foi alterada para: �c�lGERENTE");
				p.setDisplayName("�c�lGERENTE �c" + p.getName());
				String prefix = "�c�lGERENTE �c";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("admin")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Admin")) {
				p.sendMessage("�aSua tag foi alterada para: �c�lADMIN");
				p.setDisplayName("�c�lADMIN �c" + p.getName());
				String prefix = "�c�lADMIN �c";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("mod+")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Admin")
					|| cfGrupo.ChecarGrupo(p, "Mod+")) {
				p.sendMessage("�aSua tag foi alterada para: �5�lMOD+");
				p.setDisplayName("�5�lMOD+ �5" + p.getName());
				String prefix = "�5�lMOD+ �5";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�aVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("mod")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Admin")
					|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Mod")) {
				p.sendMessage("�aSua tag foi alterada para: �5�lMOD");
				p.setDisplayName("�5�lMOD �5" + p.getName());
				String prefix = "�5�lMOD �5";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("trial")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Admin")
					|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Mod")
					|| cfGrupo.ChecarGrupo(p, "Trial")) {
				p.sendMessage("�aSua tag foi alterada para: �d�lTRIAL");
				p.setDisplayName("�d�lTRIAL �d" + p.getName());
				String prefix = "�d�lTRIAL �d";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("builder")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Gerente")
					|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Builder")) {
				p.sendMessage("�aSua tag foi alterada para: �2�lBUILDER");
				p.setDisplayName("�2�lBUILDER �2" + p.getName());
				String prefix = "�2�lBUILDER �2";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("ajudante")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Admin")
					|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Mod")
					|| cfGrupo.ChecarGrupo(p, "Trial") || cfGrupo.ChecarGrupo(p, "Helper")) {
				p.sendMessage("�aSua tag foi alterada para: �9�lAJUDANTE");
				p.setDisplayName("�9�lAJUDANTE �9" + p.getName());
				String prefix = "�9�lAJUDANTE �9";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("youtuber+")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Admin")
					|| cfGrupo.ChecarGrupo(p, "Youtuber+")) {
				p.sendMessage("�aSua tag foi alterada para: �3�lYOUTUBER+");
				p.setDisplayName("�3�lYT+ �3" + p.getName());
				String prefix = "�3�lYT+ �3";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("youtuber")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Admin")
					|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Youtuber")) {
				p.sendMessage("�b�lLower�f�lKits �aSua tag foi alterada para: �b�lYOUTUBER");
				p.setDisplayName("�b�lYT �b" + p.getName());
				String prefix = "�b�lYT �b";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("semiyt")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Admin")
					|| cfGrupo.ChecarGrupo(p, "S-Pro")) {
				p.sendMessage("�aSua tag foi alterada para: �e�lSEMIYT");
				p.setDisplayName("�e�lSEMIYT �e" + p.getName());
				String prefix = "�e�lSEMIYT �e";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("ultimate")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Gerente") || cfGrupo.ChecarGrupo(p, "Builder")
					|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Pro")
					|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Youtuber+")
					|| cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Mod")
					|| cfGrupo.ChecarGrupo(p, "Mvp")) {
				p.sendMessage("�aSua tag foi alterada para: �5�lULTIMATE");
				p.setDisplayName("�d�lULTIMATE �d" + p.getName());
				String prefix = "�d�lULTIMATE �d";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("premium")) {
			if (cfGrupo.ChecarGrupo(p, "Dono") || cfGrupo.ChecarGrupo(p, "Builder") || cfGrupo.ChecarGrupo(p, "Gerente")
					|| cfGrupo.ChecarGrupo(p, "Admin") || cfGrupo.ChecarGrupo(p, "Pro")
					|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Youtuber+")
					|| cfGrupo.ChecarGrupo(p, "Helper") || cfGrupo.ChecarGrupo(p, "Trial")
					|| cfGrupo.ChecarGrupo(p, "Mvp") || cfGrupo.ChecarGrupo(p, "Mod+")
					|| cfGrupo.ChecarGrupo(p, "Mod")) {
				p.sendMessage("�aSua tag foi alterada para: �6�lPREMIUM �6");
				p.setDisplayName("�6�lPREMIUM �6" + p.getName());
				String prefix = "�6�lPREMIUM �6";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("light")) {
			if (cfGrupo.ChecarGrupo(p, "Light") || cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
					|| cfGrupo.ChecarGrupo(p, "S-Pro") || cfGrupo.ChecarGrupo(p, "Youtuber")
					|| cfGrupo.ChecarGrupo(p, "Youtuber+") || cfGrupo.ChecarGrupo(p, "Mvp")
					|| cfGrupo.ChecarGrupo(p, "Youtuber") || cfGrupo.ChecarGrupo(p, "Youtuber+")
					|| cfGrupo.ChecarGrupo(p, "Mod+") || cfGrupo.ChecarGrupo(p, "Trial")
					|| cfGrupo.ChecarGrupo(p, "Helper") || cfGrupo.ChecarGrupo(p, "Helper")
					|| cfGrupo.ChecarGrupo(p, "Mod")) {
				p.sendMessage("�aSua tag foi alterada para: �a�lLIGHT");
				p.setDisplayName("�a�lLIGHT �a" + p.getName());
				String prefix = "�a�lLIGHT �a";
				NameTagChangeEvento.NametagChangeReason reason = null;
				reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
				prefix = NametagUtils.formatColors(prefix);
				String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
				reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
				suffix = NametagUtils.formatColors(suffix);
				Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
				PlayerLoader.update(p.getName(), prefix, suffix);
			} else {
				p.sendMessage("�cVoc\u00ea n\u00e3o possui esta tag.");
			}
			return true;
		}
		if (Args[0].equalsIgnoreCase("normal")) {
			p.sendMessage("�aSua tag foi alterada para: �7�lNORMAL");
			p.setDisplayName("�7" + p.getName());
			String prefix = "�7";
			NameTagChangeEvento.NametagChangeReason reason = null;
			reason = NameTagChangeEvento.NametagChangeReason.SET_PREFIX;
			prefix = NametagUtils.formatColors(prefix);
			String suffix = " �7(" + sScoreAPI.getRank(p) + "�7)";
			reason = NameTagChangeEvento.NametagChangeReason.SET_SUFFIX;
			suffix = NametagUtils.formatColors(suffix);
			Array.SetarNameTagSoft(p.getName(), prefix, suffix, reason);
			PlayerLoader.update(p.getName(), prefix, suffix);
		} else {
			p.sendMessage("�cEssa tag n\u00e3o existe!");
		}
		return true;
	}
}
