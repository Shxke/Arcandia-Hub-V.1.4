package me.beefstew2007.arcandianetwork;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListenerHub implements Listener {

	@EventHandler
	public void onDamage(EntityDamageEvent event) {
		event.setCancelled(true);
	}
}
