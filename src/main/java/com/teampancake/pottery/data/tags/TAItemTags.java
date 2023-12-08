package com.teampancake.pottery.data.tags;

import com.teampancake.pottery.Pottery;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TAItemTags {

    private static TagKey<Item> create(String name) {
        return ItemTags.create(Pottery.prefix(name));
    }

}