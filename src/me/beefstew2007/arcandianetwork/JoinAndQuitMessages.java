package me.beefstew2007.arcandianetwork;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.md_5.bungee.api.ChatColor;

public class JoinAndQuitMessages implements Listener{

	public static String Join = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Join" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY; 
	public static String Quit = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Quit" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY; 

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.setJoinMessage(Join + event.getPlayer().getName());
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		event.setQuitMessage(Quit + event.getPlayer().getName());
	}
	
    @EventHandler(priority = EventPriority.HIGHEST)
    public void Foodlevel(FoodLevelChangeEvent event){
    	event.setCancelled(true);
    }
}
