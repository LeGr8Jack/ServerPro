package com.hnsjackk.serverpro.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import com.hnsjackk.serverpro.Main;

public class RespawnEvent implements Listener{
	Main plugin;	
	
	public RespawnEvent(Main instance) {
		plugin = instance;
	}
	@EventHandler
	public void Respawn(PlayerRespawnEvent e){
		Boolean elimination = plugin.getConfig().getBoolean("elimination");
		if(elimination == true) {
			e.getPlayer().setGameMode(GameMode.SPECTATOR);
			Bukkit.broadcastMessage(ChatColor.BLUE + "ELIMINATION ┃ " + ChatColor.DARK_GRAY + e.getPlayer().getName() + ChatColor.GRAY + " has been eliminated!");
		}
	}
}
