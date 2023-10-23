package com.lawrari.datagen;

import com.lawrari.blocks.ModBlocks;
import com.lawrari.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CRYSTAL, RecipeCategory.DECORATIONS,
                ModBlocks.CRYSTAL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_HOE, 1)
                .pattern("CC ")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.CRYSTAL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_PICKAXE, 1)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.CRYSTAL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_AXE, 1)
                .pattern("CC ")
                .pattern("CS ")
                .pattern(" S ")
                .input('C', ModItems.CRYSTAL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_SHOVEL, 1)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.CRYSTAL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTAL_SWORD, 1)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('C', ModItems.CRYSTAL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTAL_HELMET, 1)
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .input('C', ModItems.CRYSTAL)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTAL_CHESTPLATE, 1)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.CRYSTAL)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTAL_LEGGINGS, 1)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.CRYSTAL)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTAL_BOOTS, 1)
                .pattern("   ")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.CRYSTAL)
                .criterion(hasItem(ModItems.CRYSTAL), conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRYSTAL_BOOTS)));
    }
}
