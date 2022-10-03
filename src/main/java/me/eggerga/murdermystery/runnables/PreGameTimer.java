package me.eggerga.murdermystery.runnables;

import me.eggerga.murdermystery.MurderMystery;
import me.eggerga.murdermystery.utils.SoundPlayer;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.scheduler.BukkitRunnable;

public class PreGameTimer extends BukkitRunnable {
    private final MurderMystery plugin;
    private int count = 15;

    public PreGameTimer(MurderMystery plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        if(count == 15) {
            Bukkit.broadcastMessage(ChatColor.GREEN + "Game will start in 15 seconds");
            SoundPlayer.playSoundForAllPlayers(Sound.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON);
        } else if(count == 10) {
            Bukkit.broadcastMessage(ChatColor.GREEN + "Game will start in 10 seconds");
            SoundPlayer.playSoundForAllPlayers(Sound.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON);
        } else if(count == 5) {
            Bukkit.broadcastMessage(ChatColor.GREEN + "Game will start in 5 seconds");
            SoundPlayer.playSoundForAllPlayers(Sound.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON);
        } else if(count == 1) {
            Bukkit.broadcastMessage(ChatColor.GREEN + "Game will start soon!");
            SoundPlayer.playSoundForAllPlayers(Sound.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON);
        } else if(count == 0) {
            count = 15;
            cancel();
        }
        count -= 1;
    }
}
