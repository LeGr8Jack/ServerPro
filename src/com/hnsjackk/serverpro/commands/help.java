package com.hnsjackk.serverpro.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class help implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		sender.sendMessage(ChatColor.BLUE + "HELP ┃ " + ChatColor.GRAY + "Current commands:");
		sender.sendMessage(ChatColor.BLUE + "1. ▶ ┃ " + "/help " + ChatColor.BLUE + "Usage: " + ChatColor.GRAY + "/help - Displays current commands!");
		sender.sendMessage(ChatColor.BLUE + "2. ▶ ┃ " + "/hp " + ChatColor.BLUE + "Usage: " + ChatColor.GRAY + "/hp [player] [amount] - Sets health of target with an amount. (Target and Ammount not required)");
		sender.sendMessage(ChatColor.BLUE + "3. ▶ ┃ " + "/feed " + ChatColor.BLUE + "Usage: " + ChatColor.GRAY + "/feed [player] [amount] - Sets the hunger of a player. (Target and Ammount not required)");
		sender.sendMessage(ChatColor.BLUE + "3. ▶ ┃ " + "/staff " + ChatColor.BLUE + "Usage: " + ChatColor.GRAY + "/staff <mofr> - Sets the staff-mode of a player");
		return true;
	}

}
