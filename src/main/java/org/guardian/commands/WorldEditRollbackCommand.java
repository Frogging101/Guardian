package org.guardian.commands;

import org.guardian.util.BukkitUtils;

public class WorldEditRollbackCommand extends BaseCommand {

    public WorldEditRollbackCommand() {
        name = "werollback";
        usage = "<parameters> <- rollback in WorldEdit area";
    }

    @Override
    public boolean execute() {
        return true;
    }

    @Override
    public void moreHelp() {
        BukkitUtils.sendMessage(sender, "&cRolls back all changes inside a WorldEdit selection");
        BukkitUtils.sendMessage(sender, "&cParameters are the same as a normal rollback command");
        BukkitUtils.sendMessage(sender, "&cDoes not support polygon selections.");
    }

    @Override
    public boolean permission() {
        return true;
    }
}