package org.guardian.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.guardian.Guardian;

public class HighBlockListener extends BlockListener {

    private Guardian plugin;

    public HighBlockListener(final Guardian plugin) {
        this.plugin = plugin;
        Bukkit.getServer().getPluginManager().registerEvent(Type.BLOCK_PLACE, this, Priority.High, plugin);
    }
    
    @Override
    public void onBlockPlace(BlockPlaceEvent event){
    }
}
