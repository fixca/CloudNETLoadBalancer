package kr.teamcocoa.CloudNETLoadBalancer.listeners;

import de.dytanic.cloudnet.ext.bridge.BridgeHelper;
import de.dytanic.cloudnet.ext.bridge.bukkit.BukkitCloudNetHelper;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerQuitEvent implements Listener {
    @EventHandler
    public void onQuit(org.bukkit.event.player.PlayerQuitEvent e){
       if(BukkitCloudNetHelper.getApiMotd().equals("INGAME")){
            Bukkit.getLogger().info("[CloudNetLoadBalancer] Server is now free! Changing ApiMotd as JOINABLE...");
            BukkitCloudNetHelper.setApiMotd("JOINABLE");
            BridgeHelper.updateServiceInfo();
            Bukkit.getLogger().info("[CloudNetLoadBalancer] Success!");
        }
    }
}
