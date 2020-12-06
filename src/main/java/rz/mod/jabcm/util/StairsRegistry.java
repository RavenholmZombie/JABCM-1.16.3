package rz.mod.jabcm.util;

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
import rz.mod.jabcm.Main;
import rz.mod.jabcm.blocks.StairItemBase;

public class StairsRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Stair Blocks
    public static final RegistryObject<Block> WHITE_STAIRS = BLOCKS.register("concrete_stairs_white", () -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> ORANGE_STAIRS = BLOCKS.register("concrete_stairs_orange", () -> new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> MAGENTA_STAIRS = BLOCKS.register("concrete_stairs_magenta", () -> new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> LBLUE_STAIRS = BLOCKS.register("concrete_stairs_lblue", () -> new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> YELLOW_STAIRS = BLOCKS.register("concrete_stairs_yellow", () -> new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> LIME_STAIRS = BLOCKS.register("concrete_stairs_lime", () -> new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> PINK_STAIRS = BLOCKS.register("concrete_stairs_pink", () -> new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.PINK).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> GRAY_STAIRS = BLOCKS.register("concrete_stairs_gray", () -> new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> SILVER_STAIRS = BLOCKS.register("concrete_stairs_silver", () -> new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> CYAN_STAIRS = BLOCKS.register("concrete_stairs_cyan", () -> new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> PURPLE_STAIRS = BLOCKS.register("concrete_stairs_purple", () -> new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> BLUE_STAIRS = BLOCKS.register("concrete_stairs_blue", () -> new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> BROWN_STAIRS = BLOCKS.register("concrete_stairs_brown", () -> new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> GREEN_STAIRS = BLOCKS.register("concrete_stairs_green", () -> new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> RED_STAIRS = BLOCKS.register("concrete_stairs_red", () -> new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> BLACK_STAIRS = BLOCKS.register("concrete_stairs_black", () -> new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> SPECIAL_STAIRS = BLOCKS.register("concrete_stairs_special", () -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(1.8F)));

    //Concrete Brick Stairs
    public static final RegistryObject<Block> JBRICK_WHITE_STAIRS = BLOCKS.register("jbrick_stairs_white", () -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_ORANGE_STAIRS = BLOCKS.register("jbrick_stairs_orange", () -> new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_MAGENTA_STAIRS = BLOCKS.register("jbrick_stairs_magenta", () -> new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_LBLUE_STAIRS = BLOCKS.register("jbrick_stairs_lblue", () -> new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_YELLOW_STAIRS = BLOCKS.register("jbrick_stairs_yellow", () -> new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_LIME_STAIRS = BLOCKS.register("jbrick_stairs_lime", () -> new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_PINK_STAIRS = BLOCKS.register("jbrick_stairs_pink", () -> new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.PINK).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_GRAY_STAIRS = BLOCKS.register("jbrick_stairs_gray", () -> new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_SILVER_STAIRS = BLOCKS.register("jbrick_stairs_silver", () -> new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_CYAN_STAIRS = BLOCKS.register("jbrick_stairs_cyan", () -> new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_PURPLE_STAIRS = BLOCKS.register("jbrick_stairs_purple", () -> new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_BLUE_STAIRS = BLOCKS.register("jbrick_stairs_blue", () -> new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_BROWN_STAIRS = BLOCKS.register("jbrick_stairs_brown", () -> new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_GREEN_STAIRS = BLOCKS.register("jbrick_stairs_green", () -> new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_RED_STAIRS = BLOCKS.register("jbrick_stairs_red", () -> new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_BLACK_STAIRS = BLOCKS.register("jbrick_stairs_black", () -> new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> JBRICK_SPECIAL_STAIRS = BLOCKS.register("jbrick_stairs_special", () -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(1.8F)));

    // Concrete Brick Stair Items
    public static final RegistryObject<Item> JBRICK_WHITE_STAIRS_ITEM = ITEMS.register("jbrick_stairs_white", () -> new StairItemBase(JBRICK_WHITE_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_ORANGE_STAIRS_ITEM = ITEMS.register("jbrick_stairs_orange", () -> new StairItemBase(JBRICK_ORANGE_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_MAGENTA_STAIRS_ITEM = ITEMS.register("jbrick_stairs_magenta", () -> new StairItemBase(JBRICK_MAGENTA_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_LBLUE_STAIRS_ITEM = ITEMS.register("jbrick_stairs_lblue", () -> new StairItemBase(JBRICK_LBLUE_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_YELLOW_STAIRS_ITEM = ITEMS.register("jbrick_stairs_yellow", () -> new StairItemBase(JBRICK_YELLOW_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_LIME_STAIRS_ITEM = ITEMS.register("jbrick_stairs_lime", () -> new StairItemBase(JBRICK_LIME_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_PINK_STAIRS_ITEM = ITEMS.register("jbrick_stairs_pink", () -> new StairItemBase(JBRICK_PINK_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_GRAY_STAIRS_ITEM = ITEMS.register("jbrick_stairs_gray", () -> new StairItemBase(JBRICK_GRAY_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_SILVER_STAIRS_ITEM = ITEMS.register("jbrick_stairs_silver", () -> new StairItemBase(JBRICK_SILVER_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_CYAN_STAIRS_ITEM = ITEMS.register("jbrick_stairs_cyan", () -> new StairItemBase(JBRICK_CYAN_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_PURPLE_STAIRS_ITEM = ITEMS.register("jbrick_stairs_purple", () -> new StairItemBase(JBRICK_PURPLE_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_BLUE_STAIRS_ITEM = ITEMS.register("jbrick_stairs_blue", () -> new StairItemBase(JBRICK_BLUE_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_BROWN_STAIRS_ITEM = ITEMS.register("jbrick_stairs_brown", () -> new StairItemBase(JBRICK_BROWN_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_GREEN_STAIRS_ITEM = ITEMS.register("jbrick_stairs_green", () -> new StairItemBase(JBRICK_GREEN_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_RED_STAIRS_ITEM = ITEMS.register("jbrick_stairs_red", () -> new StairItemBase(JBRICK_RED_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_BLACK_STAIRS_ITEM = ITEMS.register("jbrick_stairs_black", () -> new StairItemBase(JBRICK_BLACK_STAIRS.get()));
    public static final RegistryObject<Item> JBRICK_SPECIAL_STAIRS_ITEM = ITEMS.register("jbrick_stairs_special", () -> new StairItemBase(JBRICK_SPECIAL_STAIRS.get()));

    // Stair Block Items
    public static final RegistryObject<Item> WHITE_STAIRS_ITEM = ITEMS.register("concrete_stairs_white", () -> new StairItemBase(WHITE_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_STAIRS_ITEM = ITEMS.register("concrete_stairs_orange", () -> new StairItemBase(ORANGE_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_STAIRS_ITEM = ITEMS.register("concrete_stairs_magenta", () -> new StairItemBase(MAGENTA_STAIRS.get()));
    public static final RegistryObject<Item> LBLUE_STAIRS_ITEM = ITEMS.register("concrete_stairs_lblue", () -> new StairItemBase(LBLUE_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_STAIRS_ITEM = ITEMS.register("concrete_stairs_yellow", () -> new StairItemBase(YELLOW_STAIRS.get()));
    public static final RegistryObject<Item> LIME_STAIRS_ITEM = ITEMS.register("concrete_stairs_lime", () -> new StairItemBase(LIME_STAIRS.get()));
    public static final RegistryObject<Item> PINK_STAIRS_ITEM = ITEMS.register("concrete_stairs_pink", () -> new StairItemBase(PINK_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_STAIRS_ITEM = ITEMS.register("concrete_stairs_gray", () -> new StairItemBase(GRAY_STAIRS.get()));
    public static final RegistryObject<Item> SILVER_STAIRS_ITEM = ITEMS.register("concrete_stairs_silver", () -> new StairItemBase(SILVER_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_STAIRS_ITEM = ITEMS.register("concrete_stairs_cyan", () -> new StairItemBase(CYAN_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_STAIRS_ITEM = ITEMS.register("concrete_stairs_purple", () -> new StairItemBase(PURPLE_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_STAIRS_ITEM = ITEMS.register("concrete_stairs_blue", () -> new StairItemBase(BLUE_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_STAIRS_ITEM = ITEMS.register("concrete_stairs_brown", () -> new StairItemBase(BROWN_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_STAIRS_ITEM = ITEMS.register("concrete_stairs_green", () -> new StairItemBase(GREEN_STAIRS.get()));
    public static final RegistryObject<Item> RED_STAIRS_ITEM = ITEMS.register("concrete_stairs_red", () -> new StairItemBase(RED_STAIRS.get()));
    public static final RegistryObject<Item> BLACK_STAIRS_ITEM = ITEMS.register("concrete_stairs_black", () -> new StairItemBase(BLACK_STAIRS.get()));
    public static final RegistryObject<Item> SPECIAL_STAIRS_ITEM = ITEMS.register("concrete_stairs_special", () -> new StairItemBase(SPECIAL_STAIRS.get()));
}
