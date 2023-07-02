package com.craftov.entity.client;

import com.craftov.Craftov;
import com.craftov.entity.custom.TagillaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class TagillaModel extends AnimatedGeoModel<TagillaEntity> {
    @Override
    public Identifier getModelLocation(TagillaEntity object) {
        return new Identifier(Craftov.MOD_ID, "geo/tagilla.geo.json");                  // Model path
    }

    @Override
    public Identifier getTextureLocation(TagillaEntity object) {
        return new Identifier(Craftov.MOD_ID, "textures/entity/tagilla.png");           // Texture path
    }

    @Override
    public Identifier getAnimationFileLocation(TagillaEntity animatable) {
        return new Identifier(Craftov.MOD_ID, "animations/model.animation.json");       // Animation path
    }

    @Override
    public void setLivingAnimations(TagillaEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("Head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
