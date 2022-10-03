package net.shale.horde.core.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.core.Main;

public class ore_nether {
    public static final Block DRAGONSTONE_NETHER_ORE = registerBlock("ores/dragonstone_nether",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block RHODONITE_NETHER_ORE = registerBlock("ores/rhodonite_nether",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block BISMUTH_BASALT = registerBlock("ores/bismuth_basalt",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block BISMUTH_BLACKSTONE = registerBlock("ores/bismuth_blackstone",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), new BlockItem(block,
                new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void registerBlock() {

    }
}
