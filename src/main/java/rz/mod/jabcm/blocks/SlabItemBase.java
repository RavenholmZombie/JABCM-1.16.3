package rz.mod.jabcm.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import rz.mod.jabcm.Main;

public class SlabItemBase extends BlockItem
{
    public SlabItemBase(Block block)
    {
        super(block, new Item.Properties().group(Main.JABCM_BLOCKS));
    }
}
