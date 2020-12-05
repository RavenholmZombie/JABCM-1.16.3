package rz.mod.jabcm.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import rz.mod.jabcm.Main;

public class PlateItemBase extends BlockItem
{
    public PlateItemBase(Block block)
    {
        super(block, new Item.Properties().group(Main.JABCM_REDSTONE));
    }
}
