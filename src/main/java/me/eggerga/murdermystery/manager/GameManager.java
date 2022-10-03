package me.eggerga.murdermystery.manager;

import me.eggerga.murdermystery.MurderMystery;
import org.bukkit.Bukkit;

public class GameManager {
    private final MurderMystery plugin;
    private GameState gameState = GameState.LOBBY;

    public GameManager(MurderMystery plugin) {
        this.plugin = plugin;
    }

    public MurderMystery getPlugin() {
        return plugin;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;

        switch(gameState) {
            case LOBBY:
                Bukkit.broadcastMessage("Lobby");
                break;
            case STARTING:
                Bukkit.broadcastMessage("Starting");
                // teleport players
                // countdown
                // assign roles
                // give murderer his weapon
                // set game state to active
                break;
            case ACTIVE:
                Bukkit.broadcastMessage("Active");
                break;
            case WINNERS:
                Bukkit.broadcastMessage("Winners");
                break;
            case RESTARTING:
                Bukkit.broadcastMessage("Restarting");
                break;
            default:
                Bukkit.broadcastMessage("Invalid Game State");



        }
    }
}
