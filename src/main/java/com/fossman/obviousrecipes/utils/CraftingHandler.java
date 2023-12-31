package com.fossman.obviousrecipes.utils;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistry;

public class CraftingHandler {
	public static void RegisterRecipes() {
        /* TODO find a way to register crafting recipes w/o Forge interfering */
	}

	public static void removeRecipes() {
		ForgeRegistry<IRecipe>  recipeRegistry  = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
        ArrayList<IRecipe>      recipes         = Lists.newArrayList(recipeRegistry.getValuesCollection());

        for (IRecipe r : recipes)
        {
            ItemStack output = r.getRecipeOutput();
            if (output.getItem() == Items.GOLDEN_APPLE)
            {
                recipeRegistry.remove(r.getRegistryName());
                recipeRegistry.register(IRecipe DummyRecipe.getCraftingResult())
            }
        }
	}
}