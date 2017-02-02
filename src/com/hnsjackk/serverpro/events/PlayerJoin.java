package com.hnsjackk.serverpro.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.hnsjackk.serverpro.Main;

public class PlayerJoin implements Listener{
	Main plugin;	
	
	public PlayerJoin(Main instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void playerJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		e.setJoinMessage(null);
		Bukkit.broadcastMessage(ChatColor.BLUE + "JOIN ┃ " + ChatColor.GRAY + p.getName());
		p.sendMessage(ChatColor.BLUE + "MOTD ┃ " + ChatColor.GRAY + plugin.getConfig().getString("motd"));
	}
	
}
