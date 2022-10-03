package net.shale.horde.core;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.shale.horde.core.worldgen.end.dragonstone_end;
import net.shale.horde.core.worldgen.end.rhodonite_end;
import net.shale.horde.core.worldgen.nether.bismuth_basalt;
import net.shale.horde.core.worldgen.nether.bismuth_blackstone;
import net.shale.horde.core.worldgen.nether.dragonstone_nether;
import net.shale.horde.core.worldgen.overworld.dragonstone_deepslate;
import net.shale.horde.core.worldgen.overworld.dragonstone_stone;
import net.shale.horde.core.worldgen.overworld.rhodonite_deepslate;
import net.shale.horde.core.worldgen.overworld.rhodonite_stone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String ID = "horde-core";


	public static Identifier id(String path) {
		return new Identifier(ID, path);
	}
	@Override
	public void onInitialize() {
		dragonstone_stone.registerWorldGeneration();
		dragonstone_deepslate.registerWorldGeneration();
		dragonstone_nether.registerWorldGeneration();
		dragonstone_end.registerWorldGeneration();
		rhodonite_stone.registerWorldGeneration();
		rhodonite_deepslate.registerWorldGeneration();
		rhodonite_end.registerWorldGeneration();
		bismuth_basalt.registerWorldGeneration();
		bismuth_blackstone.registerWorldGeneration();
	}
}
