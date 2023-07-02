package com.craftov.entity.client;

import com.craftov.Craftov;
import com.craftov.entity.custom.TagillaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TagillaRenderer extends GeoEntityRenderer<TagillaEntity> {
    public TagillaRenderer(EntityRendererFactory.Context animatable) {
        super(animatable, new TagillaModel());
    }

    @Override
    public Identifier getTextureLocation(TagillaEntity animatable) {
        return new Identifier(Craftov.MOD_ID, "textures/entity/tagilla.png");
    }
}
