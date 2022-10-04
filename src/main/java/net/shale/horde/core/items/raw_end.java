package net.shale.horde.core.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.core.Main;

public class raw_end {
    public static final Item RAW_DRAGONSTONE_END = registerItem("raw/dragonstone_end", new Item(new FabricItemSettings()
            .group(ItemGroup.MATERIALS)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
