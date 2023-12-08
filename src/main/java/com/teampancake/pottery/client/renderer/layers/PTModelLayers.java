package com.teampancake.pottery.client.renderer.layers;

import com.teampancake.pottery.Pottery;
import com.teampancake.pottery.registry.PTItems;
import net.minecraft.client.model.geom.ModelLayerLocation;

public class PTModelLayers {

    public static final ModelLayerLocation DECORATED_POT_MINECART = new ModelLayerLocation(PTItems.DECORATED_POT_MINECART.getId(), "main");
    public static final ModelLayerLocation DECORATED_POT_MINECART_BASE = register("decorated_pot_base");
    public static final ModelLayerLocation DECORATED_POT_MINECART_SIDES = register("decorated_pot_sides");

    private static ModelLayerLocation register(String path) {
        return new ModelLayerLocation(Pottery.prefix(path), "main");
    }

}