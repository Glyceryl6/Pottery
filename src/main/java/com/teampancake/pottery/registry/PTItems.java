package com.teampancake.pottery.registry;

import com.teampancake.pottery.Pottery;
import com.teampancake.pottery.common.items.DecoratedPotMinecart;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PTItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Pottery.MOD_ID);

    public static final DeferredItem<Item> DECORATED_POT_MINECART = ITEMS.register("decorated_pot_minecart", DecoratedPotMinecart::new);

}