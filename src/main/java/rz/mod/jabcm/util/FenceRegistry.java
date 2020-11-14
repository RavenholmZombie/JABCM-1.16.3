package rz.mod.jabcm.util;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rz.mod.jabcm.JABCM_Main;
import rz.mod.jabcm.blocks.JABCMFence;

public class FenceRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JABCM_Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JABCM_Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Fences
    public static final RegistryObject<Block> WHITE_FENCE = BLOCKS.register("jfence_white", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_FENCE = BLOCKS.register("jfence_orange", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGENTA_FENCE = BLOCKS.register("jfence_magenta", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));


    // Fence Items
    public static final RegistryObject<Item> WHITE_FENCE_ITEM = ITEMS.register("jfence_white", () -> new BlockItem(WHITE_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_FENCE_ITEM = ITEMS.register("jfence_orange", () -> new BlockItem(ORANGE_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_FENCE_ITEM = ITEMS.register("jfence_magenta", () -> new BlockItem(MAGENTA_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));

}
