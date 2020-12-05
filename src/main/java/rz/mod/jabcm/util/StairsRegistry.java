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
