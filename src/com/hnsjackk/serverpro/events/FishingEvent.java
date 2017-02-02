
package com.hnsjackk.serverpro.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

import com.hnsjackk.serverpro.Main;

public class FishingEvent implements Listener{
	Main plugin;	
	
	public FishingEvent(Main instance) {
		plugin = instance;
	}
	@EventHandler
	public void Fishing(PlayerFishEvent e) {
		Boolean dofishing = plugin.getConfig().getBoolean("fishing");
		if(dofishing == false){
			e.setCancelled(true);
		} 
	}
}
