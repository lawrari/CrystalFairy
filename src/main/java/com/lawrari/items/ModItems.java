package com.lawrari.items;

import com.lawrari.McMirea;
import com.lawrari.items.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CRYSTAL = registerItem("crystal", new Item(new FabricItemSettings()));

    public static final Item CRYSTAL_PICKAXE = registerItem("crystal_pickaxe",
            new PickaxeItem(ModToolMaterial.CRYSTAL, 7, 8f, new FabricItemSettings()));

    public static final Item CRYSTAL_AXE = registerItem("crystal_axe",
            new AxeItem(ModToolMaterial.CRYSTAL, 12f, 12f, new FabricItemSettings()));

    public static final Item CRYSTAL_SHOVEL = registerItem("crystal_shovel",
            new ShovelItem(ModToolMaterial.CRYSTAL, 7, 7f, new FabricItemSettings()));

    public static final Item CRYSTAL_SWORD = registerItem("crystal_sword",
            new SwordItem(ModToolMaterial.CRYSTAL, 10, 16f, new FabricItemSettings()));

    public static final Item CRYSTAL_HOE = registerItem("crystal_hoe",
            new HoeItem(ModToolMaterial.CRYSTAL, 1, 5, new FabricItemSettings()));

    public static final Item CRYSTAL_HELMET = registerItem("crystal_helmet",
            new ModArmorItem(ModArmorMaterials.CRYSTAL, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item CRYSTAL_CHESTPLATE = registerItem("crystal_chestplate",
            new ArmorItem(ModArmorMaterials.CRYSTAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item CRYSTAL_LEGGINGS = registerItem("crystal_leggings",
            new ArmorItem(ModArmorMaterials.CRYSTAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item CRYSTAL_BOOTS = registerItem("crystal_boots",
            new ArmorItem(ModArmorMaterials.CRYSTAL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(McMirea.MOD_ID, name), item);
    }

    public static void registerModItems() {
        McMirea.LOGGER.info("Registering items...");
    }
}
