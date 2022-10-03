package net.shale.horde.core.worldgen.nether;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.shale.horde.core.Main;
import net.shale.horde.core.blocks.ore_nether;

import java.util.Arrays;

public class dragonstone_nether {
    private static final ConfiguredFeature<?, ?> NETHER_DRAGONSTONE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    ore_nether.DRAGONSTONE_NETHER_ORE.getDefaultState(),
                    9)); // vein size

    public static PlacedFeature NETHER_DRAGONSTONE_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(NETHER_DRAGONSTONE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(319))
            )); // height

    public static void registerWorldGeneration() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, Main.id("dragonstone_nether_ore"), NETHER_DRAGONSTONE_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, Main.id("dragonstone_nether_ore"), NETHER_DRAGONSTONE_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY, Main.id("dragonstone_nether_ore")));
    }
}
