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
    public static final RegistryObject<Block> ORANGE_JPLATE = BLOCKS.register("jplate_orange", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGENTA_JPLATE = BLOCKS.register("jplate_magenta", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LBLUE_JPLATE = BLOCKS.register("jplate_lblue", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_JPLATE = BLOCKS.register("jplate_yellow", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIME_JPLATE = BLOCKS.register("jplate_lime", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_JPLATE = BLOCKS.register("jplate_pink", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.PINK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAY_JPLATE = BLOCKS.register("jplate_gray", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_JPLATE = BLOCKS.register("jplate_silver", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CYAN_JPLATE = BLOCKS.register("jplate_cyan", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_JPLATE = BLOCKS.register("jplate_purple", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_JPLATE = BLOCKS.register("jplate_blue", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BROWN_JPLATE = BLOCKS.register("jplate_brown", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_JPLATE = BLOCKS.register("jplate_green", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_JPLATE = BLOCKS.register("jplate_red", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACK_JPLATE = BLOCKS.register("jplate_black", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SPECIAL_JPLATE = BLOCKS.register("jplate_special", () -> new JABCMPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));


    // Block Items
    public static final RegistryObject<Item> WHITE_JPLATE_ITEM = ITEMS.register("jplate_white", () -> new PlateItemBase(WHITE_JPLATE.get()));
    public static final RegistryObject<Item> ORANGE_JPLATE_ITEM = ITEMS.register("jplate_orange", () -> new PlateItemBase(ORANGE_JPLATE.get()));
    public static final RegistryObject<Item> MAGENTA_JPLATE_ITEM = ITEMS.register("jplate_magenta", () -> new PlateItemBase(MAGENTA_JPLATE.get()));
    public static final RegistryObject<Item> LBLUE_JPLATE_ITEM = ITEMS.register("jplate_lblue", () -> new PlateItemBase(LBLUE_JPLATE.get()));
    public static final RegistryObject<Item> YELLOW_JPLATE_ITEM = ITEMS.register("jplate_yellow", () -> new PlateItemBase(YELLOW_JPLATE.get()));
    public static final RegistryObject<Item> LIME_JPLATE_ITEM = ITEMS.register("jplate_lime", () -> new PlateItemBase(LIME_JPLATE.get()));
    public static final RegistryObject<Item> PINK_JPLATE_ITEM = ITEMS.register("jplate_pink", () -> new PlateItemBase(PINK_JPLATE.get()));
    public static final RegistryObject<Item> GRAY_JPLATE_ITEM = ITEMS.register("jplate_gray", () -> new PlateItemBase(GRAY_JPLATE.get()));
    public static final RegistryObject<Item> SILVER_JPLATE_ITEM = ITEMS.register("jplate_silver", () -> new PlateItemBase(SILVER_JPLATE.get()));
    public static final RegistryObject<Item> CYAN_JPLATE_ITEM = ITEMS.register("jplate_cyan", () -> new PlateItemBase(CYAN_JPLATE.get()));
    public static final RegistryObject<Item> PURPLE_JPLATE_ITEM = ITEMS.register("jplate_purple", () -> new PlateItemBase(PURPLE_JPLATE.get()));
    public static final RegistryObject<Item> BLUE_JPLATE_ITEM = ITEMS.register("jplate_blue", () -> new PlateItemBase(BLUE_JPLATE.get()));
    public static final RegistryObject<Item> BROWN_JPLATE_ITEM = ITEMS.register("jplate_brown", () -> new PlateItemBase(BROWN_JPLATE.get()));
    public static final RegistryObject<Item> GREEN_JPLATE_ITEM = ITEMS.register("jplate_green", () -> new PlateItemBase(GREEN_JPLATE.get()));
    public static final RegistryObject<Item> RED_JPLATE_ITEM = ITEMS.register("jplate_red", () -> new PlateItemBase(RED_JPLATE.get()));
    public static final RegistryObject<Item> BLACK_JPLATE_ITEM = ITEMS.register("jplate_black", () -> new PlateItemBase(BLACK_JPLATE.get()));
    public static final RegistryObject<Item> SPECIAL_JPLATE_ITEM = ITEMS.register("jplate_special", () -> new PlateItemBase(SPECIAL_JPLATE.get()));


}
