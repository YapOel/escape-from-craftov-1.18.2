package com.craftov;

import com.craftov.entity.ModEntities;
import com.craftov.entity.client.TagillaRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class CraftovClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TAGILLA, TagillaRenderer::new);
    }
}
