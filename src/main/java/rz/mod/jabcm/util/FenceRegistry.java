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
    public static final RegistryObject<Block> LBLUE_FENCE = BLOCKS.register("jfence_lblue", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_FENCE = BLOCKS.register("jfence_yellow", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIME_FENCE = BLOCKS.register("jfence_lime", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_FENCE = BLOCKS.register("jfence_pink", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAY_FENCE = BLOCKS.register("jfence_gray", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_FENCE = BLOCKS.register("jfence_silver", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CYAN_FENCE = BLOCKS.register("jfence_cyan", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_FENCE = BLOCKS.register("jfence_purple", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_FENCE = BLOCKS.register("jfence_blue", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BROWN_FENCE = BLOCKS.register("jfence_brown", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_FENCE = BLOCKS.register("jfence_green", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_FENCE = BLOCKS.register("jfence_red", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACK_FENCE = BLOCKS.register("jfence_black", () -> new JABCMFence(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));


    // Fence Items
    public static final RegistryObject<Item> WHITE_FENCE_ITEM = ITEMS.register("jfence_white", () -> new BlockItem(WHITE_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> ORANGE_FENCE_ITEM = ITEMS.register("jfence_orange", () -> new BlockItem(ORANGE_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_FENCE_ITEM = ITEMS.register("jfence_magenta", () -> new BlockItem(MAGENTA_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> LBLUE_FENCE_ITEM = ITEMS.register("jfence_lblue", () -> new BlockItem(LBLUE_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> YELLOW_FENCE_ITEM = ITEMS.register("jfence_yellow", () -> new BlockItem(YELLOW_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> LIME_FENCE_ITEM = ITEMS.register("jfence_lime", () -> new BlockItem(LIME_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> PINK_FENCE_ITEM = ITEMS.register("jfence_pink", () -> new BlockItem(PINK_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> GRAY_FENCE_ITEM = ITEMS.register("jfence_gray", () -> new BlockItem(GRAY_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> SILVER_FENCE_ITEM = ITEMS.register("jfence_silver", () -> new BlockItem(SILVER_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> CYAN_FENCE_ITEM = ITEMS.register("jfence_cyan", () -> new BlockItem(CYAN_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> PURPLE_FENCE_ITEM = ITEMS.register("jfence_purple", () -> new BlockItem(PURPLE_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> BLUE_FENCE_ITEM = ITEMS.register("jfence_blue", () -> new BlockItem(BLUE_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> BROWN_FENCE_ITEM = ITEMS.register("jfence_brown", () -> new BlockItem(BROWN_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> GREEN_FENCE_ITEM = ITEMS.register("jfence_green", () -> new BlockItem(GREEN_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> RED_FENCE_ITEM = ITEMS.register("jfence_red", () -> new BlockItem(RED_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));
    public static final RegistryObject<Item> BLACK_FENCE_ITEM = ITEMS.register("jfence_black", () -> new BlockItem(BLACK_FENCE.get(), new Item.Properties().group(JABCM_Main.JABCM_BLOCKS)));

}
