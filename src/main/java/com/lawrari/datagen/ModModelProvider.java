package com.lawrari.datagen;

import com.lawrari.blocks.ModBlocks;
import com.lawrari.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRYSTAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRYSTAL_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRYSTAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTAL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRYSTAL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRYSTAL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRYSTAL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRYSTAL_BOOTS);
    }
}
