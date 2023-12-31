package com.teampancake.pottery.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;

public class SlabBlockWithBase extends SlabBlock {

    private final Block base;

    public SlabBlockWithBase(Block base, Properties properties) {
        super(properties);
        this.base = base;
    }

    public Block getBase() {
        return this.base;
    }

}