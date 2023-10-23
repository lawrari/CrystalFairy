package com.lawrari.items;

import com.lawrari.McMirea;
import com.lawrari.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MCMIREA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(McMirea.MOD_ID, "mcmirea"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mcmirea"))
                    .icon(() -> new ItemStack(ModItems.CRYSTAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CRYSTAL);
                        entries.add(ModBlocks.CRYSTAL_ORE);
                        entries.add(ModBlocks.CRYSTAL_BLOCK);
                        entries.add(ModItems.CRYSTAL_PICKAXE);
                        entries.add(ModItems.CRYSTAL_AXE);
                        entries.add(ModItems.CRYSTAL_SHOVEL);
                        entries.add(ModItems.CRYSTAL_SWORD);
                        entries.add(ModItems.CRYSTAL_HOE);
                        entries.add(ModItems.CRYSTAL_HELMET);
                        entries.add(ModItems.CRYSTAL_CHESTPLATE);
                        entries.add(ModItems.CRYSTAL_LEGGINGS);
                        entries.add(ModItems.CRYSTAL_BOOTS);
                    }).build());

    public static void registerModItemGroups() {
        McMirea.LOGGER.info("Registering item groups...");
    }
}
