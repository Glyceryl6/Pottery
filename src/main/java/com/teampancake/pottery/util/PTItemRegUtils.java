package com.teampancake.pottery.util;

import com.teampancake.pottery.registry.PTItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.function.Supplier;

public class PTItemRegUtils {

    public static DeferredItem<Item> food(String name, int nutrition, float saturation) {
        return PTItems.ITEMS.register(name, () -> new Item(new Item.Properties().food(
                new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturation).build())));
    }

    public static DeferredItem<Item> alias(String name, DeferredBlock<Block> block, Item.Properties properties) {
        return PTItems.ITEMS.register(name, () -> new ItemNameBlockItem(block.get(), properties));
    }

    public static DeferredItem<Item> spawnEgg(String name, Supplier<? extends EntityType<? extends Mob>> type, int backgroundColor, int highlightColor) {
        return PTItems.ITEMS.register(name + "_spawn_egg", () -> new DeferredSpawnEggItem(type, backgroundColor, highlightColor, new Item.Properties()));
    }

}
