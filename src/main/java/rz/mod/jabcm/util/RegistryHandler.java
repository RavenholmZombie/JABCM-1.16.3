package rz.mod.jabcm.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rz.mod.jabcm.JABCM_Main;
import rz.mod.jabcm.blocks.BlockItemBase;
import rz.mod.jabcm.blocks.JABCMBlock;
import rz.mod.jabcm.blocks.RainbowCrete;
import rz.mod.jabcm.items.ItemBase;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JABCM_Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JABCM_Main.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Blocks
    public static final RegistryObject<Block> CONCRETE_SPECIAL = BLOCKS.register("concrete_special", RainbowCrete::new);

    // Concrete Bricks
    public static final RegistryObject<Block> BRICKS_SPECIAL = BLOCKS.register("jbrick_special", JABCMBlock::new);

    // Block Items
    public static final RegistryObject<Item> CONCRETE_SPECIAL_ITEM = ITEMS.register("concrete_special", () -> new BlockItemBase(CONCRETE_SPECIAL.get()));
    public static final RegistryObject<Item> BRICKS_SPECIAL_ITEM = ITEMS.register("jbrick_special", () -> new BlockItemBase(BRICKS_SPECIAL.get()));

}
