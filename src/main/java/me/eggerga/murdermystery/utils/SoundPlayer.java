package me.eggerga.murdermystery.utils;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SoundPlayer {
    public static void playSoundForAllPlayers(Sound sound) {
        for(Player player : Bukkit.getOnlinePlayers()) {
            player.playSound(player.getLocation(), sound, 1f, 1f);
        }
    }
}
