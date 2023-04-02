package at.the2019.abilitycraft;

import java.util.ArrayList;
import java.util.List;


import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class items {
    public static ItemStack GrapplingHook;
    public static ItemStack BloodScyth;
    public static ItemStack PumkinAxe;
    public static ItemStack MeloneCapitor;

    public static void init(){
        CreateGrapplingHook();
        CreateBloodScyth();
        CreateFlowerOfTruth();
        CreatePumkinAxe();
        CreateMeloneCapitor();
    }



    private static void CreateGrapplingHook() {

        ItemStack item = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Grappling Hook");
        List <String> lore = new ArrayList<>();
        lore.add("§7 Travel in the direction that you looking");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        GrapplingHook = item;
    }
    private static void CreateBloodScyth(){
        ItemStack item = new ItemStack(Material.IRON_HOE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3Blood Scyth");
        List <String> lore = new ArrayList<>();
        lore.add("§7Item Ability: ");
        lore.add("Shoots a blood orb that deals ");
        lore.add("30 Damage per hit.");
        lore.add("");
        lore.add("§7LEGENDARY");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        BloodScyth = item;
    }
    private static void CreateFlowerOfTruth(){
        ItemStack item = new ItemStack(Material.POPPY);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Flower of Truth");
        List <String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§eItem Ability: §cShooting Rose");
        lore.add("§7Shoots a Flower that flys to nearby mobs ");
        lore.add("§7and damage that with 5 damage");
        lore.add("");
        lore.add("§7LEGENDARY");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
        BloodScyth = item;
    }
    private static void CreatePumkinAxe(){
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Pumkin Axe");
        List <String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Farms Pumkins more efficent and double drops ");
        lore.add("");
        lore.add("§7LEGENDARY");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        PumkinAxe = item;
    }
    private static void CreateMeloneCapitor(){
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Melone Capitor");
        List <String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Farms Melonoes more efficent and tribels drops ");
        lore.add("");
        lore.add("§7LEGENDARY");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        MeloneCapitor = item;
    }
}

