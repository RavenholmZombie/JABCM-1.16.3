package rz.mod.jabcm.util;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rz.mod.jabcm.Main;
import rz.mod.jabcm.blocks.JABCMWall;

public class WallRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //TODO: Do the blockstate, models, and data

    // Concrete Walls
    public static final RegistryObject<Block> WALL_WHITE = BLOCKS.register("concrete_wall_white", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_ORANGE = BLOCKS.register("concrete_wall_orange", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_MAGENTA = BLOCKS.register("concrete_wall_magenta", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_LBLUE = BLOCKS.register("concrete_wall_lblue", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_YELLOW = BLOCKS.register("concrete_wall_yellow", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_LIME = BLOCKS.register("concrete_wall_lime", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_PINK = BLOCKS.register("concrete_wall_pink", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_GRAY = BLOCKS.register("concrete_wall_gray", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_SILVER = BLOCKS.register("concrete_wall_silver", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_CYAN = BLOCKS.register("concrete_wall_cyan", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_PURPLE = BLOCKS.register("concrete_wall_purple", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_BLUE = BLOCKS.register("concrete_wall_blue", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_BROWN = BLOCKS.register("concrete_wall_brown", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_GREEN = BLOCKS.register("concrete_wall_green", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_RED = BLOCKS.register("concrete_wall_red", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_BLACK = BLOCKS.register("concrete_wall_black", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_SPECIAL = BLOCKS.register("concrete_wall_special", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));


    // Concrete Wall Items
    public static final RegistryObject<Item> WALL_WHITE_ITEM = ITEMS.register("concrete_wall_white", () -> new BlockItem(WALL_WHITE.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_ORANGE_ITEM = ITEMS.register("concrete_wall_orange", () -> new BlockItem(WALL_ORANGE.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_MAGENTA_ITEM = ITEMS.register("concrete_wall_magenta", () -> new BlockItem(WALL_MAGENTA.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_LBLUE_ITEM = ITEMS.register("concrete_wall_lblue", () -> new BlockItem(WALL_LBLUE.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_YELLOW_ITEM = ITEMS.register("concrete_wall_yellow", () -> new BlockItem(WALL_YELLOW.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_LIME_ITEM = ITEMS.register("concrete_wall_lime", () -> new BlockItem(WALL_LIME.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_PINK_ITEM = ITEMS.register("concrete_wall_pink", () -> new BlockItem(WALL_PINK.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_GRAY_ITEM = ITEMS.register("concrete_wall_gray", () -> new BlockItem(WALL_GRAY.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_SILVER_ITEM = ITEMS.register("concrete_wall_silver", () -> new BlockItem(WALL_SILVER.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_CYAN_ITEM = ITEMS.register("concrete_wall_cyan", () -> new BlockItem(WALL_CYAN.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_PURPLE_ITEM = ITEMS.register("concrete_wall_purple", () -> new BlockItem(WALL_PURPLE.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_BLUE_ITEM = ITEMS.register("concrete_wall_blue", () -> new BlockItem(WALL_BLUE.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_BROWN_ITEM = ITEMS.register("concrete_wall_brown", () -> new BlockItem(WALL_BROWN.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_GREEN_ITEM = ITEMS.register("concrete_wall_green", () -> new BlockItem(WALL_GREEN.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_RED_ITEM = ITEMS.register("concrete_wall_red", () -> new BlockItem(WALL_RED.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_BLACK_ITEM = ITEMS.register("concrete_wall_black", () -> new BlockItem(WALL_BLACK.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_SPECIAL_ITEM = ITEMS.register("concrete_wall_special", () -> new BlockItem(WALL_SPECIAL.get(), new Item.Properties().group(Main.JABCM_BARRIER)));

}
