package me.eggerga.murdermystery.commands;

import me.eggerga.murdermystery.MurderMystery;
import me.eggerga.murdermystery.manager.GameManager;
import me.eggerga.murdermystery.manager.GameState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Start implements CommandExecutor {
    private MurderMystery plugin;

    public Start(MurderMystery plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        GameManager gameManager = plugin.getGameManager();
        gameManager.setGameState(GameState.STARTING);

        return false;
    }
}
