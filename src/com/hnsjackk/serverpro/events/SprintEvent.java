package com.hnsjackk.serverpro.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;

import com.hnsjackk.serverpro.Main;

public class SprintEvent implements Listener{
	Main plugin;	
	
	public SprintEvent(Main instance) {
		plugin = instance;
	}
	@EventHandler
	public void sprint(PlayerToggleSprintEvent e){
		Boolean d_sprint = plugin.getConfig().getBoolean("allow-sprinting");
		if(d_sprint == false) {
			e.setCancelled(true);
		}
	}
	
}
