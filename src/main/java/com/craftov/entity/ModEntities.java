package com.craftov.entity;

import com.craftov.Craftov;
import com.craftov.entity.custom.TagillaEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<TagillaEntity> TAGILLA = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Craftov.MOD_ID, "tagilla"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TagillaEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());

}
