package me.beefstew2007.arcandianetwork;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class RankCommand implements CommandExecutor {

	public static String Ranks = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY; 
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		if (cmd.getName().equalsIgnoreCase("rank")) {
			Player p = (Player) sender;
			if (p.isOp() || RanksSetup.owner.contains(p.getName()) || RanksSetup.dev.contains(p.getName())){
				if (args.length == 0) {
					p.sendMessage(Ranks + "Invalid Arguments!");
				}else if (args.length == 2) {
					Player target = Bukkit.getPlayerExact(args[0]);
					if (target == null) {
						p.sendMessage(Ranks + "Player Not Found!");
					}else{
						if (args[1].equalsIgnoreCase("Owner")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.add(target.getName());
							RanksSetup.dev.remove(target.getName());
							RanksSetup.jrdev.remove(target.getName());
							RanksSetup.admin.remove(target.getName());
							RanksSetup.staffsr.remove(target.getName());
							RanksSetup.staffjr.remove(target.getName());
							RanksSetup.trainee.remove(target.getName());
							RanksSetup.donor.remove(target.getName());
							RanksSetup.normal.remove(target.getName());
						}
						else if (args[1].equalsIgnoreCase("Dev")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(target.getName());
							RanksSetup.dev.add(target.getName());
							RanksSetup.jrdev.remove(target.getName());
							RanksSetup.admin.remove(target.getName());
							RanksSetup.staffsr.remove(target.getName());
							RanksSetup.staffjr.remove(target.getName());
							RanksSetup.trainee.remove(target.getName());
							RanksSetup.donor.remove(target.getName());
							RanksSetup.normal.remove(target.getName());
						}
						else if (args[1].equalsIgnoreCase("JrDev")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(target.getName());
							RanksSetup.dev.remove(target.getName());
							RanksSetup.jrdev.add(target.getName());
							RanksSetup.admin.remove(target.getName());
							RanksSetup.staffsr.remove(target.getName());
							RanksSetup.staffjr.remove(target.getName());
							RanksSetup.trainee.remove(target.getName());
							RanksSetup.donor.remove(target.getName());
							RanksSetup.normal.remove(target.getName());
						}
						else if (args[1].equalsIgnoreCase("Admin")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(target.getName());
							RanksSetup.dev.remove(target.getName());
							RanksSetup.jrdev.remove(target.getName());
							RanksSetup.admin.add(target.getName());
							RanksSetup.staffsr.remove(target.getName());
							RanksSetup.staffjr.remove(target.getName());
							RanksSetup.trainee.remove(target.getName());
							RanksSetup.donor.remove(target.getName());
							RanksSetup.normal.remove(target.getName());
						}
						else if (args[1].equalsIgnoreCase("SrStaff")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(target.getName());
							RanksSetup.dev.remove(target.getName());
							RanksSetup.jrdev.remove(target.getName());
							RanksSetup.admin.remove(target.getName());
							RanksSetup.staffsr.add(target.getName());
							RanksSetup.staffjr.remove(target.getName());
							RanksSetup.trainee.remove(target.getName());
							RanksSetup.donor.remove(target.getName());
							RanksSetup.normal.remove(target.getName());
						}
						else if (args[1].equalsIgnoreCase("JrStaff")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(target.getName());
							RanksSetup.dev.remove(target.getName());
							RanksSetup.jrdev.remove(target.getName());
							RanksSetup.admin.remove(target.getName());
							RanksSetup.staffsr.remove(target.getName());
							RanksSetup.staffjr.add(target.getName());
							RanksSetup.trainee.remove(target.getName());
							RanksSetup.donor.remove(target.getName());
							RanksSetup.normal.remove(target.getName());
						}
						else if (args[1].equalsIgnoreCase("Trainee")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(target.getName());
							RanksSetup.dev.remove(target.getName());
							RanksSetup.jrdev.remove(target.getName());
							RanksSetup.admin.remove(target.getName());
							RanksSetup.staffsr.remove(target.getName());
							RanksSetup.staffjr.remove(target.getName());
							RanksSetup.trainee.add(target.getName());
							RanksSetup.donor.remove(target.getName());
							RanksSetup.normal.remove(target.getName());
						}
						else if (args[1].equalsIgnoreCase("Donor")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(target.getName());
							RanksSetup.dev.remove(target.getName());
							RanksSetup.jrdev.remove(target.getName());
							RanksSetup.admin.remove(target.getName());
							RanksSetup.staffsr.remove(target.getName());
							RanksSetup.staffjr.remove(target.getName());
							RanksSetup.trainee.remove(target.getName());
							RanksSetup.donor.add(target.getName());
							RanksSetup.normal.remove(target.getName());
						}
						else if (args[1].equalsIgnoreCase("Normal")) {
							target.sendMessage(Ranks+"You're rank has been updated!");
							p.sendMessage(Ranks+"Rank updated!");
							RanksSetup.owner.remove(target.getName());
							RanksSetup.dev.remove(target.getName());
							RanksSetup.jrdev.remove(target.getName());
							RanksSetup.admin.remove(target.getName());
							RanksSetup.staffsr.remove(target.getName());
							RanksSetup.staffjr.remove(target.getName());
							RanksSetup.trainee.remove(target.getName());
							RanksSetup.donor.remove(target.getName());
							RanksSetup.normal.add(target.getName());
						}
					}
				}else if (args.length > 2 || args.length < 2){
					p.sendMessage(Ranks + "Invalid Arguments!");
				}
				
			} else {
				p.sendMessage(Ranks + "You do not have permission!");
			}
			
		}
		return false;
	}
}
