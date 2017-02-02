package com.hnsjackk.serverpro.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class staffmode implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		Player p = (Player) sender;
		if(!p.hasPermission("staffmode")) {
			p.sendMessage(ChatColor.BLUE + "ERROR ┃ " + ChatColor.RED + "Insufficient Permission!");
		}
		p.sendMessage(ChatColor.BLUE + "ADMIN ┃ " + ChatColor.GRAY + "Staff Mode Enabled!");
		p.setGameMode(GameMode.SPECTATOR);
		return true;
	}

}
