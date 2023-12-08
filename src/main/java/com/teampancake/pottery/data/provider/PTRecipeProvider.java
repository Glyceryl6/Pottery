package com.teampancake.pottery.data.provider;

import com.teampancake.pottery.Pottery;
import com.teampancake.pottery.crafting.DecoratedPotMinecartRecipe;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SpecialRecipeBuilder;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
public class PTRecipeProvider extends RecipeProvider {

    public PTRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        SpecialRecipeBuilder.special(DecoratedPotMinecartRecipe::new).save(recipeOutput, Pottery.prefix("decorated_pot_minecart"));
    }

}