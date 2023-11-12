package net.ralazar.pokeworld.core;


import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;

public class RalazarPortalBuilder {

	public static void init() {
		CustomPortalBuilder.beginPortal()
	    .frameBlock(Blocks.STONE)
				.lightWithWater()
	    .destDimID(new ResourceLocation("pokeworld:pokeworld"))
	    .tintColor(0, 50, 255)
				.onlyLightInOverworld()
	    .registerPortal();
	}
}