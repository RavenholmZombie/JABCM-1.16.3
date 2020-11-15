package rz.mod.jabcm.util;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rz.mod.jabcm.JABCM_Main;
import rz.mod.jabcm.blocks.JABCMFence;
import rz.mod.jabcm.blocks.JABCMPressurePlate;
import rz.mod.jabcm.blocks.PlateItemBase;
import rz.mod.jabcm.blocks.StairItemBase;

public class PressurePlateRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JABCM_Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JABCM_Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Blocks
    public static final RegistryObject<Block> WHITE_JPLATE = BLOCKS.register("jplate_white", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.8F).sound(SoundType.STONE)));


    // Block Items
    public static final RegistryObject<Item> WHITE_JPLATE_ITEM = ITEMS.register("jplate_white", () -> new PlateItemBase(WHITE_JPLATE.get()));


}
