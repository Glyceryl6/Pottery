package com.teampancake.pottery.data;

import com.teampancake.pottery.Pottery;
import com.teampancake.pottery.data.provider.PTBlockStateProvider;
import com.teampancake.pottery.data.provider.PTItemModelProvider;
import com.teampancake.pottery.data.provider.PTLootTableProvider;
import com.teampancake.pottery.data.provider.PTRecipeProvider;
import com.teampancake.pottery.data.provider.lang.PTLanguageProviderENUS;
import com.teampancake.pottery.data.provider.lang.PTLanguageProviderZHCN;
import com.teampancake.pottery.data.provider.tag.PTBlockTagsProvider;
import com.teampancake.pottery.data.provider.tag.PTItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Pottery.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PTDataGenerator {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        PTBlockTagsProvider blockTagsProvider = new PTBlockTagsProvider(output, provider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new PTItemTagsProvider(
                output, provider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeClient(), new PTBlockStateProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new PTItemModelProvider(output, existingFileHelper));
        generator.addProvider(event.includeServer(), new PTRecipeProvider(output, provider));
        generator.addProvider(event.includeClient(), new PTLanguageProviderENUS(output));
        generator.addProvider(event.includeClient(), new PTLanguageProviderZHCN(output));
        generator.addProvider(event.includeServer(), new PTLootTableProvider(output));
    }

}