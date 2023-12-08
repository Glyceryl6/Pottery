package com.teampancake.pottery.registry;

import com.teampancake.pottery.Pottery;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PTMobEffect {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, Pottery.MOD_ID);

}