package com.teampancake.pottery.registry;

import com.teampancake.pottery.Pottery;
import com.teampancake.pottery.crafting.DecoratedPotMinecartRecipe;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PTRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, Pottery.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, Pottery.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<DecoratedPotMinecartRecipe>> DECORATED_POT_MINECART_SERIALIZER =
            RECIPE_SERIALIZERS.register("crafting_decorated_pot_minecart", () -> new SimpleCraftingRecipeSerializer<>(DecoratedPotMinecartRecipe::new));

}