package com.craftov;

import com.craftov.material.AdidasMaterial;
import com.craftov.material.AltynMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.craftov.item.ModItems;
import static com.craftov.Craftov.ALTYN_GROUP;

public class RegisterItems {

    public static final ArmorMaterial Altyn = new AltynMaterial();
    public static final ArmorMaterial Adidas = new AdidasMaterial();
    public static final Item ALTYN_HELMET = new ArmorItem(Altyn, EquipmentSlot.HEAD, new Item.Settings().group(ALTYN_GROUP));
    public static final Item ADIDAS_LEGGINS = new ArmorItem(Adidas, EquipmentSlot.LEGS, new Item.Settings().group(ALTYN_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("craftov", "altyn_helmet"), ALTYN_HELMET);
        Registry.register(Registry.ITEM, new Identifier("craftov", "adidas_leggins"), ADIDAS_LEGGINS);

    }
}