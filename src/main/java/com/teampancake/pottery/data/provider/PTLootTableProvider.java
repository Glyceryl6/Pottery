package com.teampancake.pottery.data.provider;

import com.teampancake.pottery.data.loot.PTBlockLoot;
import com.teampancake.pottery.data.loot.PTEntityLoot;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class PTLootTableProvider extends LootTableProvider {

    public PTLootTableProvider(PackOutput output) {
        super(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(PTBlockLoot::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(PTEntityLoot::new, LootContextParamSets.ENTITY)));
    }

}