package me.beefstew2007.arcandianetwork;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockListener implements Listener{
	
	public void onBlockBreak(BlockBreakEvent event) {
		Player p = event.getPlayer();
		if (RanksSetup.owner.contains(p.getName()) || p.isOp() || RanksSetup.dev.contains(p.getName()) || RanksSetup.jrdev.contains(p.getName()) || RanksSetup.admin.contains(p.getName())) {
			event.setCancelled(false);
		}else{
			event.setCancelled(true);
		}
	}

}
