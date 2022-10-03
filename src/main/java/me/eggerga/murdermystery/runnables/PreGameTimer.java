package me.eggerga.murdermystery.runnables;

import me.eggerga.murdermystery.MurderMystery;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class PreGameTimer extends BukkitRunnable {
    private MurderMystery plugin;
    private int count = 15;

    public PreGameTimer(MurderMystery plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        if(count == 15) {
            Bukkit.broadcastMessage(ChatColor.GREEN + "Game will start in 15 seconds");
        } else if(count == 10) {
            Bukkit.broadcastMessage(ChatColor.GREEN + "Game will start in 10 seconds");
        }

    }
}
