package com.teampancake.pottery.data.provider.lang;

import com.teampancake.pottery.Pottery;
import com.teampancake.pottery.registry.PTItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PTLanguageProviderENUS extends LanguageProvider {

    public PTLanguageProviderENUS(PackOutput output) {
        super(output, Pottery.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(PTItems.DECORATED_POT_MINECART.get(), "Minecart with Decorated Pot");
    }

}