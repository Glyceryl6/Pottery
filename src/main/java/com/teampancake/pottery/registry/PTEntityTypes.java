package com.teampancake.pottery.registry;

import com.teampancake.pottery.Pottery;
import com.teampancake.pottery.client.renderer.DecoratedPotMinecartRenderer;
import com.teampancake.pottery.client.renderer.layers.PTModelLayers;
import com.teampancake.pottery.common.entities.misc.MinecartDecoratedPot;
import net.minecraft.client.model.MinecartModel;
import net.minecraft.client.renderer.blockentity.DecoratedPotRenderer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod.EventBusSubscriber(modid = Pottery.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PTEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, Pottery.MOD_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<MinecartDecoratedPot>> MINECART_DECORATED_POT =
            ENTITY_TYPES.register("minecart_decorated_pot", () -> EntityType.Builder.<MinecartDecoratedPot>of(MinecartDecoratedPot::new, MobCategory.MISC)
                    .sized(0.98F, 0.7F).clientTrackingRange(8).build("minecart_decorated_pot"));

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(MINECART_DECORATED_POT.get(), DecoratedPotMinecartRenderer::new);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(PTModelLayers.DECORATED_POT_MINECART, MinecartModel::createBodyLayer);
        event.registerLayerDefinition(PTModelLayers.DECORATED_POT_MINECART_BASE, DecoratedPotRenderer::createBaseLayer);
        event.registerLayerDefinition(PTModelLayers.DECORATED_POT_MINECART_SIDES, DecoratedPotRenderer::createSidesLayer);
    }

}