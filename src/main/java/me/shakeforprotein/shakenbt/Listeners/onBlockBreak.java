package me.shakeforprotein.shakenbt.Listeners;

import me.shakeforprotein.shakenbt.ShakeNBT;
import org.bukkit.event.Listener;

import java.util.*;

public class onBlockBreak implements Listener {
    private ShakeNBT pl;

    public onBlockBreak(ShakeNBT main) {
        this.pl = main;
    }


   /* @EventHandler
    public void witherBreakBlocks(EntityExplodeEvent e) {
        double[] tps = MinecraftServer.getServer().recentTps;
        if (tps[0] < 18) {
            if (e.getEntity().getType().name().toUpperCase().contains("WITHER")) {
                e.setCancelled(true);
                for (Block b : e.blockList()) {
                    b.setType(Material.AIR);
                }
            }
        }
    }

    @EventHandler
    public void witherBreakBlocks2(EntityChangeBlockEvent e) {
        double[] tps = MinecraftServer.getServer().recentTps;
        if (tps[0] < 18) {
            if (e.getEntity().getType().name().toUpperCase().contains("WITHER")) {
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
            }
        }
    }*/

}
