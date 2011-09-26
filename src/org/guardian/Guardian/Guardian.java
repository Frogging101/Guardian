package org.guardian.Guardian;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Guardian extends JavaPlugin
{
	private static final Logger log = Bukkit.getLogger();

	@Override
	public void onEnable() {
		log.info("Guardian v" + getDescription().getVersion() + " enabled");
	}

	@Override
	public void onDisable() {
		log.info("Guardian disabled");
	}
}
