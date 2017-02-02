package com.hnsjackk.serverpro.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hp implements CommandExecutor{
	
	public Player getPlayer(String name) {
	    for(Player p : Bukkit.getOnlinePlayers()) {
	        if(p.getName().equalsIgnoreCase(name))
	            return p;
	    }
	    return null;
	}
	
	   public static boolean isInteger(String s) {
		      boolean isValidInteger = false;
		      try
		      {
		         Integer.parseInt(s);
		 
		         // s is a valid integer
		 
		         isValidInteger = true;
		      }
		      catch (NumberFormatException ex)
		      {
		         // s is not an integer
		      }
		 
		      return isValidInteger;
		   }
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(args.length == 0){
			p.sendMessage(ChatColor.BLUE + "ADMIN ┃ " + ChatColor.GREEN + p.getName() + ChatColor.DARK_GRAY + " you've been healed!");
			Bukkit.broadcastMessage(ChatColor.BLUE + "HEAL ┃ " + ChatColor.GREEN + p.getName() + ChatColor.DARK_GRAY + " has been " + ChatColor.GREEN + "healed " + ChatColor.DARK_GRAY + "by themselves.");
			p.setHealth(20);
			return true;
		}
		Player t = getPlayer(args[0]);
		if(t == null){
			p.sendMessage(ChatColor.BLUE + "ERROR ┃ " + ChatColor.RED + "Please specify a user!");
			return true;
		}else{
			if(args[1] == null) {
				t.setHealth(20);
			}else{
	            boolean isValid = isInteger(args[1]);
	            if(isValid == true) {
	            	int hp = Integer.parseInt(args[1]);
	            	if(hp > 20){
	            		p.sendMessage(ChatColor.BLUE + "ERROR ┃ " + ChatColor.RED + "Value cannot be over 20!");
	            	}else{
	            		t.setHealth(hp);
		            	Bukkit.broadcastMessage(ChatColor.BLUE + "HEAL ┃ " + ChatColor.GREEN + p.getName() + ChatColor.DARK_GRAY + " has healed " + ChatColor.GREEN + t.getName());
	            	}
	            } else {
	            	p.sendMessage(ChatColor.BLUE + "ERROR ┃ " + ChatColor.RED + "Please specify an INTEGER!");
	            }
			}
		}
		
		return true;
	}
	
}
