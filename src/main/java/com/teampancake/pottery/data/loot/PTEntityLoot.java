package com.teampancake.pottery.data.loot;

import com.teampancake.pottery.Pottery;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.packs.VanillaEntityLoot;
import net.minecraft.world.entity.EntityType;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.stream.Stream;

public class PTEntityLoot extends VanillaEntityLoot {

    @Override
    public void generate() {

    }

    @Override
    protected @NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        return BuiltInRegistries.ENTITY_TYPE.stream().filter(entities -> BuiltInRegistries.ENTITY_TYPE.getKey(entities).getNamespace().equals(Pottery.MOD_ID));
    }

}