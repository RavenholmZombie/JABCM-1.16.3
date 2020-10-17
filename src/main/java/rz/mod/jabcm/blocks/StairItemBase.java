package rz.mod.jabcm.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import rz.mod.jabcm.JABCM_Main;

public class StairItemBase extends BlockItem
{
    public StairItemBase(Block block)
    {
        super(block, new Item.Properties().group(JABCM_Main.JABCM_BLOCKS));
    }
}
