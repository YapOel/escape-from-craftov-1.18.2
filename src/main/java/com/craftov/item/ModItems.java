package com.craftov.item;

import com.craftov.Craftov;
import com.craftov.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TAGILLA_SPAWN_EGG = registerItem("tagilla_spawn_egg",
            new SpawnEggItem(ModEntities.TAGILLA,0x060d08, 0xFF2400,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Craftov.MOD_ID, name), item);

    }
    public static void registerModItems() {
        Craftov.LOGGER.info("Registering Mod Items for " + Craftov.MOD_ID);
    }
}
