package me.shakeforprotein.shakenbt.Commands;

import me.shakeforprotein.shakenbt.ShakeNBT;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Set;

public class SetNBT  implements CommandExecutor {

    private ShakeNBT pl;

    public SetNBT(ShakeNBT main) {
        this.pl = main;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/*
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.getInventory().getItemInMainHand() != null && p.getInventory().getItemInMainHand().getType() != Material.AIR) {
                ItemStack bukkitItem = p.getInventory().getItemInMainHand();
                net.minecraft.server.v1_15_R1.ItemStack nmsItem = pl.getNMSItem(bukkitItem);
                NBTTagCompound compound = pl.getCompound(nmsItem);
                Set<String> compoundKeys = compound.getKeys();

            }
            else {p.sendMessage("You must have an item in your main hand");}
        }
        else{
            sender.sendMessage("This plugin can only be run as a player");
        }
            */
            sender.sendMessage("Shake never actually got around to implementing this command.");
        return true;
    }
}