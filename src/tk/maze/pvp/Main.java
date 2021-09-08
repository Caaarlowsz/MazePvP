package tk.maze.pvp;

import tk.maze.pvp.packets.SentPacket;
import tk.maze.pvp.packets.PacketSendEvent;
import tk.maze.pvp.packets.ReceivedPacket;
import tk.maze.pvp.packets.PacketReceiveEvent;
import tk.maze.pvp.packets.Cancellable;
import org.bukkit.event.Event;
import tk.maze.pvp.packets.PacketHandler;
import tk.maze.pvp.conf.cfStatus;
import tk.maze.pvp.conf.cfConfig;
import tk.maze.pvp.conf.cfPermiss\u00e3o;
import tk.maze.pvp.conf.cfTempGrupo;
import tk.maze.pvp.conf.cfKitdiario;
import tk.maze.pvp.conf.cfGrupo;
import tk.maze.pvp.conf.cfEntrou;
import tk.maze.pvp.conf.WarpsConfig;
import tk.maze.pvp.commands.WarpsCommand;
import tk.maze.pvp.commands.GiveKitCommand;
import tk.maze.pvp.commands.GiveCommand;
import tk.maze.pvp.commands.GiveVipCommand;
import tk.maze.pvp.commands.AddPermissaoCommand;
import tk.maze.pvp.commands.HeadCommand;
import tk.maze.pvp.commands.ClearAllCommand;
import tk.maze.pvp.commands.MonitorarCommand;
import tk.maze.pvp.commands.KickAllCommand;
import tk.maze.pvp.commands.StopServerCommand;
import tk.maze.pvp.commands.TpHereCommand;
import tk.maze.pvp.commands.IpCommand;
import tk.maze.pvp.commands.AutoSoupCommand;
import tk.maze.pvp.commands.CageCommand;
import tk.maze.pvp.commands.cRemoveHead;
import tk.maze.pvp.commands.InvisCommand;
import tk.maze.pvp.commands.VisCommand;
import tk.maze.pvp.commands.TpAllCommand;
import tk.maze.pvp.commands.SkitCommand;
import tk.maze.pvp.commands.PingCommand;
import tk.maze.pvp.commands.AplicarCommand;
import tk.maze.pvp.commands.InvseeCommand;
import tk.maze.pvp.commands.AccountCommand;
import tk.maze.pvp.commands.BcCommand;
import tk.maze.pvp.commands.LojaCommand;
import tk.maze.pvp.bans.PunishCheckCommand;
import tk.maze.pvp.commands.TellCommand;
import tk.maze.pvp.umVum.CmdsSpeed;
import tk.maze.pvp.commands.Fake;
import tk.maze.pvp.commands.SpawnCommand;
import tk.maze.pvp.commands.SetCommand;
import tk.maze.pvp.commands.ReportCommand;
import tk.maze.pvp.commands.YoutuberCommand;
import tk.maze.pvp.commands.GamemodeCommand;
import tk.maze.pvp.commands.TpCommand;
import tk.maze.pvp.commands.TagsCommand;
import tk.maze.pvp.commands.TagCommand;
import tk.maze.pvp.commands.ScoreCommand;
import tk.maze.pvp.commands.FlyCommand;
import tk.maze.pvp.commands.RemoveAllCommand;
import tk.maze.pvp.commands.GiveAllCommand;
import tk.maze.pvp.commands.KitCommand;
import tk.maze.pvp.commands.GroupSetCommand;
import tk.maze.pvp.bans.MuteCommand;
import tk.maze.pvp.bans.UnbanCommand;
import tk.maze.pvp.bans.KickCommand;
import tk.maze.pvp.bans.TempMuteCommand;
import tk.maze.pvp.bans.TempBanCommand;
import tk.maze.pvp.bans.IPBanCommand;
import tk.maze.pvp.bans.WarnCommand;
import tk.maze.pvp.bans.BanCommand;
import org.bukkit.command.CommandExecutor;
import tk.maze.pvp.commands.GiveCoinsCommand;
import org.bukkit.plugin.PluginManager;
import tk.maze.pvp.commands.WarpCommand;
import tk.maze.pvp.combatlog.CombatLog;
import tk.maze.pvp.anticheat.hacks.flyspeed.FlySpeed;
import tk.maze.pvp.anticheat.hacks.ForceField;
import tk.maze.pvp.anticheat.hacks.Macro;
import tk.maze.pvp.anticheat.hacks.FastClick;
import tk.maze.pvp.anticheat.hacks.AutoSoup;
import tk.maze.pvp.anticheat.Events;
import tk.maze.pvp.umVum.Speed1v1;
import tk.maze.pvp.umVum.Events1v1;
import tk.maze.pvp.habilidades.Sumo;
import tk.maze.pvp.habilidades.Strong;
import tk.maze.pvp.habilidades.FireLauncher;
import tk.maze.pvp.habilidades.Viper;
import tk.maze.pvp.habilidades.Timelord;
import tk.maze.pvp.habilidades.Thor;
import tk.maze.pvp.habilidades.Switcher;
import tk.maze.pvp.habilidades.Stomper;
import tk.maze.pvp.habilidades.Snail;
import tk.maze.pvp.habilidades.Phantom;
import tk.maze.pvp.habilidades.Ninja;
import tk.maze.pvp.habilidades.Monk;
import tk.maze.pvp.habilidades.Magma;
import tk.maze.pvp.habilidades.Kangaroo;
import tk.maze.pvp.habilidades.Hulk;
import tk.maze.pvp.habilidades.Grappler;
import tk.maze.pvp.habilidades.Gladiator;
import tk.maze.pvp.habilidades.Fisherman;
import tk.maze.pvp.habilidades.Ajnin;
import tk.maze.pvp.jumps.Ferro;
import tk.maze.pvp.jumps.Diamante;
import tk.maze.pvp.jumps.Esponja;
import tk.maze.pvp.jumps.Esmeralda;
import tk.maze.pvp.commands.ManutencaoCommand;
import tk.maze.pvp.commands.ScCommand;
import tk.maze.pvp.commands.ChatCommand;
import tk.maze.pvp.commands.AdminCommand;
import tk.maze.pvp.events.ColorSigns;
import tk.maze.pvp.menus.LojaItemMenu;
import tk.maze.pvp.events.eTab;
import tk.maze.pvp.events.eMoveSpawn;
import tk.maze.pvp.events.PlacaLC;
import tk.maze.pvp.events.PlacaSopas;
import tk.maze.pvp.events.PlacaRecraft;
import tk.maze.pvp.API.WarpsAPI;
import tk.maze.pvp.menus.HeadsMenu;
import tk.maze.pvp.menus.CliqueInventory;
import tk.maze.pvp.menus.OpenInventory;
import tk.maze.pvp.invencivel.Prote\u00e7\u00e3o;
import tk.maze.pvp.events.eUtills;
import tk.maze.pvp.events.eEvents;
import org.bukkit.event.Listener;
import tk.maze.pvp.bans.Eventos;
import java.util.Iterator;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.entity.Item;
import org.bukkit.World;
import tk.maze.pvp.commands.PvPCommand;
import tk.maze.pvp.commands.DanoCommand;
import tk.maze.pvp.nametag.Array;
import tk.maze.pvp.nametag.PlayerLoader;
import tk.maze.pvp.bans.Config;
import tk.maze.pvp.API.GrupoAPI;
import tk.maze.pvp.anticheat.hacks.flyspeed.MoveCheck;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import java.util.HashMap;
import org.bukkit.scheduler.BukkitRunnable;
import tk.maze.pvp.packets.Injector;
import org.bukkit.plugin.Plugin;
import java.util.ArrayList;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public static final String Menssagens;
    public static ArrayList<String> logado1;
    public static Main main;
    public static Plugin plugin;
    public static Injector injector;
    public static boolean disableEvents;
    public static BukkitRunnable cleanupTask;
    public static ArrayList<String> JogadoresLogados;
    public static ArrayList<String> logado;
    public static HashMap<String, ItemStack[]> skit;
    public static HashMap<String, ItemStack[]> armor;
    
    static {
        Menssagens = null;
        Main.logado1 = new ArrayList<String>();
        Main.disableEvents = false;
        Main.JogadoresLogados = new ArrayList<String>();
        Main.logado = new ArrayList<String>();
        Main.skit = new HashMap<String, ItemStack[]>();
        Main.armor = new HashMap<String, ItemStack[]>();
    }
    
    public static Main getInstance() {
        return Main.main;
    }
    
    public static Plugin getPlugin() {
        return Main.plugin;
    }
    
    public void onEnable() {
        Main.plugin = (Plugin)this;
        Bukkit.getConsoleSender().sendMessage("§9§lPLUGIN §fO plugin §b§lBROWK§f§lPVP §ffoi §a§lATIVADO!");
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask((Plugin)this, (Runnable)new MoveCheck(), 41L, 40L);
        Player[] onlinePlayers;
        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
            final Player todos = onlinePlayers[i];
            todos.kickPlayer("   §b§lBROWKMC §7Aguarde! §7Estamos melhorando a sua jogabilidade, espero que entenda!");
        }
        Bukkit.getScheduler().scheduleSyncRepeatingTask(getPlugin(), (Runnable)new Runnable() {
            @Override
            public void run() {
            }
        }, 0L, 2400L);
        this.LoadConfig();
        GrupoAPI.Checando = true;
        OfflinePlayer[] offlinePlayers;
        for (int length2 = (offlinePlayers = this.getServer().getOfflinePlayers()).length, j = 0; j < length2; ++j) {
            final OfflinePlayer jogadores = offlinePlayers[j];
            if (Config.getConfig().kTempBans.get("TempBans." + jogadores.getUniqueId()) != null) {
                Config.getConfig().kTempBans.set("TempBans." + jogadores.getUniqueId(), (Object)null);
                Config.getConfig().saveTempBans();
            }
            if (Config.getConfig().kTempMute.get("TempMute." + jogadores.getUniqueId()) != null) {
                Config.getConfig().kTempMute.set("TempMute." + jogadores.getUniqueId(), (Object)null);
                Config.getConfig().saveTempMute();
            }
        }
        PacketsIniciar();
        PlayerLoader.load(this);
        Array.InciarTag();
        this.LoadEvents();
        this.LoadCommands();
        DanoCommand.dano = true;
        PvPCommand.pvp = true;
        for (final Item itemsDropados : Bukkit.getWorlds().get(0).getEntitiesByClass((Class)Item.class)) {
            itemsDropados.remove();
        }
    }
    
    public void onDisable() {
        PacketsDesabilitar();
        for (final Item itemsDropados : Bukkit.getWorlds().get(0).getEntitiesByClass((Class)Item.class)) {
            itemsDropados.remove();
        }
    }
    
    public void onLoad() {
        Main.injector = new Injector();
        final boolean injected = Main.injector.inject();
        if (injected) {
            Main.injector.addServerConnectionChannel();
        }
    }
    
    private void LoadEvents() {
        final PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents((Listener)new Eventos(), (Plugin)this);
        pm.registerEvents((Listener)new eEvents(), (Plugin)this);
        pm.registerEvents((Listener)new eUtills(), (Plugin)this);
        pm.registerEvents((Listener)new Prote\u00e7\u00e3o(), (Plugin)this);
        pm.registerEvents((Listener)new OpenInventory(), (Plugin)this);
        pm.registerEvents((Listener)new CliqueInventory(), (Plugin)this);
        pm.registerEvents((Listener)new HeadsMenu(), (Plugin)this);
        pm.registerEvents((Listener)new WarpsAPI(), (Plugin)this);
        pm.registerEvents((Listener)new PlacaRecraft(), (Plugin)this);
        pm.registerEvents((Listener)new PlacaSopas(), (Plugin)this);
        pm.registerEvents((Listener)new PlacaLC(), (Plugin)this);
        pm.registerEvents((Listener)new eMoveSpawn(), (Plugin)this);
        pm.registerEvents((Listener)new eTab(), (Plugin)this);
        pm.registerEvents((Listener)new LojaItemMenu(), (Plugin)this);
        pm.registerEvents((Listener)new ColorSigns(), (Plugin)this);
        pm.registerEvents((Listener)new AdminCommand(), (Plugin)this);
        pm.registerEvents((Listener)new ChatCommand(), (Plugin)this);
        pm.registerEvents((Listener)new ScCommand(), (Plugin)this);
        pm.registerEvents((Listener)new ManutencaoCommand(), (Plugin)this);
        pm.registerEvents((Listener)new DanoCommand(), (Plugin)this);
        pm.registerEvents((Listener)new PvPCommand(), (Plugin)this);
        pm.registerEvents((Listener)new Esmeralda(), (Plugin)this);
        pm.registerEvents((Listener)new Esponja(), (Plugin)this);
        pm.registerEvents((Listener)new Diamante(), (Plugin)this);
        pm.registerEvents((Listener)new Ferro(), (Plugin)this);
        pm.registerEvents((Listener)new Ajnin(), (Plugin)this);
        pm.registerEvents((Listener)new Fisherman(), (Plugin)this);
        pm.registerEvents((Listener)new Gladiator(), (Plugin)this);
        pm.registerEvents((Listener)new Grappler(), (Plugin)this);
        pm.registerEvents((Listener)new Hulk(), (Plugin)this);
        pm.registerEvents((Listener)new Kangaroo(), (Plugin)this);
        pm.registerEvents((Listener)new Magma(), (Plugin)this);
        pm.registerEvents((Listener)new Monk(), (Plugin)this);
        pm.registerEvents((Listener)new Ninja(), (Plugin)this);
        pm.registerEvents((Listener)new Phantom(), (Plugin)this);
        pm.registerEvents((Listener)new Snail(), (Plugin)this);
        pm.registerEvents((Listener)new Stomper(), (Plugin)this);
        pm.registerEvents((Listener)new Switcher(), (Plugin)this);
        pm.registerEvents((Listener)new Thor(), (Plugin)this);
        pm.registerEvents((Listener)new Timelord(), (Plugin)this);
        pm.registerEvents((Listener)new Viper(), (Plugin)this);
        pm.registerEvents((Listener)new FireLauncher(), (Plugin)this);
        pm.registerEvents((Listener)new Strong(), (Plugin)this);
        pm.registerEvents((Listener)new Sumo(), (Plugin)this);
        pm.registerEvents((Listener)new Events1v1(), (Plugin)this);
        pm.registerEvents((Listener)new Speed1v1(), (Plugin)this);
        pm.registerEvents((Listener)new Events(), (Plugin)this);
        pm.registerEvents((Listener)new AutoSoup(), (Plugin)this);
        pm.registerEvents((Listener)new FastClick(), (Plugin)this);
        pm.registerEvents((Listener)new Macro(), (Plugin)this);
        pm.registerEvents((Listener)new ForceField(), (Plugin)this);
        pm.registerEvents((Listener)new FlySpeed(), (Plugin)this);
        pm.registerEvents((Listener)new CombatLog(), (Plugin)this);
        pm.registerEvents((Listener)new WarpCommand(), (Plugin)this);
    }
    
    private void LoadCommands() {
        this.getCommand("givecoins").setExecutor((CommandExecutor)new GiveCoinsCommand());
        this.getCommand("ban").setExecutor((CommandExecutor)new BanCommand());
        this.getCommand("aviso").setExecutor((CommandExecutor)new WarnCommand());
        this.getCommand("ipban").setExecutor((CommandExecutor)new IPBanCommand());
        this.getCommand("tempban").setExecutor((CommandExecutor)new TempBanCommand());
        this.getCommand("tempmute").setExecutor((CommandExecutor)new TempMuteCommand());
        this.getCommand("kick").setExecutor((CommandExecutor)new KickCommand());
        this.getCommand("unban").setExecutor((CommandExecutor)new UnbanCommand());
        this.getCommand("mute").setExecutor((CommandExecutor)new MuteCommand());
        this.getCommand("sc").setExecutor((CommandExecutor)new ScCommand());
        this.getCommand("groupset").setExecutor((CommandExecutor)new GroupSetCommand());
        this.getCommand("admin").setExecutor((CommandExecutor)new AdminCommand());
        this.getCommand("kit").setExecutor((CommandExecutor)new KitCommand());
        this.getCommand("giveall").setExecutor((CommandExecutor)new GiveAllCommand());
        this.getCommand("removeall").setExecutor((CommandExecutor)new RemoveAllCommand());
        this.getCommand("fly").setExecutor((CommandExecutor)new FlyCommand());
        this.getCommand("score").setExecutor((CommandExecutor)new ScoreCommand());
        this.getCommand("tag").setExecutor((CommandExecutor)new TagCommand());
        this.getCommand("taglist").setExecutor((CommandExecutor)new TagsCommand());
        this.getCommand("tp").setExecutor((CommandExecutor)new TpCommand());
        this.getCommand("gamemode").setExecutor((CommandExecutor)new GamemodeCommand());
        this.getCommand("gm").setExecutor((CommandExecutor)new GamemodeCommand());
        this.getCommand("youtuber").setExecutor((CommandExecutor)new YoutuberCommand());
        this.getCommand("spro").setExecutor((CommandExecutor)new YoutuberCommand());
        this.getCommand("chat").setExecutor((CommandExecutor)new ChatCommand());
        this.getCommand("report").setExecutor((CommandExecutor)new ReportCommand());
        this.getCommand("set").setExecutor((CommandExecutor)new SetCommand());
        this.getCommand("spawn").setExecutor((CommandExecutor)new SpawnCommand());
        this.getCommand("warp").setExecutor((CommandExecutor)new WarpCommand());
        this.getCommand("fake").setExecutor((CommandExecutor)new Fake());
        this.getCommand("speed1v1").setExecutor((CommandExecutor)new CmdsSpeed());
        this.getCommand("tell").setExecutor((CommandExecutor)new TellCommand());
        this.getCommand("bancheck").setExecutor((CommandExecutor)new PunishCheckCommand());
        this.getCommand("mutecheck").setExecutor((CommandExecutor)new PunishCheckCommand());
        this.getCommand("loja").setExecutor((CommandExecutor)new LojaCommand());
        this.getCommand("store").setExecutor((CommandExecutor)new LojaCommand());
        this.getCommand("bc").setExecutor((CommandExecutor)new BcCommand());
        this.getCommand("account").setExecutor((CommandExecutor)new AccountCommand());
        this.getCommand("inv").setExecutor((CommandExecutor)new InvseeCommand());
        this.getCommand("invsee").setExecutor((CommandExecutor)new InvseeCommand());
        this.getCommand("aplicar").setExecutor((CommandExecutor)new AplicarCommand());
        this.getCommand("ping").setExecutor((CommandExecutor)new PingCommand());
        this.getCommand("acc").setExecutor((CommandExecutor)new AccountCommand());
        this.getCommand("skit").setExecutor((CommandExecutor)new SkitCommand());
        this.getCommand("tpall").setExecutor((CommandExecutor)new TpAllCommand());
        this.getCommand("vis").setExecutor((CommandExecutor)new VisCommand());
        this.getCommand("invis").setExecutor((CommandExecutor)new InvisCommand());
        this.getCommand("removerhead").setExecutor((CommandExecutor)new cRemoveHead());
        this.getCommand("removerhat").setExecutor((CommandExecutor)new cRemoveHead());
        this.getCommand("removehead").setExecutor((CommandExecutor)new cRemoveHead());
        this.getCommand("removehat").setExecutor((CommandExecutor)new cRemoveHead());
        this.getCommand("manutencao").setExecutor((CommandExecutor)new ManutencaoCommand());
        this.getCommand("cage").setExecutor((CommandExecutor)new CageCommand());
        this.getCommand("autosoup").setExecutor((CommandExecutor)new AutoSoupCommand());
        this.getCommand("ip").setExecutor((CommandExecutor)new IpCommand());
        this.getCommand("tphere").setExecutor((CommandExecutor)new TpHereCommand());
        this.getCommand("s").setExecutor((CommandExecutor)new TpHereCommand());
        this.getCommand("stopserver").setExecutor((CommandExecutor)new StopServerCommand());
        this.getCommand("kickall").setExecutor((CommandExecutor)new KickAllCommand());
        this.getCommand("monitorar").setExecutor((CommandExecutor)new MonitorarCommand());
        this.getCommand("dano").setExecutor((CommandExecutor)new DanoCommand());
        this.getCommand("pvp").setExecutor((CommandExecutor)new PvPCommand());
        this.getCommand("clearall").setExecutor((CommandExecutor)new ClearAllCommand());
        this.getCommand("head").setExecutor((CommandExecutor)new HeadCommand());
        this.getCommand("addpermission").setExecutor((CommandExecutor)new AddPermissaoCommand());
        this.getCommand("removepermission").setExecutor((CommandExecutor)new AddPermissaoCommand());
        this.getCommand("givevip").setExecutor((CommandExecutor)new GiveVipCommand());
        this.getCommand("giveyoutuber").setExecutor((CommandExecutor)new GiveCommand());
        this.getCommand("givebuilder").setExecutor((CommandExecutor)new GiveCommand());
        this.getCommand("givekit").setExecutor((CommandExecutor)new GiveKitCommand());
        this.getCommand("1v1").setExecutor((CommandExecutor)new WarpsCommand());
        this.getCommand("evento").setExecutor((CommandExecutor)new WarpsCommand());
    }
    
    private void LoadConfig() {
        WarpsConfig.getConfig().ConfigEnable((Plugin)this);
        Config.getConfig().setupConfig((Plugin)this);
        cfEntrou.setarConfig((Plugin)this);
        cfEntrou.setarConfig1((Plugin)this);
        cfGrupo.setarconfig((Plugin)this);
        cfKitdiario.setarconfig((Plugin)this);
        cfTempGrupo.setarconfig((Plugin)this);
        cfPermiss\u00e3o.setarconfig((Plugin)this);
        cfConfig.setarConfig((Plugin)this);
        new cfStatus();
        new WarnCommand();
    }
    
    public static void PacketsIniciar() {
        if (Main.cleanupTask == null) {
            (Main.cleanupTask = new BukkitRunnable() {
                public void run() {
                    final int handlers = PacketHandler.getHandlers().size();
                    final int plugins = Bukkit.getPluginManager().getPlugins().length;
                }
            }).runTaskTimer(getPlugin(), 6000L, 6000L);
        }
    }
    
    public static void PacketsDesabilitar() {
        Player[] onlinePlayers;
        for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
            final Player p = onlinePlayers[i];
            Main.injector.removeChannel(p);
        }
        while (!PacketHandler.getHandlers().isEmpty()) {
            PacketHandler.removeHandler(PacketHandler.getHandlers().get(0));
        }
    }
    
    public static boolean addPacketHandler(final PacketHandler handler) {
        return PacketHandler.addHandler(handler);
    }
    
    public static boolean removePacketHandler(final PacketHandler handler) {
        return PacketHandler.removeHandler(handler);
    }
    
    private void callEvent(final Event e) {
        if (Main.disableEvents) {
            return;
        }
        if (!this.isEnabled()) {
            return;
        }
        Bukkit.getScheduler().runTaskAsynchronously((Plugin)this, (Runnable)new Runnable() {
            @Override
            public void run() {
                try {
                    Bukkit.getPluginManager().callEvent(e);
                }
                catch (IllegalStateException ex) {
                    System.out.println("[PacketListenerAPI] Error while calling event (" + e.getEventName() + ")");
                    ex.printStackTrace();
                }
            }
        });
    }
    
    public Object onPacketReceive(final Player p, final Object packet, final Cancellable cancellable) {
        if (!packet.getClass().getName().startsWith("net.minecraft.server.")) {
            return packet;
        }
        if (!Main.disableEvents) {
            final PacketReceiveEvent event = new PacketReceiveEvent(packet, cancellable, p);
            this.callEvent(event);
        }
        final ReceivedPacket pckt = new ReceivedPacket(packet, cancellable, p);
        PacketHandler.notifyHandlers(pckt);
        return pckt.getPacket();
    }
    
    public Object onPacketSend(final Player p, final Object packet, final Cancellable cancellable) {
        if (!packet.getClass().getName().startsWith("net.minecraft.server.")) {
            return packet;
        }
        if (!Main.disableEvents) {
            final PacketSendEvent event = new PacketSendEvent(packet, cancellable, p);
            this.callEvent(event);
        }
        final SentPacket pckt = new SentPacket(packet, cancellable, p);
        PacketHandler.notifyHandlers(pckt);
        return pckt.getPacket();
    }
}
