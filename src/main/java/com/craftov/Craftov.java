package com.craftov;

import com.craftov.utils.ModRegistries;
import net.fabricmc.api.ModInitializer;
import com.craftov.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;


public class Craftov implements ModInitializer {
	public static final ItemGroup ALTYN_GROUP = FabricItemGroupBuilder.create(
					new Identifier("craftov", "altyncroup"))
			.icon(() -> new ItemStack(RegisterItems.ALTYN_HELMET))
			.build();

	public static final String MOD_ID = "craftov";
	public static final Logger LOGGER = LoggerFactory.getLogger("craftov");

	@Override
	public void onInitialize() {
		RegisterItems.register();
		ModItems.registerModItems();
		ModRegistries.registerModStuffs();

		GeckoLib.initialize();

		LOGGER.info("-");
	}
}