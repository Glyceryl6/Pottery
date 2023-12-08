package com.teampancake.pottery.util;

import com.teampancake.pottery.registry.PTBlocks;
import com.teampancake.pottery.common.blocks.SlabBlockWithBase;
import com.teampancake.pottery.common.blocks.WallBlockWithBase;
import com.teampancake.pottery.registry.PTItems;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public class PTBlockRegUtils {

    public static DeferredBlock<Block> register(String name, Supplier<Block> block) {
        DeferredBlock<Block> register = PTBlocks.BLOCKS.register(name, block);
        PTItems.ITEMS.register(name, () -> new BlockItem(register.get(), new Item.Properties()));
        return register;
    }

    public static DeferredBlock<Block> ore(String name, IntProvider xpRange, BlockBehaviour.Properties properties) {
        return register(name, () -> new DropExperienceBlock(xpRange, properties.requiresCorrectToolForDrops()));
    }

    public static DeferredBlock<Block> wood(String name, MapColor mapColor, float strength) {
        return register(name, () -> new RotatedPillarBlock(BlockBehaviour.Properties
                .of().mapColor(mapColor).instrument(NoteBlockInstrument.BASS)
                .strength(strength).sound(SoundType.WOOD).ignitedByLava()));
    }

    public static DeferredBlock<Block> flowerPot(String name, Supplier<Block> block) {
        return PTBlocks.BLOCKS.register("potted_" + name, () -> Blocks.flowerPot(block.get()));
    }

    public static DeferredBlock<Block> pressurePlate(String name, BlockSetType blockSetType, BlockBehaviour.Properties properties) {
        return register(name, () -> new PressurePlateBlock(blockSetType, properties));
    }

    public static DeferredBlock<Block> fenceGate(String name, WoodType woodType, BlockBehaviour.Properties properties) {
        return register(name, () -> new FenceGateBlock(woodType, properties));
    }

    public static DeferredBlock<Block> trapdoor(String name, BlockSetType blockSetType, BlockBehaviour.Properties properties) {
        return register(name, () -> new TrapDoorBlock(blockSetType, properties));
    }

    public static DeferredBlock<Block> button(String name, boolean sensitive, BlockSetType blockSetType) {
        return register(name, () -> sensitive ? Blocks.woodenButton(blockSetType) : Blocks.stoneButton());
    }

    public static <T extends Block> DeferredBlock<Block> stair(String name, Supplier<T> block, BlockBehaviour.Properties properties) {
        return register(name, () -> new StairBlock(block.get().defaultBlockState(), properties));
    }

    public static DeferredBlock<Block> fence(String name, BlockBehaviour.Properties properties) {
        return register(name, () -> new FenceBlock(properties));
    }

    public static DeferredBlock<Block> door(String name, BlockSetType blockSetType, BlockBehaviour.Properties properties) {
        return register(name, () -> new DoorBlock(blockSetType, properties));
    }

    public static <T extends Block> DeferredBlock<Block> slab(String name, Supplier<T> base, BlockBehaviour.Properties properties) {
        return register(name, () -> new SlabBlockWithBase(base.get(), properties));
    }

    public static <T extends Block> DeferredBlock<Block> wall(String name, Supplier<T> base, BlockBehaviour.Properties properties) {
        return register(name, () -> new WallBlockWithBase(base.get(), properties));
    }

}