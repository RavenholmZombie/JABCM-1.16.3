package rz.mod.jabcm.util;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rz.mod.jabcm.JABCM_Main;
import rz.mod.jabcm.blocks.RainbowCrete;
import rz.mod.jabcm.blocks.SlabItemBase;
import rz.mod.jabcm.blocks.StairItemBase;

public class SlabRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JABCM_Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JABCM_Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Slabs
    public static final RegistryObject<Block> WHITE_SLAB = BLOCKS.register("concrete_slab_white", () -> new SlabBlock(Block.Properties.from(Blocks.WHITE_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> ORANGE_SLAB = BLOCKS.register("concrete_slab_orange", () -> new SlabBlock(Block.Properties.from(Blocks.ORANGE_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> MAGENTA_SLAB = BLOCKS.register("concrete_slab_magenta", () -> new SlabBlock(Block.Properties.from(Blocks.MAGENTA_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> LBLUE_SLAB = BLOCKS.register("concrete_slab_lblue", () -> new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> YELLOW_SLAB = BLOCKS.register("concrete_slab_yellow", () -> new SlabBlock(Block.Properties.from(Blocks.YELLOW_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> LIME_SLAB = BLOCKS.register("concrete_slab_lime", () -> new SlabBlock(Block.Properties.from(Blocks.LIME_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> PINK_SLAB = BLOCKS.register("concrete_slab_pink", () -> new SlabBlock(Block.Properties.from(Blocks.PINK_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> GRAY_SLAB = BLOCKS.register("concrete_slab_gray", () -> new SlabBlock(Block.Properties.from(Blocks.GRAY_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> SILVER_SLAB = BLOCKS.register("concrete_slab_silver", () -> new SlabBlock(Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> CYAN_SLAB = BLOCKS.register("concrete_slab_cyan", () -> new SlabBlock(Block.Properties.from(Blocks.CYAN_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> PURPLE_SLAB = BLOCKS.register("concrete_slab_purple", () -> new SlabBlock(Block.Properties.from(Blocks.PURPLE_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> BLUE_SLAB = BLOCKS.register("concrete_slab_blue", () -> new SlabBlock(Block.Properties.from(Blocks.BLUE_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> BROWN_SLAB = BLOCKS.register("concrete_slab_brown", () -> new SlabBlock(Block.Properties.from(Blocks.BROWN_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> RED_SLAB = BLOCKS.register("concrete_slab_red", () -> new SlabBlock(Block.Properties.from(Blocks.RED_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> GREEN_SLAB = BLOCKS.register("concrete_slab_green", () -> new SlabBlock(Block.Properties.from(Blocks.GREEN_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> BLACK_SLAB = BLOCKS.register("concrete_slab_black", () -> new SlabBlock(Block.Properties.from(Blocks.BLACK_CONCRETE.getBlock()).hardnessAndResistance(1.8F)));
    public static final RegistryObject<Block> SPECIAL_SLAB = BLOCKS.register("concrete_slab_special", () -> new SlabBlock(Block.Properties.from(RegistryHandler.CONCRETE_SPECIAL.get()).hardnessAndResistance(1.8F)));

    // Slab Items
    public static final RegistryObject<Item> WHITE_SLAB_ITEM = ITEMS.register("concrete_slab_white", () -> new SlabItemBase(WHITE_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_SLAB_ITEM = ITEMS.register("concrete_slab_orange", () -> new SlabItemBase(ORANGE_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_SLAB_ITEM = ITEMS.register("concrete_slab_magenta", () -> new SlabItemBase(MAGENTA_SLAB.get()));
    public static final RegistryObject<Item> LBLUE_SLAB_ITEM = ITEMS.register("concrete_slab_lblue", () -> new SlabItemBase(LBLUE_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_SLAB_ITEM = ITEMS.register("concrete_slab_yellow", () -> new SlabItemBase(YELLOW_SLAB.get()));
    public static final RegistryObject<Item> LIME_SLAB_ITEM = ITEMS.register("concrete_slab_lime", () -> new SlabItemBase(LIME_SLAB.get()));
    public static final RegistryObject<Item> PINK_SLAB_ITEM = ITEMS.register("concrete_slab_pink", () -> new SlabItemBase(PINK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_SLAB_ITEM = ITEMS.register("concrete_slab_gray", () -> new SlabItemBase(GRAY_SLAB.get()));
    public static final RegistryObject<Item> SILVER_SLAB_ITEM = ITEMS.register("concrete_slab_silver", () -> new SlabItemBase(SILVER_SLAB.get()));
    public static final RegistryObject<Item> CYAN_SLAB_ITEM = ITEMS.register("concrete_slab_cyan", () -> new SlabItemBase(CYAN_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_SLAB_ITEM = ITEMS.register("concrete_slab_purple", () -> new SlabItemBase(PURPLE_SLAB.get()));
    public static final RegistryObject<Item> BLUE_SLAB_ITEM = ITEMS.register("concrete_slab_blue", () -> new SlabItemBase(BLUE_SLAB.get()));
    public static final RegistryObject<Item> BROWN_SLAB_ITEM = ITEMS.register("concrete_slab_brown", () -> new SlabItemBase(BROWN_SLAB.get()));
    public static final RegistryObject<Item> GREEN_SLAB_ITEM = ITEMS.register("concrete_slab_green", () -> new SlabItemBase(GREEN_SLAB.get()));
    public static final RegistryObject<Item> RED_SLAB_ITEM = ITEMS.register("concrete_slab_red", () -> new SlabItemBase(RED_SLAB.get()));
    public static final RegistryObject<Item> BLACK_SLAB_ITEM = ITEMS.register("concrete_slab_black", () -> new SlabItemBase(BLACK_SLAB.get()));
    public static final RegistryObject<Item> SPECIAL_SLAB_ITEM = ITEMS.register("concrete_slab_special", () -> new SlabItemBase(SPECIAL_SLAB.get()));
}
