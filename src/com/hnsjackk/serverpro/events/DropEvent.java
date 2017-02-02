package com.hnsjackk.serverpro.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import com.hnsjackk.serverpro.Main;

public class DropEvent implements Listener{
	Main plugin;	
	
	public DropEvent(Main instance) {
		plugin = instance;
	}
	@EventHandler
	public void dropEvent(PlayerDropItemEvent e){
		Boolean dodrops = plugin.getConfig().getBoolean("drops");
		if(dodrops == false){
			e.setCancelled(true);
		} 
			
	}
	
}
