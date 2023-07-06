package com.craftov.item;

import com.craftov.Craftov;
import com.craftov.entity.ModEntities;
import com.craftov.item.custom.KillaArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TAGILLA_SPAWN_EGG = registerItem("tagilla_spawn_egg",
            new SpawnEggItem(ModEntities.TAGILLA,0x060d08, 0xFF2400,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    public static final Item MK47 = registerItem("mk47",
            new CrossbowItem(new FabricItemSettings().group(Craftov.ALTYN_GROUP).maxCount(1)));

    public static final Item GUNPARTS = registerItem("gunparts",
            new Item(new FabricItemSettings().group(Craftov.ALTYN_GROUP).maxCount(64)));
    public static final Item KILLA_ARMOR = registerItem("killa_armor",
            new KillaArmorItem(ModArmorMaterials.KILLA, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(Craftov.ALTYN_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Craftov.MOD_ID, name), item);

    }
    public static void registerModItems() {
        Craftov.LOGGER.info("Registering Mod Items for " + Craftov.MOD_ID);
    }
}
