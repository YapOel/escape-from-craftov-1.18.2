package com.craftov;

import com.craftov.entity.ModEntities;
import com.craftov.entity.client.TagillaRenderer;
import com.craftov.entity.client.armor.KillaArmorRenderer;
import com.craftov.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CraftovClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.TAGILLA, TagillaRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(new KillaArmorRenderer(), ModItems.KILLA_ARMOR);
    }
}
