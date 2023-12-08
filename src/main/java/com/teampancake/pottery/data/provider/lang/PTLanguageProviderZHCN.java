package com.teampancake.pottery.data.provider.lang;

import com.teampancake.pottery.Pottery;
import com.teampancake.pottery.registry.PTItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PTLanguageProviderZHCN extends LanguageProvider {

    public PTLanguageProviderZHCN(PackOutput output) {
        super(output, Pottery.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.add(PTItems.DECORATED_POT_MINECART.get(), "饰纹陶罐矿车");
    }

}