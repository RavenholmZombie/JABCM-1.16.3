package rz.mod.jabcm.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rz.mod.jabcm.JABCM_Main;
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
    public static final RegistryObject<Block> WHITE_SLAB = BLOCKS.register("concrete_slab_white", () -> new SlabBlock(Block.Properties.from(Blocks.WHITE_CONCRETE.getBlock())));
    public static final RegistryObject<Block> ORANGE_SLAB = BLOCKS.register("concrete_slab_orange", () -> new SlabBlock(Block.Properties.from(Blocks.ORANGE_CONCRETE.getBlock())));
    public static final RegistryObject<Block> MAGENTA_SLAB = BLOCKS.register("concrete_slab_magenta", () -> new SlabBlock(Block.Properties.from(Blocks.MAGENTA_CONCRETE.getBlock())));
    public static final RegistryObject<Block> LBLUE_SLAB = BLOCKS.register("concrete_slab_lblue", () -> new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE.getBlock())));
    public static final RegistryObject<Block> YELLOW_SLAB = BLOCKS.register("concrete_slab_yellow", () -> new SlabBlock(Block.Properties.from(Blocks.YELLOW_CONCRETE.getBlock())));
    public static final RegistryObject<Block> LIME_SLAB = BLOCKS.register("concrete_slab_lime", () -> new SlabBlock(Block.Properties.from(Blocks.LIME_CONCRETE.getBlock())));
    public static final RegistryObject<Block> PINK_SLAB = BLOCKS.register("concrete_slab_pink", () -> new SlabBlock(Block.Properties.from(Blocks.PINK_CONCRETE.getBlock())));
    public static final RegistryObject<Block> GRAY_SLAB = BLOCKS.register("concrete_slab_gray", () -> new SlabBlock(Block.Properties.from(Blocks.GRAY_CONCRETE.getBlock())));

    // Slab Items
    public static final RegistryObject<Item> WHITE_SLAB_ITEM = ITEMS.register("concrete_slab_white", () -> new SlabItemBase(WHITE_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_SLAB_ITEM = ITEMS.register("concrete_slab_orange", () -> new SlabItemBase(ORANGE_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_SLAB_ITEM = ITEMS.register("concrete_slab_magenta", () -> new SlabItemBase(MAGENTA_SLAB.get()));
    public static final RegistryObject<Item> LBLUE_SLAB_ITEM = ITEMS.register("concrete_slab_lblue", () -> new SlabItemBase(LBLUE_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_SLAB_ITEM = ITEMS.register("concrete_slab_yellow", () -> new SlabItemBase(YELLOW_SLAB.get()));
    public static final RegistryObject<Item> LIME_SLAB_ITEM = ITEMS.register("concrete_slab_lime", () -> new SlabItemBase(LIME_SLAB.get()));
    public static final RegistryObject<Item> PINK_SLAB_ITEM = ITEMS.register("concrete_slab_pink", () -> new SlabItemBase(PINK_SLAB.get()));
    public static final RegistryObject<Item> GRAY_SLAB_ITEM = ITEMS.register("concrete_slab_gray", () -> new SlabItemBase(GRAY_SLAB.get()));
}
