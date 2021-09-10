package tk.maze.pvp.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.spigotmc.ProtocolInjector;

import net.minecraft.server.v1_7_R4.ChatSerializer;
import net.minecraft.server.v1_7_R4.IChatBaseComponent;
import net.minecraft.server.v1_7_R4.Packet;
import net.minecraft.server.v1_7_R4.PacketPlayOutChat;
import tk.maze.pvp.Main;
import tk.maze.pvp.bossbar.api.BossBarAPI;
import tk.maze.pvp.commands.GiveAllCommand;
import tk.maze.pvp.conf.cfConfig;
import tk.maze.pvp.conf.cfGrupo;
import tk.maze.pvp.conf.cfKitdiario;
import tk.maze.pvp.conf.cfPermiss\u00e3o;
import tk.maze.pvp.conf.cfStatus;
import tk.maze.pvp.conf.cfTempGrupo;
import tk.maze.pvp.events.CorGrupo;
import tk.maze.pvp.habilidades.Ajnin;
import tk.maze.pvp.habilidades.Ninja;
import tk.maze.pvp.habilidades.Strong;
import tk.maze.pvp.invencivel.Prote\u00e7\u00e3o;
import tk.maze.pvp.nametag.Array;
import tk.maze.pvp.nametag.NametagManager;
import tk.maze.pvp.nametag.NametagUtils;
import tk.maze.pvp.nametag.PlayerLoader;
import tk.maze.pvp.scoreboard.sScoreAPI;

public class API {
	public static ArrayList<Player> inCombat;
	private static HashMap<Player, String> Warp;

	static {
		API.inCombat = new ArrayList<Player>();
		API.Warp = new HashMap<Player, String>();
	}

