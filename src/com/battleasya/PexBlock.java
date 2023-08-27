package com.battleasya;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PexBlock extends JavaPlugin implements Listener {

    public String message;

    @Override
    public void onEnable() {

        saveDefaultConfig();
        message = getConfig().getString("message");

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {

        Player p = event.getPlayer();
        String msg = event.getMessage();

        if (msg.startsWith("/pex") || msg.startsWith("/permissionsex")) {
            if (!p.hasPermission("pexblock.bypass")) {
                event.setCancelled(true);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
            }
        }

    }

}
