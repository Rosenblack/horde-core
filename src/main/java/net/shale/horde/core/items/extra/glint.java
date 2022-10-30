package net.shale.horde.core.items.extra;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class glint extends Item {
    public glint(Settings settings) {
        super(settings);
    }
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
