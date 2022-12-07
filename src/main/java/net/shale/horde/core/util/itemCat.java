package net.shale.horde.core.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shale.horde.core.Main;
import net.shale.horde.core.items.raw_overworld;

public class itemCat {
    public static final ItemGroup MAIN = FabricItemGroupBuilder.build(new Identifier(Main.ID, "main"),
            () -> new ItemStack(raw_overworld.RAW_RHODONITE));
}
