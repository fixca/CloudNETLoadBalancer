package kr.teamcocoa.CloudNETLoadBalancer.main;

import de.dytanic.cloudnet.ext.bridge.BridgeHelper;
import de.dytanic.cloudnet.ext.bridge.bukkit.BukkitCloudNetHelper;
import kr.teamcocoa.CloudNETLoadBalancer.listeners.PlayerJoinEvent;
import kr.teamcocoa.CloudNETLoadBalancer.listeners.PlayerQuitEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        BukkitCloudNetHelper.setApiMotd("JOINABLE");
        BridgeHelper.updateServiceInfo();
        Bukkit.getLogger().info("[CloudNetLoadBalancer] Activated!");
        Bukkit.getLogger().info("[CloudNetLoadBalancer] Made by fixca");
        loadListeners();
    }

    @Override
    public void onDisable(){
        Bukkit.getLogger().info("[CloudNetLoadBalancer] Deactivated!");
        Bukkit.getLogger().info("[CloudNetLoadBalancer] Made by fixca");
    }

    private void loadListeners(){
        getServer().getPluginManager().registerEvents(new PlayerJoinEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitEvent(), this);
    }
}
