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
import net.shale.horde.core.util.itemCat;

public class ore_end {
    public static final Block DRAGONSTONE_END_ORE = registerBlock("ores/dragonstone_end",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()
            ));

    public static final Block RHODONITE_END = registerBlock("ores/rhodonite_end",
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
                new FabricItemSettings().group(itemCat.MAIN)));
    }

    public static void registerBlock() {

    }
}
