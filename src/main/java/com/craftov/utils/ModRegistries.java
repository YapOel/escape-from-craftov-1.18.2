package com.craftov.utils;

import com.craftov.entity.ModEntities;
import com.craftov.entity.custom.TagillaEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.TAGILLA, TagillaEntity.setAttributes());
    }
}