package me.beefstew2007.arcandianetwork;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Plugin plugin;
	
    @Override
    public void onEnable() {
    	plugin = this;
    	getCommand("r-reload").setExecutor(new RanksSetup());
    	getCommand("rank").setExecutor(new RankCommand());
    	getCommand("gmc").setExecutor(new GamemodeCommand());
    	getCommand("gms").setExecutor(new GamemodeCommand());
		getServer().getPluginManager().registerEvents(new RanksChatListener(), this);
		getServer().getPluginManager().registerEvents(new RanksJoinListener(), this);
		getServer().getPluginManager().registerEvents(new JoinAndQuitMessages(), this);
		getServer().getPluginManager().registerEvents(new DamageListenerHub(), this);
		getServer().getPluginManager().registerEvents(new BlockListener(), this);
    }
    
    @Override
    public void onDisable() {
    	plugin = null;
    }
    
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
    	for (Listener listener : listeners) {
    		Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
    	}
    }
    	 
    public static Plugin getPlugin() {
    	return plugin;
    }
    	 
    
}