package com.teampancake.pottery.data.provider;

import com.teampancake.pottery.Pottery;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class PTItemModelProvider extends ItemModelProvider {

    public PTItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Pottery.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

}