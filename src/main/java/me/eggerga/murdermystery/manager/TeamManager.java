package me.eggerga.murdermystery.manager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class TeamManager {
    private final GameManager gameManager;
    private ArrayList<Player> innocentPlayers = new ArrayList<Player>();
    private Player murderer;
    private Player detective;

    public TeamManager(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public void setRandomRoles() {
        if(Bukkit.getOnlinePlayers().size() == 0) {
            return;
        }

        ArrayList<Player> playerPool = new ArrayList<Player>(Bukkit.getOnlinePlayers());

        Player chosenMurderer = playerPool.get((int)(Math.random() * playerPool.size()));
        this.murderer = chosenMurderer;

        playerPool.remove(chosenMurderer);

        Player chosenDetective = playerPool.get((int)(Math.random() * playerPool.size()));
        this.detective = chosenDetective;

        playerPool.remove(chosenDetective);

        this.innocentPlayers = playerPool;
    }

    public void sendRoleMessages() {
        for(Player player : innocentPlayers) {
            player.sendTitle(ChatColor.GREEN + "Innocent", "Survive and Uncover the Murderer", 20, 100, 20);
        }

        detective.sendTitle(ChatColor.DARK_AQUA + "Detective", "Uncover and Eliminate the Murderer", 20, 100, 20);
        murderer.sendTitle(ChatColor.DARK_RED + "Murderer", "Go Crazy I Guess", 20, 100, 20);

    }

    public ArrayList<Player> getInnocentPlayers() {
        return innocentPlayers;
    }

    public void setInnocentPlayers(ArrayList<Player> innocentPlayers) {
        this.innocentPlayers = innocentPlayers;
    }

    public Player getMurderer() {
        return murderer;
    }

    public void setMurderer(Player murderer) {
        this.murderer = murderer;
    }

    public Player getDetective() {
        return detective;
    }

    public void setDetective(Player detective) {
        this.detective = detective;
    }
}