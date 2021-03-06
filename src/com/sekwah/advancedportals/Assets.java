package com.sekwah.advancedportals;

public class Assets {

    public static int currentWarpParticles = 0;

    public static int currentWarpSound = 0;

    public Assets(AdvancedPortalsPlugin plugin) {
        ConfigAccessor config = new ConfigAccessor(plugin, "config.yml");
        currentWarpParticles = config.getConfig().getInt("WarpParticles");
        currentWarpSound = config.getConfig().getInt("WarpSound");
    }

}
