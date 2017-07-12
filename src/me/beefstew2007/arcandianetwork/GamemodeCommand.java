package me.beefstew2007.arcandianetwork;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class GamemodeCommand implements CommandExecutor {

	public static String Gamemode = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Gamemode" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY; 
	
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		if (cmd.getName().equalsIgnoreCase("gms")) {
			Player p = (Player) sender;
			if (RanksSetup.owner.contains(p.getName()) || p.isOp() || RanksSetup.dev.contains(p.getName()) || RanksSetup.jrdev.contains(p.getName()) || RanksSetup.admin.contains(p.getName())) {
				if (args.length > 1) {
					p.sendMessage(Gamemode + "Invalid Arguments!");
				}
				else if (args.length == 0) {
					p.sendMessage(Gamemode + "Gamemode Updated!");
					p.setGameMode(GameMode.SURVIVAL);
				}
				else if (args.length == 1) {
					Player target = Bukkit.getPlayerExact(args[0]);
					if (target == null) {
						p.sendMessage(Gamemode + "Invalid Player!");
					} else {
						target.setGameMode(GameMode.SURVIVAL);
						p.sendMessage(Gamemode + "Gamemode Updated!");
						target.sendMessage(Gamemode + "Gamemode Updated!");
					}
				}
			} else{
				p.sendMessage(Gamemode + "You do not have permission!");
			}
	
		}
		if (cmd.getName().equalsIgnoreCase("gmc")) {
			Player p = (Player) sender;
			if (RanksSetup.owner.contains(p.getName()) || p.isOp() || RanksSetup.dev.contains(p.getName()) || RanksSetup.jrdev.contains(p.getName()) || RanksSetup.admin.contains(p.getName())) {
				if (args.length > 1) {
					p.sendMessage(Gamemode + "Invalid Arguments!");
				}
				else if (args.length == 0) {
					p.sendMessage(Gamemode + "Gamemode Updated!");
					p.setGameMode(GameMode.CREATIVE);
				}
				else if (args.length == 1) {
					Player target = Bukkit.getPlayerExact(args[0]);
					if (target == null) {
						p.sendMessage(Gamemode + "Invalid Player!");
					} else {
						target.setGameMode(GameMode.CREATIVE);
						p.sendMessage(Gamemode + "Gamemode Updated!");
						target.sendMessage(Gamemode + "Gamemode Updated!");
					}
				}
			} else{
				p.sendMessage(Gamemode + "You do not have permission!");
			}
	
		}
		return false;
	}
}
