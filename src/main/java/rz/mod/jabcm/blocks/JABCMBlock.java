package rz.mod.jabcm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class JABCMBlock extends Block
{
    public JABCMBlock()
    {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
