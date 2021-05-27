package kr.teamcocoa.CloudNETLoadBalancer.listeners;

import de.dytanic.cloudnet.ext.bridge.BridgeHelper;
import de.dytanic.cloudnet.ext.bridge.bukkit.BukkitCloudNetHelper;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {
    @EventHandler
    public void onJoin(org.bukkit.event.player.PlayerJoinEvent e){
        if(BukkitCloudNetHelper.getMaxPlayers() == Bukkit.getOnlinePlayers().size() && BukkitCloudNetHelper.getApiMotd().equals("JOINABLE")){
            Bukkit.getLogger().info("[CloudNetLoadBalancer] Server is full! Changing ApiMotd as INGAME...");
            BukkitCloudNetHelper.setApiMotd("INGAME");
            BridgeHelper.updateServiceInfo();
            Bukkit.getLogger().info("[CloudNetLoadBalancer] Success!");
        }
    }
}
