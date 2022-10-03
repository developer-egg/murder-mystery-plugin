package me.eggerga.murdermystery;

import me.eggerga.murdermystery.manager.GameManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MurderMystery extends JavaPlugin {
    private GameManager gameManager;

    @Override
    public void onEnable() {
        //TODO make the map a val map
        this.gameManager = new GameManager(this);

        System.out.println("MM Plugin Ready!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public GameManager getGameManager() {
        return gameManager;
    }
}
