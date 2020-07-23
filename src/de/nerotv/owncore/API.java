package de.nerotv.owncore;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class API {
	
	public static void changeGamemode(Player Player, String GameMode, String Message) {
		Bukkit.getServer().getConsoleSender().sendMessage("§eTrying to change GameMode of "+Player.getName()+"§e to "+GameMode+"§e...");
		if(GameMode.equalsIgnoreCase("0")) { 
			Player.setGameMode(org.bukkit.GameMode.SURVIVAL);
			Player.playSound(Player.getLocation(), Sound.CHICKEN_EGG_POP, 100, 100);
			Player.sendMessage(Message.replace("&", "§")); 
		} else if(GameMode.equalsIgnoreCase("1")) {
			Player.setGameMode(org.bukkit.GameMode.CREATIVE);
			Player.playSound(Player.getLocation(), Sound.CHICKEN_EGG_POP, 100, 100);
			Player.sendMessage(Message.replace("&", "§")); 
		} else if(GameMode.equalsIgnoreCase("2")) {
			Player.setGameMode(org.bukkit.GameMode.ADVENTURE);
			Player.playSound(Player.getLocation(), Sound.CHICKEN_EGG_POP, 100, 100);
			Player.sendMessage(Message.replace("&", "§")); 
		} else if(GameMode.equalsIgnoreCase("3")) {
			Player.setGameMode(org.bukkit.GameMode.SPECTATOR);
			Player.playSound(Player.getLocation(), Sound.CHICKEN_EGG_POP, 100, 100);
			Player.sendMessage(Message.replace("&", "§")); 
		} else if(GameMode.equalsIgnoreCase("SURVIVAL")) {
			Player.setGameMode(org.bukkit.GameMode.SURVIVAL);
			Player.playSound(Player.getLocation(), Sound.CHICKEN_EGG_POP, 100, 100);
			Player.sendMessage(Message.replace("&", "§")); 
		} else if(GameMode.equalsIgnoreCase("CREATIVE")) {
			Player.setGameMode(org.bukkit.GameMode.CREATIVE);
			Player.playSound(Player.getLocation(), Sound.CHICKEN_EGG_POP, 100, 100);
			Player.sendMessage(Message.replace("&", "§")); 
		} else if(GameMode.equalsIgnoreCase("ADVENTURE")) {
			Player.setGameMode(org.bukkit.GameMode.ADVENTURE);
			Player.playSound(Player.getLocation(), Sound.CHICKEN_EGG_POP, 100, 100);
			Player.sendMessage(Message.replace("&", "§")); 
		} else if(GameMode.equalsIgnoreCase("SPECTATOR")) {
			Player.setGameMode(org.bukkit.GameMode.SPECTATOR);
			Player.playSound(Player.getLocation(), Sound.CHICKEN_EGG_POP, 100, 100);
			Player.sendMessage(Message.replace("&", "§")); 
		} else {
			Bukkit.getServer().getConsoleSender().sendMessage("§4§lERROR: §7§lGAMEMODE §e§l"+GameMode+"§7§lDOESN'T EXISTS!");
			Bukkit.getServer().getConsoleSender().sendMessage("§4§lERROR: §7§lUSE GAMEMODE 0,1,2,3,SURVIVAL,CREATIVE,ADVENTURE,SPECTATOR");
		}
	}
	
	public static String getNameFromUUID(UUID UUID) {
		String Name = "";
		if(UUID.toString().equalsIgnoreCase("")) {
			
		} else {
			Name = "null";
		}
		return Name;
	}
	
	public static UUID getUUIDFromName(Player p) {
		UUID UUID = p.getUniqueId();
		return UUID;
	}
}
