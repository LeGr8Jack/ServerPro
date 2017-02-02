package com.hnsjackk.serverpro;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.hnsjackk.serverpro.commands.feed;
import com.hnsjackk.serverpro.commands.help;
import com.hnsjackk.serverpro.commands.hp;
import com.hnsjackk.serverpro.commands.playerjoin;
import com.hnsjackk.serverpro.commands.staffmode;
import com.hnsjackk.serverpro.events.DropEvent;
import com.hnsjackk.serverpro.events.FishingEvent;
import com.hnsjackk.serverpro.events.PlayerChat;
import com.hnsjackk.serverpro.events.PlayerJoin;
import com.hnsjackk.serverpro.events.RespawnEvent;
import com.hnsjackk.serverpro.events.SprintEvent;

public class Main extends JavaPlugin{
	
	public boolean motd = true;
	
	public boolean isMotd() {
		return motd;
	}
	public void setMotd(boolean motd) {
		this.motd = motd;
	}
	private static Plugin plugin;
	
	public void onEnable(){
		plugin = this;
		// Commands
		getCommand("help").setExecutor(new help());;
		getCommand("hp").setExecutor(new hp());;
		getCommand("feed").setExecutor(new feed());;
		getCommand("staff").setExecutor(new staffmode());
		getCommand("fakejoin").setExecutor(new playerjoin());
		
		// Events
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerJoin(this), this);
		pm.registerEvents(new PlayerChat(), this);
		pm.registerEvents(new DropEvent(this), this);
		pm.registerEvents(new FishingEvent(this), this);
		pm.registerEvents(new RespawnEvent(this), this);
		pm.registerEvents(new SprintEvent(this), this);
		
		final FileConfiguration config = this.getConfig();
		
		// Config
		config.options().copyDefaults(true);
		saveConfig();
		
	}
	public void onDisable(){
		plugin = null;
	}
	public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
		for (Listener listener : listeners) {
			Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
		}
	}
	public static Plugin getPlugin() {
		return plugin;
	}
}
