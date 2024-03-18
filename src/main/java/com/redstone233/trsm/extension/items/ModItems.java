package com.redstone233.trsm.extension.items;

import com.redstone233.trsm.extension.TRSMExtension;
// import com.redstone233.spawn.reforged.block.ModBlocks;
// import com.redstone233.trsm.extension.items.ModArmorItem;
// import com.redstone233.spawn.reforged.items.custom.Prospectetor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

     public static final Item EXTEND_ITEM = registerItems("extend_item", 
         new Item(new FabricItemSettings()));
         
     public static final Item EXTEND_KEY = registerItems("extend_key", 
         new Item(new FabricItemSettings()));
        
    // public static final Item PROSPECTOR = registerItems("prospector", 
        // new Prospectetor(new FabricItemSettings().maxDamage(64)));

    // public static final Item REFORGED_PICKAXE = registerItems("reforged_pickaxe", 
        // new PickaxeItem(ModToolMaterial.REFORGED_ITEM, 5, 2.3f, 
            // new FabricItemSettings()));
    
    // public static final Item REFORGED_AXE = registerItems("reforged_axe", 
        // new AxeItem(ModToolMaterial.REFORGED_ITEM, 15, -3.5f, 
            // new FabricItemSettings()));
            
    // public static final Item COMBO_AXE = registerItems("combo_axe", 
        // new AxeItem(ModToolMaterial.REFORGED_ITEM, 15, 5.5f, 
            // new FabricItemSettings()));
            
    // public static final Item SECOND_AXE = registerItems("second_axe", 
        // new AxeItem(ModToolMaterial.REFORGED_ITEM, 100, -3.5f, 
            // new FabricItemSettings()));

    // public static final Item REFORGED_SHOVRL = registerItems("reforged_shovel", 
        // new ShovelItem(ModToolMaterial.REFORGED_ITEM, 3, 2.7f, 
            // new FabricItemSettings()));    

     public static final Item EXTEND_SWORD = registerItems("extend_sword", 
         new SwordItem(ModToolMaterial.EXTEND_ITEM, 10, 3.6f, 
             new FabricItemSettings()));

    // public static final Item REFORGED_HOE = registerItems("reforged_hoe", 
        // new HoeItem(ModToolMaterial.REFORGED_ITEM, 6, 2.6f, 
            // new FabricItemSettings()));

    // public static final Item REFORGED_HELMET = registerItems("reforged_helmets",
        // new ModArmorItem(ModArmorMaterial.REFORGED_ITEM, ArmorItem.Type.HELMET, 
            // new FabricItemSettings()));

    // public static final Item REFORGED_CHESTPLATE = registerItems("reforged_chestplates",
        // new ArmorItem(ModArmorMaterial.REFORGED_ITEM, ArmorItem.Type.CHESTPLATE, 
            // new FabricItemSettings()));

    // public static final Item REFORGED_LEGGINGS = registerItems("reforged_leggings",
        // new ArmorItem(ModArmorMaterial.REFORGED_ITEM, ArmorItem.Type.LEGGINGS, 
            // new FabricItemSettings()));

    // public static final Item REFORGED_BOOTS = registerItems("reforged_boots",
        // new ArmorItem(ModArmorMaterial.REFORGED_ITEM, ArmorItem.Type.BOOTS, 
            // new FabricItemSettings()));

    // public static final Item REFORGED_FOOD = registerItems("reforged_food",
        // new Item(new FabricItemSettings().food(ModFoodComponents.REFORGED_FOOD)));

    // public static final Item REFORGED_APPLE = registerItems("reforged_apple",
        // new Item(new FabricItemSettings().food(ModFoodComponents.REFORGED_APPLE)));

     // public static final Item REFORGED_APPLE_SEEDS = registerItems("reforged_apple_seeds",
         // new AliasedBlockItem(ModBlocks.REFORGED_APPLE_CROP, new FabricItemSettings()));

    // public static final Item REFORGED_COAL = registerItems("reforged_coal", 
    // new Item(new FabricItemSettings()));

    private static void addItemsToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(EXTEND_ITEM);
    }

    private static Item registerItems(String name,Item item) {
        return Registry.register(Registries.ITEM,
            new Identifier(TRSMExtension.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIG);
    }
}
