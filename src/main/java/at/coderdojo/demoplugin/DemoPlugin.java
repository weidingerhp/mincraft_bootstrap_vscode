package at.coderdojo.demoplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class DemoPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("sayhello").setExecutor((sender, command, label, args) -> SayHelloCommand(sender, command, label, args));
    }

    private boolean SayHelloCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("Oh - Hallo \"" + sender.getName() + "\"");
        return true;
    }
    
}