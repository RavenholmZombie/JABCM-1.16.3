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

    // Concrete Walls
    public static final RegistryObject<Block> WALL_WHITE = BLOCKS.register("concrete_wall_white", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WALL_ORANGE = BLOCKS.register("concrete_wall_orange", () -> new JABCMWall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F).sound(SoundType.STONE)));


    // Concrete Wall Items
    public static final RegistryObject<Item> WALL_WHITE_ITEM = ITEMS.register("concrete_wall_white", () -> new BlockItem(WALL_WHITE.get(), new Item.Properties().group(Main.JABCM_BARRIER)));
    public static final RegistryObject<Item> WALL_ORANGE_ITEM = ITEMS.register("concrete_wall_orange", () -> new BlockItem(WALL_ORANGE.get(), new Item.Properties().group(Main.JABCM_BARRIER)));

}
