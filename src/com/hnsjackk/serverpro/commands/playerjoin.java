package com.hnsjackk.serverpro.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class playerjoin implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		if(args.length == 0) {
			sender.sendMessage(ChatColor.BLUE + "ERROR ┃ " + ChatColor.RED + "Please specify a string!");
			return true;
		}
		Bukkit.broadcastMessage(ChatColor.BLUE + "JOIN ┃ " + ChatColor.GRAY + args[0]);
		return true;
	}

}
