package org.guardian.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.guardian.ActionType;

public class WorldConfig
{
    private final boolean[] actions = new boolean[ActionType.length];
    private final boolean ignored;
    private final Set<String> ignoredPlayers;

    public WorldConfig(final ConfigurationSection cfg) {
        for (final ActionType action : ActionType.values())
            if (!cfg.contains("logging." + action.toString()))
                cfg.set("logging." + action.getConfigPath(), false);
        if (!cfg.contains("ignored"))
            cfg.set("ignored", false);
        if (!cfg.contains("ignoredPlayers"))
            cfg.set("ignoredPlayers", new ArrayList<String>());

        for (final ActionType action : ActionType.values())
            actions[action.ordinal()] = cfg.getBoolean("logging." + action.getConfigPath());
        ignored = cfg.getBoolean("ignored");
        ignoredPlayers = new HashSet<String>(cfg.getStringList("ignoredPlayers"));
    }

    public boolean isIgnored() {
        return ignored;
    }

    public boolean isIgnored(Player player) {
        return ignoredPlayers.contains(player.getName().toLowerCase());
    }

    public boolean isLogging(ActionType action) {
        return actions[action.ordinal()];
    }
}
