package rz.mod.jabcm.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rz.mod.jabcm.Main;
import rz.mod.jabcm.blocks.BlockItemBase;
import rz.mod.jabcm.blocks.JABCMBlock;
import rz.mod.jabcm.blocks.RainbowCrete;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Blocks
    public static final RegistryObject<Block> CONCRETE_SPECIAL = BLOCKS.register("concrete_special", RainbowCrete::new);

    // Concrete Bricks
    public static final RegistryObject<Block> BRICKS_SPECIAL = BLOCKS.register("jbrick_special", RainbowCrete::new);
    public static final RegistryObject<Block> BRICKS_WHITE = BLOCKS.register("jbrick_white", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_ORANGE = BLOCKS.register("jbrick_orange", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_MAGENTA = BLOCKS.register("jbrick_magenta", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_LBLUE = BLOCKS.register("jbrick_lblue", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_YELLOW = BLOCKS.register("jbrick_yellow", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_LIME = BLOCKS.register("jbrick_lime", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_PINK = BLOCKS.register("jbrick_pink", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_GRAY = BLOCKS.register("jbrick_gray", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_SILVER = BLOCKS.register("jbrick_silver", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_CYAN = BLOCKS.register("jbrick_cyan", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_PURPLE = BLOCKS.register("jbrick_purple", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_BLUE = BLOCKS.register("jbrick_blue", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_BROWN = BLOCKS.register("jbrick_brown", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_GREEN = BLOCKS.register("jbrick_green", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_RED = BLOCKS.register("jbrick_red", JABCMBlock::new);
    public static final RegistryObject<Block> BRICKS_BLACK = BLOCKS.register("jbrick_black", JABCMBlock::new);


    // Concrete Brick Block Items
    public static final RegistryObject<Item> CONCRETE_SPECIAL_ITEM = ITEMS.register("concrete_special", () -> new BlockItemBase(CONCRETE_SPECIAL.get()));
    public static final RegistryObject<Item> BRICKS_SPECIAL_ITEM = ITEMS.register("jbrick_special", () -> new BlockItemBase(BRICKS_SPECIAL.get()));
    public static final RegistryObject<Item> BRICKS_WHITE_ITEM = ITEMS.register("jbrick_white", () -> new BlockItemBase(BRICKS_WHITE.get()));
    public static final RegistryObject<Item> BRICKS_ORANGE_ITEM = ITEMS.register("jbrick_orange", () -> new BlockItemBase(BRICKS_ORANGE.get()));
    public static final RegistryObject<Item> BRICKS_MAGENTA_ITEM = ITEMS.register("jbrick_magenta", () -> new BlockItemBase(BRICKS_MAGENTA.get()));
    public static final RegistryObject<Item> BRICKS_LBLUE_ITEM = ITEMS.register("jbrick_lblue", () -> new BlockItemBase(BRICKS_LBLUE.get()));
    public static final RegistryObject<Item> BRICKS_YELLOW_ITEM = ITEMS.register("jbrick_yellow", () -> new BlockItemBase(BRICKS_YELLOW.get()));
    public static final RegistryObject<Item> BRICKS_LIME_ITEM = ITEMS.register("jbrick_lime", () -> new BlockItemBase(BRICKS_LIME.get()));
    public static final RegistryObject<Item> BRICKS_PINK_ITEM = ITEMS.register("jbrick_pink", () -> new BlockItemBase(BRICKS_PINK.get()));
    public static final RegistryObject<Item> BRICKS_GRAY_ITEM = ITEMS.register("jbrick_gray", () -> new BlockItemBase(BRICKS_GRAY.get()));
    public static final RegistryObject<Item> BRICKS_SILVER_ITEM = ITEMS.register("jbrick_silver", () -> new BlockItemBase(BRICKS_SILVER.get()));
    public static final RegistryObject<Item> BRICKS_CYAN_ITEM = ITEMS.register("jbrick_cyan", () -> new BlockItemBase(BRICKS_CYAN.get()));
    public static final RegistryObject<Item> BRICKS_PURPLE_ITEM = ITEMS.register("jbrick_purple", () -> new BlockItemBase(BRICKS_PURPLE.get()));
    public static final RegistryObject<Item> BRICKS_BLUE_ITEM = ITEMS.register("jbrick_blue", () -> new BlockItemBase(BRICKS_BLUE.get()));
    public static final RegistryObject<Item> BRICKS_BROWN_ITEM = ITEMS.register("jbrick_brown", () -> new BlockItemBase(BRICKS_BROWN.get()));
    public static final RegistryObject<Item> BRICKS_GREEN_ITEM = ITEMS.register("jbrick_green", () -> new BlockItemBase(BRICKS_GREEN.get()));
    public static final RegistryObject<Item> BRICKS_RED_ITEM = ITEMS.register("jbrick_red", () -> new BlockItemBase(BRICKS_RED.get()));
    public static final RegistryObject<Item> BRICKS_BLACK_ITEM = ITEMS.register("jbrick_black", () -> new BlockItemBase(BRICKS_BLACK.get()));
}
