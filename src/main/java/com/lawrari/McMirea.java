package com.lawrari;

import com.lawrari.blocks.ModBlocks;
import com.lawrari.items.ModItemGroups;
import com.lawrari.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.lawrari.utils.OreGen.RegisterOreGeneration;

public class McMirea implements ModInitializer {
	public static final String MOD_ID = "mcmirea";
    public static final Logger LOGGER = LoggerFactory.getLogger("mcmirea");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing McMirea...");

		ModItemGroups.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		RegisterOreGeneration();

		LOGGER.info("McMirea Loaded!");
	}
}