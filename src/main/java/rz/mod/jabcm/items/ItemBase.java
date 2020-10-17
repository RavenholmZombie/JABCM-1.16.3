package rz.mod.jabcm.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import rz.mod.jabcm.JABCM_Main;

public class ItemBase extends Item
{

    public ItemBase() {
        super(new Item.Properties().group(JABCM_Main.JABCM_BLOCKS));
    }
}
