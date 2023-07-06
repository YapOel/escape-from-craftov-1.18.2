package com.craftov.entity.client.armor;

import com.craftov.item.custom.KillaArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KillaArmorRenderer extends GeoArmorRenderer<KillaArmorItem>{
    public KillaArmorRenderer() {
        super(new KillaArmorModel());
        this.bodyBone = "armorBody";
    }
}
