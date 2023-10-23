package com.lawrari.utils;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class OreGen {
    public static final RegistryKey<PlacedFeature> CRYSTAL_ORE_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE,
            new Identifier("mcmirea", "crystal_ore"));

    public static void RegisterOreGeneration() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                CRYSTAL_ORE_KEY);
    }
}
