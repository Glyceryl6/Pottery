package com.teampancake.pottery.data.provider;

import com.teampancake.pottery.Pottery;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class PTBlockStateProvider extends BlockStateProvider {

    public PTBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Pottery.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

}