	public static void BarAPI(final Player p, final String menssagem) {
		final int numero = 20;
		BossBarAPI.setMessage(p, menssagem);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				BossBarAPI.removeBar(p);
			}
		}, (long) (numero * 4));
	}

	public static void checarGrupo(final Player p) {
		if (cfGrupo.pegargrupo().get("grupos." + p.getUniqueId() + ".grupo") == null) {
			cfGrupo.setarGrupo(p, "Membro");
			cfGrupo.salvarconfiguracao();
		} else if (cfGrupo.pegargrupo().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit") == null) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "PvP");
			cfConfig.salvarconfiguracao();
		}
	}

	public static void setarKitPadrao(final Player p) {
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("PvP")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "PvP");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Archer")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Archer");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Kangaroo")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Kangaroo");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit")
				.equals("Fisherman")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit",
					(Object) "Fisherman");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Cactus")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Cactus");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Monk")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Monk");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Ninja")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Ninja");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Phantom")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Phantom");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Grappler")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Grappler");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Viper")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Viper");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Snail")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Snail");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Hulk")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Hulk");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Timelord")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Timelord");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Thor")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Thor");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Switcher")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Switcher");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit")
				.equals("Gladiator")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit",
					(Object) "Gladiator");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Stomper")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Stomper");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Magma")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Magma");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Grandpa")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Grandpa");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Ajnin")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Ajnin");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit")
				.equals("FireLauncher")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit",
					(Object) "FireLauncher");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Strong")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Strong");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals("Sumo")) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "Sumo");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit").equals(null)) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "PvP");
			cfConfig.salvarconfiguracao();
		}
	}

	public static void corGrupo(final Player p) {
		if (cfGrupo.ChecarGrupo(p, "Dono")) {
			CorGrupo.setarTag(p, "�4�l");
		} else if (cfGrupo.ChecarGrupo(p, "Gerente")) {
			CorGrupo.setarTag(p, "�3�l");
		} else if (cfGrupo.ChecarGrupo(p, "Admin")) {
			CorGrupo.setarTag(p, "�c�l");
		} else if (cfGrupo.ChecarGrupo(p, "Mod+")) {
			CorGrupo.setarTag(p, "�5�l");
		} else if (cfGrupo.ChecarGrupo(p, "Mod")) {
			CorGrupo.setarTag(p, "�5�l");
		} else if (cfGrupo.ChecarGrupo(p, "Trial")) {
			CorGrupo.setarTag(p, "�5�l");
		} else if (cfGrupo.ChecarGrupo(p, "Gc")) {
			CorGrupo.setarTag(p, "�1�l");
		} else if (cfGrupo.ChecarGrupo(p, "Youtuber+")) {
			CorGrupo.setarTag(p, "�3�l");
		} else if (cfGrupo.ChecarGrupo(p, "Builder")) {
			CorGrupo.setarTag(p, "�2�l");
		} else if (cfGrupo.ChecarGrupo(p, "Builder+")) {
			CorGrupo.setarTag(p, "�2�l");
		} else if (cfGrupo.ChecarGrupo(p, "Helper")) {
			CorGrupo.setarTag(p, "�9�l");
		} else if (cfGrupo.ChecarGrupo(p, "Youtuber")) {
			CorGrupo.setarTag(p, "�b�l�l");
		} else if (cfGrupo.ChecarGrupo(p, "S-Pro")) {
			CorGrupo.setarTag(p, "�e�l");
		} else if (cfGrupo.ChecarGrupo(p, "Pro")) {
			CorGrupo.setarTag(p, "�6�l");
		} else if (cfGrupo.ChecarGrupo(p, "Mvp")) {
			CorGrupo.setarTag(p, "�9�l");
		} else if (cfGrupo.ChecarGrupo(p, "Light")) {
			CorGrupo.setarTag(p, "�a�l");
		} else if (cfGrupo.ChecarGrupo(p, "Membro")) {
			CorGrupo.setarTag(p, "�7�l");
		}
	}

	public static void acharTag(final Player p) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				API.checarGrupo(p);
				if (cfGrupo.ChecarGrupo(p, "Dono")) {
					p.chat("/tag dono");
				}
				if (cfGrupo.ChecarGrupo(p, "Admin")) {
					p.chat("/tag admin");
				}
				if (cfGrupo.ChecarGrupo(p, "Gerente")) {
					p.chat("/tag gerente");
				}
				if (cfGrupo.ChecarGrupo(p, "Mod+")) {
					p.chat("/tag mod+");
				}
				if (cfGrupo.ChecarGrupo(p, "Mod")) {
					p.chat("/tag mod");
				}
				if (cfGrupo.ChecarGrupo(p, "Gc")) {
					p.chat("/tag gc");
				}
				if (cfGrupo.ChecarGrupo(p, "Trial")) {
					p.chat("/tag trial");
				}
				if (cfGrupo.ChecarGrupo(p, "Youtuber+")) {
					p.chat("/tag youtuber+");
				}
				if (cfGrupo.ChecarGrupo(p, "Builder")) {
					p.chat("/tag builder");
				}
				if (cfGrupo.ChecarGrupo(p, "Builder+")) {
					p.chat("/tag builder+");
				}
				if (cfGrupo.ChecarGrupo(p, "Helper")) {
					p.chat("/tag ajudante");
				}
				if (cfGrupo.ChecarGrupo(p, "Youtuber")) {
					p.chat("/tag youtuber");
				}
				if (cfGrupo.ChecarGrupo(p, "Pro")) {
					p.chat("/tag ultimate");
				}
				if (cfGrupo.ChecarGrupo(p, "S-Pro")) {
					p.chat("/tag semiyt");
				}
				if (cfGrupo.ChecarGrupo(p, "Mvp")) {
					p.chat("/tag premium");
				}
				if (cfGrupo.ChecarGrupo(p, "Light")) {
					p.chat("/tag light");
				}
				if (cfGrupo.ChecarGrupo(p, "Membro")) {
					p.chat("/tag normal");
				}
				if (GiveAllCommand.pro && cfGrupo.ChecarGrupo(p, "Membro")) {
					p.chat("/tag ultimate");
				}
				if (GiveAllCommand.mvp && cfGrupo.ChecarGrupo(p, "Membro")) {
					p.chat("/tag premium");
				}
				if (GiveAllCommand.light && cfGrupo.ChecarGrupo(p, "Membro")) {
					p.chat("/tag light");
				}
			}
		}, 2L);
	}

	public static void checarAlgumasCoisas(final Player p) {
		if (!cfGrupo.ChecarGrupo(p, "Dono") && !cfGrupo.ChecarGrupo(p, "Gerente") && !cfGrupo.ChecarGrupo(p, "Admin")
				&& !cfGrupo.ChecarGrupo(p, "Mod+") && !cfGrupo.ChecarGrupo(p, "Mod")
				&& !cfGrupo.ChecarGrupo(p, "Youtuber+") && !cfGrupo.ChecarGrupo(p, "Pro")
				&& !cfGrupo.ChecarGrupo(p, "Youtuber")
				&& cfKitdiario.pegargrupo().get("kitdiario." + p.getUniqueId() + ".dia") == null) {
			p.sendMessage("�e�lKITDIARIO�7: �fVoc\u00ea j\u00e1 pode pegar o seu kit di\u00e1rio!");
		}
		sendItems(p);
		if (cfTempGrupo.pegargrupo().get("tempgrupos." + p.getUniqueId() + ".Dia") != null
				&& cfTempGrupo.pegargrupo().get("tempgrupos." + p.getUniqueId() + ".Mes") != null
				&& cfTempGrupo.pegargrupo().get("tempgrupos." + p.getUniqueId() + ".Ano") != null
				&& cfTempGrupo.pegargrupo().get("tempgrupos." + p.getUniqueId() + ".Hora") != null
				&& cfTempGrupo.pegargrupo().get("tempgrupos." + p.getUniqueId() + ".Minuto") != null
				&& cfTempGrupo.pegargrupo().get("tempgrupos." + p.getUniqueId() + ".Segundos") != null
				&& (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Dia") < CalendarioAPI
						.PegarCalendario(CalendarioAPI.Calendario.Dia)
						|| (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Dia") == CalendarioAPI
								.PegarCalendario(CalendarioAPI.Calendario.Dia)
								&& (cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
										|| cfGrupo.ChecarGrupo(p, "Light"))))
				&& (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Mes") < CalendarioAPI
						.PegarCalendario(CalendarioAPI.Calendario.Mes)
						|| (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Mes") == CalendarioAPI
								.PegarCalendario(CalendarioAPI.Calendario.Mes)
								&& (cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
										|| cfGrupo.ChecarGrupo(p, "Light"))))
				&& (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Ano") < CalendarioAPI
						.PegarCalendario(CalendarioAPI.Calendario.Ano)
						|| (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Ano") == CalendarioAPI
								.PegarCalendario(CalendarioAPI.Calendario.Ano)
								&& (cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
										|| cfGrupo.ChecarGrupo(p, "Light"))))
				&& (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Hora") < CalendarioAPI
						.PegarCalendario(CalendarioAPI.Calendario.Hora)
						|| (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Hora") == CalendarioAPI
								.PegarCalendario(CalendarioAPI.Calendario.Hora)
								&& (cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
										|| cfGrupo.ChecarGrupo(p, "Light"))))
				&& (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Minuto") < CalendarioAPI
						.PegarCalendario(CalendarioAPI.Calendario.Minuto)
						|| (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId()
								+ ".Minuto") == CalendarioAPI.PegarCalendario(CalendarioAPI.Calendario.Minuto)
								&& (cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
										|| cfGrupo.ChecarGrupo(p, "Light"))))
				&& (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId() + ".Segundos") < CalendarioAPI
						.PegarCalendario(CalendarioAPI.Calendario.Segundo)
						|| (cfTempGrupo.pegargrupo().getInt("tempgrupos." + p.getUniqueId()
								+ ".Segundos") == CalendarioAPI.PegarCalendario(CalendarioAPI.Calendario.Segundo)
								&& (cfGrupo.ChecarGrupo(p, "Pro") || cfGrupo.ChecarGrupo(p, "Mvp")
										|| cfGrupo.ChecarGrupo(p, "Light"))))) {
			mandarTitulo(p, "�b�lMAZETKs");
			mandarSubTitulo(p, "�b O seu VIP " + cfGrupo.pegargrupo().getString("grupos." + p.getUniqueId() + ".grupo")
					+ " �7acabou de expirar!");
			cfGrupo.salvarconfiguracao();
			Bukkit.getConsoleSender().sendMessage(
					"�b�l�lLower�f�lPvP �7: �fO VIP do jogador �6�l" + p.getName() + " �facabou de expirar!");
			p.sendMessage("�b O seu VIP " + cfGrupo.pegargrupo().getString("grupos." + p.getUniqueId() + ".grupo")
					+ " �7acabou de expirar!");
			cfTempGrupo.pegargrupo().set("tempgrupos." + p.getUniqueId() + ".Nick", (Object) null);
			cfTempGrupo.pegargrupo().set("tempgrupos." + p.getUniqueId() + ".grupo", (Object) null);
			cfTempGrupo.pegargrupo().set("tempgrupos." + p.getUniqueId() + ".Dia", (Object) null);
			cfTempGrupo.pegargrupo().set("tempgrupos." + p.getUniqueId() + ".Mes", (Object) null);
			cfTempGrupo.pegargrupo().set("tempgrupos." + p.getUniqueId() + ".Ano", (Object) null);
			cfTempGrupo.pegargrupo().set("tempgrupos." + p.getUniqueId() + ".Hora", (Object) null);
			cfTempGrupo.pegargrupo().set("tempgrupos." + p.getUniqueId() + ".Minuto", (Object) null);
			cfTempGrupo.pegargrupo().set("tempgrupos." + p.getUniqueId() + ".Segundos", (Object) null);
			cfTempGrupo.salvarconfiguracao();
			Player[] onlinePlayers;
			for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
				final Player todos = onlinePlayers[i];
				if (cfGrupo.ChecarGrupo(todos, "Dono") || cfGrupo.ChecarGrupo(todos, "Gerente")
						|| cfGrupo.ChecarGrupo(todos, "Admin")) {
					todos.sendMessage(
							"�fO VIP " + cfGrupo.pegargrupo().getString("grupos." + p.getUniqueId() + ".grupo")
									+ "�f do jogador �6�l" + p.getName() + " �facagou de expirar!");
				}
			}
			cfGrupo.setarGrupo(p, "Membro");
			if (cfGrupo.ChecarGrupo(p, "Dono")) {
				CorGrupo.setarTag(p, "�4�l");
			} else if (cfGrupo.ChecarGrupo(p, "Gerente")) {
				CorGrupo.setarTag(p, "�3�l");
			} else if (cfGrupo.ChecarGrupo(p, "Admin")) {
				CorGrupo.setarTag(p, "�c�l");
			} else if (cfGrupo.ChecarGrupo(p, "Mod+")) {
				CorGrupo.setarTag(p, "�5�l");
			} else if (cfGrupo.ChecarGrupo(p, "Mod")) {
				CorGrupo.setarTag(p, "�5�l");
			} else if (cfGrupo.ChecarGrupo(p, "Trial")) {
				CorGrupo.setarTag(p, "�5�l");
			} else if (cfGrupo.ChecarGrupo(p, "Youtuber+")) {
				CorGrupo.setarTag(p, "�3�l");
			} else if (cfGrupo.ChecarGrupo(p, "Builder")) {
				CorGrupo.setarTag(p, "�2�l");
			} else if (cfGrupo.ChecarGrupo(p, "Builder+")) {
				CorGrupo.setarTag(p, "�2�l");
			} else if (cfGrupo.ChecarGrupo(p, "Helper")) {
				CorGrupo.setarTag(p, "�e�l");
			} else if (cfGrupo.ChecarGrupo(p, "Youtuber")) {
				CorGrupo.setarTag(p, "�b�l�l");
			} else if (cfGrupo.ChecarGrupo(p, "S-Pro")) {
				CorGrupo.setarTag(p, "�e�l");
			} else if (cfGrupo.ChecarGrupo(p, "Pro")) {
				CorGrupo.setarTag(p, "�6�l");
			} else if (cfGrupo.ChecarGrupo(p, "Mvp")) {
				CorGrupo.setarTag(p, "�9�l");
			} else if (cfGrupo.ChecarGrupo(p, "Light")) {
				CorGrupo.setarTag(p, "�a�l");
			} else if (cfGrupo.ChecarGrupo(p, "Membro")) {
				CorGrupo.setarTag(p, "�7�l");
			}
			sScoreAPI.scoreboard(p);
			p.chat("/tag normal");
		}
	}

	public static void checarNameTag(final Player p) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				NametagManager.MandarTeamsParaJogador(p);
				NametagManager.Limpar(p.getName());
				final LinkedHashMap<String, String> pData = PlayerLoader.getPlayer(p.getName());
				if (pData != null) {
					String Prefix = pData.get("prefix");
					String Suffix = pData.get("suffix");
					if (Prefix != null) {
						Prefix = NametagUtils.formatColors(Prefix);
					}
					if (Suffix != null) {
						Suffix = NametagUtils.formatColors(Suffix);
					}
					if (Array.consolePrintEnabled) {
						System.out.println(
								"Setting prefix/suffix for " + p.getName() + ": " + Prefix + ", " + Suffix + " (user)");
					}
					NametagManager.Overlap(p.getName(), Prefix, Suffix);
				}
			}
		}, 1L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable) new Runnable() {
			@Override
			public void run() {
				API.acharTag(p);
			}
		}, 2L);
	}

	public static void checarConfig(final Player p) {
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".Nick") == null) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".Nick", (Object) p.getName());
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit") == null) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".PadraoKit", (Object) "PvP");
			cfConfig.salvarconfiguracao();
		}
		if (cfConfig.pegarconfig().get("configura\u00e7\u00e3o." + p.getUniqueId() + ".Tell") == null) {
			cfConfig.pegarconfig().set("configura\u00e7\u00e3o." + p.getUniqueId() + ".Tell", (Object) "Ativado");
			cfConfig.salvarconfiguracao();
		}
		cfConfig.salvarconfiguracao();
	}

	public static void checarPermissao(final Player p) {
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.monk") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.monk", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.ninja") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.ninja", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.phantom") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.phantom", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.grappler") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.grappler", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.viper") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.viper", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.snail") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.snail", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.hulk") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.hulk", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.timelord") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.timelord", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.thor") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.thor", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.switcher") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.switcher", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.gladiator") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.gladiator", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.endermage") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.endermage", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.stomper") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.stomper", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.magma") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.magma", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.grandpa") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.grandpa", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.ajnin") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.ajnin", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.firelauncher") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.firelauncher", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.strong") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.strong", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.forcefield") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.forcefield", "false");
		}
		if (cfPermiss\u00e3o.pegarpermissao().get("permiss\u00f5es." + p.getUniqueId() + ".kit.sumo") == null) {
			cfPermiss\u00e3o.setarPermissao(p, "kit.sumo", "false");
		}
	}

	public static ItemStack criarItem(final Player p, final Material material, final String nome, final String[] lore,
			final int quantidade, final short cor) {
		final ItemStack item = new ItemStack(material, quantidade, cor);
		final ItemMeta kitem = item.getItemMeta();
		kitem.setDisplayName(nome);
		kitem.setLore(Arrays.asList(lore));
		item.setItemMeta(kitem);
		return item;
	}

	public static String getWarp(final Player p) {
		if (API.Warp.containsKey(p)) {
			return API.Warp.get(p);
		}
		return "Spawn";
	}

	public static void setWarp(final Player p, final String warp) {
		API.Warp.put(p, warp);
	}

	public static void sendItems(final Player p) {
		if (getWarp(p) == "Spawn") {
			p.getInventory().setArmorContents((ItemStack[]) null);
			Ajnin.a.remove(p);
			Ninja.a.remove(p);
			Ninja.b.remove(p);
			Strong.fulliron.remove(p);
			p.setFoodLevel(20);
			p.setFireTicks(0);
			cfStatus.RemoverKS(p);
			setWarp(p, "Spawn");
			final ItemStack menu = new ItemStack(Material.MINECART);
			final ItemMeta kmenu = menu.getItemMeta();
			kmenu.setDisplayName("�b�lMenu �7- Em breve");
			menu.setItemMeta(kmenu);
			final ItemStack Kits = new ItemStack(Material.CHEST);
			final ItemMeta kKits = Kits.getItemMeta();
			kKits.setDisplayName("�aSelecionar kit");
			Kits.setItemMeta(kKits);
			final ItemStack Warps = new ItemStack(Material.PAPER);
			final ItemMeta kWarps = Warps.getItemMeta();
			kWarps.setDisplayName("�aSelcionar warp");
			Warps.setItemMeta(kWarps);
			final ItemStack Loja = new ItemStack(Material.DIAMOND);
			final ItemMeta kLoja = Loja.getItemMeta();
			kLoja.setDisplayName("�b�lLoja �7- Clique para abrir");
			Loja.setItemMeta(kLoja);
			final ItemStack Rank = new ItemStack(Material.FLOWER_POT_ITEM);
			final ItemMeta kRank = Rank.getItemMeta();
			kRank.setDisplayName("�a�lAJUSTES");
			Rank.setItemMeta(kRank);
			final ItemStack Heads = new ItemStack(Material.NOTE_BLOCK);
			final ItemMeta kHeads = Heads.getItemMeta();
			kHeads.setDisplayName("�b�l�lHEADS");
			kHeads.setLore(Arrays.asList("�7Selecione uma cabe\u00e7a!"));
			Heads.setItemMeta(kHeads);
			final ItemStack Caixas = new ItemStack(Material.ENDER_CHEST);
			final ItemMeta kCaixas = Caixas.getItemMeta();
			kCaixas.setDisplayName("�b�lKit diario �7- Clique para abrir");
			Caixas.setItemMeta(kCaixas);
			final ItemStack KitPadrao = new ItemStack(Material.getMaterial(351), 1, (short) 14);
			final ItemMeta kKitPadrao = KitPadrao.getItemMeta();
			kKitPadrao.setDisplayName("�b�lKit diario �7- Clique para abrir");
			KitPadrao.setItemMeta(kKitPadrao);
			final ItemStack Vidro = new ItemStack(Material.AIR, 1, (short) 7);
			final ItemMeta kVidro = Caixas.getItemMeta();
			kVidro.setDisplayName("");
			kVidro.setLore(Arrays.asList(""));
			Vidro.setItemMeta(kVidro);
			final ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);
			final BookMeta bm = (BookMeta) book.getItemMeta();
			bm.setAuthor("�b�l�lLower�f�lKits");
			bm.setTitle("�b�lLower �7- Clique para ler");
			final ArrayList<String> pages = new ArrayList<String>();
			pages.add(
					"�7Seja muito bem-vindo ao LowerKits v2. �7Gostar\u00edamos de inform\u00e1-los que ap\u00f3s muitos dias de duro trabalho e dedica\u00e7\u00e3o de cada membro da equipe, conseguimos trazer uma otima atualiza\u00e7ao!");
			bm.setPages(pages);
			book.setItemMeta((ItemMeta) bm);
			p.getInventory().clear();
			p.getInventory().setArmorContents((ItemStack[]) null);
			Prote\u00e7\u00e3o.setImortal(p, true);
			p.setHealth(20.0);
			p.setMaxHealth(20.0);
			sScoreAPI.scoreboard(p);
			CooldownAPI.tirarCooldown(p);
			WarpsAPI.Ir(p, "Spawn");
			cfKitdiario.pegargrupo().get("kitdiario." + p.getUniqueId() + ".dia");
			p.getInventory().setHeldItemSlot(4);
			p.getInventory().setItem(0, Kits);
			p.getInventory().setItem(1, Warps);
		}
	}

	public static int getAmount(final Player p, final Material m) {
		int amount = 0;
		ItemStack[] contents;
		for (int length = (contents = p.getInventory().getContents()).length, i = 0; i < length; ++i) {
			final ItemStack item = contents[i];
			if (item != null && item.getType() == m && item.getAmount() > 0) {
				amount += item.getAmount();
			}
		}
		return amount;
	}

	public static void mandarTitulo(final Player player, final String titulo) {
		if (((CraftPlayer) player).getHandle().playerConnection.networkManager.getVersion() < 45) {
			return;
		}
		((CraftPlayer) player).getHandle().playerConnection
				.sendPacket((Packet) new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.TITLE,
						ChatSerializer.a("{\"text\": \"\"}").a(titulo)));
	}

	public static void mandarSubTitulo(final Player player, final String titulo) {
		if (((CraftPlayer) player).getHandle().playerConnection.networkManager.getVersion() < 45) {
			return;
		}
		((CraftPlayer) player).getHandle().playerConnection
				.sendPacket((Packet) new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.SUBTITLE,
						ChatSerializer.a("{\"text\": \"\"}").a(titulo)));
	}

	public static void mandarActionBar(final Player player, final String titulo) {
		final CraftPlayer p = (CraftPlayer) player;
		if (p.getHandle().playerConnection.networkManager.getVersion() != 47) {
			return;
		}
		final IChatBaseComponent cbc = ChatSerializer.a("{\"text\": \"" + titulo + "\"}");
		final PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc);
		p.getHandle().playerConnection.sendPacket((Packet) ppoc);
		p.getHandle().playerConnection.sendPacket((Packet) ppoc);
	}

	public static void clear(final Player player) {
		if (((CraftPlayer) player).getHandle().playerConnection.networkManager.getVersion() < 45) {
			return;
		}
		((CraftPlayer) player).getHandle().playerConnection
				.sendPacket((Packet) new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.CLEAR));
	}

	public static void setHotbar(final Player p) {
		final ItemStack Kits = new ItemStack(Material.CHEST);
		final ItemMeta kKits = Kits.getItemMeta();
		kKits.setDisplayName("�aSelecionar kit");
		Kits.setItemMeta(kKits);
		final ItemStack Ranks = new ItemStack(Material.ENCHANTED_BOOK);
		final ItemMeta kRanks = Ranks.getItemMeta();
		kRanks.setDisplayName("�5�lRANKS");
		Ranks.setItemMeta(kRanks);
		final ItemStack Warps = new ItemStack(Material.PAPER);
		final ItemMeta kWarps = Warps.getItemMeta();
		kWarps.setDisplayName("�aSelcionar warp");
		Warps.setItemMeta(kWarps);
		final ItemStack Loja = new ItemStack(Material.DIAMOND);
		final ItemMeta kLoja = Loja.getItemMeta();
		kLoja.setDisplayName("�b�lLoja �7- Clique para abrir");
		Loja.setItemMeta(kLoja);
		final ItemStack Rank = new ItemStack(Material.FLOWER_POT_ITEM);
		final ItemMeta kRank = Rank.getItemMeta();
		kRank.setDisplayName("�a�nConfigura\u00e7\u00f5es pessoais!");
		kRank.setLore(Arrays.asList("�7Ajuste as suas configura\u00e7\u00f5es pessoais!"));
		Rank.setItemMeta(kRank);
		final ItemStack Heads = new ItemStack(Material.NOTE_BLOCK);
		final ItemMeta kHeads = Heads.getItemMeta();
		kHeads.setDisplayName("�b�l�lHEADS");
		Heads.setItemMeta(kHeads);
		final ItemStack Caixas = new ItemStack(Material.ENDER_CHEST);
		final ItemMeta kCaixas = Caixas.getItemMeta();
		kCaixas.setDisplayName("�b�lKit diario �7- Clique para abrir");
		Caixas.setItemMeta(kCaixas);
		final ItemStack KitPadrao = new ItemStack(Material.getMaterial(33), 1, (short) 14);
		final ItemMeta kKitPadrao = KitPadrao.getItemMeta();
		kKitPadrao.setDisplayName("�b�lKit diario �7- Clique para abrir");
		KitPadrao.setItemMeta(kKitPadrao);
		final ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);
		final BookMeta bm = (BookMeta) book.getItemMeta();
		bm.setAuthor("�b�l�lLower�f�lKits");
		bm.setTitle("�a�lAtualiza\u00e7\u00f5es de 2017");
		final ArrayList<String> pages = new ArrayList<String>();
		pages.add("�7");
		bm.setPages(pages);
		book.setItemMeta((ItemMeta) bm);
		final ItemStack Vidro = new ItemStack(Material.AIR, 1, (short) 7);
		final ItemMeta kVidro = Caixas.getItemMeta();
		kVidro.setDisplayName("");
		kVidro.setLore(Arrays.asList(""));
		Vidro.setItemMeta(kVidro);
		cfKitdiario.pegargrupo().get("kitdiario." + p.getUniqueId() + ".dia");
		p.getInventory().setHeldItemSlot(4);
		p.getInventory().setItem(4, Kits);
		p.getInventory().setItem(2, Warps);
		p.getInventory().setItem(6, Loja);
	}

	public static void sendWarn(final String msg) {
		Player[] onlinePlayers;
		for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
			final Player todos = onlinePlayers[i];
			if (cfGrupo.ChecarGrupo(todos, "Dono") || cfGrupo.ChecarGrupo(todos, "Gerente")) {
				Player[] onlinePlayers2;
				for (int length2 = (onlinePlayers2 = Bukkit.getOnlinePlayers()).length, j = 0; j < length2; ++j) {
					final Player k = onlinePlayers2[j];
					if ((cfGrupo.ChecarGrupo(k, "Dono") || cfGrupo.ChecarGrupo(k, "Gerente")
							|| cfGrupo.ChecarGrupo(k, "Admin") || cfGrupo.ChecarGrupo(k, "Mod+")
							|| cfGrupo.ChecarGrupo(k, "Mod") || cfGrupo.ChecarGrupo(k, "Trial")
							|| cfGrupo.ChecarGrupo(k, "Youtuber+") || cfGrupo.ChecarGrupo(k, "Helper"))
							&& ArraysAPI.Monitor.contains(todos)) {
						todos.sendMessage(msg);
						return;
					}
				}
			}
		}
	}
}
