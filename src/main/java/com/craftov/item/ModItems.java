package com.craftov.item;

import com.craftov.Craftov;
import com.craftov.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class ModItems {
    public static final Item TAGILLA_SPAWN_EGG = registerItem("tagilla_spawn_egg",
            new SpawnEggItem(ModEntities.TAGILLA,0x060d08, 0xFF2400,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    public static final Item MK47 = registerItem("mk47",
            new CrossbowItem(new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1)));

    public static final Item GUNPARTS = registerItem("gunparts",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Craftov.MOD_ID, name), item);

    }
    public static void registerModItems() {
        Craftov.LOGGER.info("Registering Mod Items for " + Craftov.MOD_ID);
    }
}
