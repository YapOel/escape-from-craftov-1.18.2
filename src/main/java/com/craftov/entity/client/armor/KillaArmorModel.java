package com.craftov.entity.client.armor;

import com.craftov.Craftov;
import com.craftov.item.custom.KillaArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KillaArmorModel extends AnimatedGeoModel<KillaArmorItem> {
    @Override
    public Identifier getModelLocation(KillaArmorItem object) {
        return new Identifier(Craftov.MOD_ID, "geo/killaarmor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(KillaArmorItem object) {
        return new Identifier(Craftov.MOD_ID, "textures/models/armor/killaarmor.png");
    }

    @Override
    public Identifier getAnimationFileLocation(KillaArmorItem animatable) {
        return new Identifier(Craftov.MOD_ID, "animations/armor_animation.json");
    }
}
