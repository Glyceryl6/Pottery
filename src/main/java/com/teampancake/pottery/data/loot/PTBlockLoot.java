package com.teampancake.pottery.data.loot;

import com.teampancake.pottery.Pottery;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.level.block.Block;

import java.util.stream.Collectors;

@MethodsReturnNonnullByDefault
public class PTBlockLoot extends VanillaBlockLoot {

    @Override
    protected void generate() {

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream().filter(block -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(Pottery.MOD_ID)).collect(Collectors.toList());
    }

}