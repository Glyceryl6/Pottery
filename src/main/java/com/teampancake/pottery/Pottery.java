package com.teampancake.pottery;

import com.teampancake.pottery.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import java.util.Locale;

@Mod(Pottery.MOD_ID)
public class Pottery {

    public static final String MOD_ID = "pottery";

    public Pottery(IEventBus modEventBus) {
        PTTabs.TABS.register(modEventBus);
        PTItems.ITEMS.register(modEventBus);
        PTBlocks.BLOCKS.register(modEventBus);
        PTMobEffect.MOB_EFFECTS.register(modEventBus);
        PTEntityTypes.ENTITY_TYPES.register(modEventBus);
        PTEnchantments.ENCHANTMENTS.register(modEventBus);
        PTRecipes.RECIPE_SERIALIZERS.register(modEventBus);
        PTRecipes.RECIPE_TYPES.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    @SubscribeEvent
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }

}