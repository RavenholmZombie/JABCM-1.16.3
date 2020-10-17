package rz.mod.jabcm.util;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rz.mod.jabcm.JABCM_Main;
import rz.mod.jabcm.blocks.BlockItemBase;

public class StairsRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JABCM_Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JABCM_Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Stair Blocks
    public static final RegistryObject<Block> WHITE_STAIRS = BLOCKS.register("concrete_stairs_white", () -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA)));

    // Stair Block Items
    public static final RegistryObject<Item> WHITE_STAIRS_ITEM = ITEMS.register("concrete_stairs_white", () -> new BlockItemBase(WHITE_STAIRS.get()));

}
