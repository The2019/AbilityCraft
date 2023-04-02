package at.the2019.abilitycraft;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class pumkin_axe implements Listener{

    @EventHandler
    public void onBreake(BlockBreakEvent event){
        Block block = event.getBlock();
        Player player = event.getPlayer();
        Material material = block.getType();


        if(material.equals(Material.PUMPKIN)){
            if(player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§7Farms Pumkins more efficent and double drops ")){
                event.setDropItems(false);
                player.getInventory().addItem(new ItemStack(Material.PUMPKIN, 2));
                
                
                }
            }
        }
    }
