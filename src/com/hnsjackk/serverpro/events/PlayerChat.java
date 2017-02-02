package com.hnsjackk.serverpro.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener{
	@EventHandler
	public void ChatEvent(AsyncPlayerChatEvent e) {
		String p_msg = e.getMessage();
		e.setCancelled(true);
		Bukkit.broadcastMessage(ChatColor.RED + e.getPlayer().getName() + ChatColor.DARK_GRAY + " ┃ " + ChatColor.GRAY + p_msg);
	}
}
