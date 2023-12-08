package com.teampancake.pottery.data.tags;

import com.teampancake.pottery.Pottery;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TABlockTags {

    private static TagKey<Block> create(String name) {
        return BlockTags.create(Pottery.prefix(name));
    }

}