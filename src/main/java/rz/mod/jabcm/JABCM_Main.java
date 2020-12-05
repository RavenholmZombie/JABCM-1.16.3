package rz.mod.jabcm;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rz.mod.jabcm.util.*;

@Mod("jabcm")
public class JABCM_Main
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "jabcm";

    public JABCM_Main()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Calls the init() for all JABCM block classes.
        StairsRegistry.init();
        RegistryHandler.init();
        SlabRegistry.init();
        FenceRegistry.init();
        PressurePlateRegistry.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("JABCM 0.0.4-1.16.3 is loading...");
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }

    // Creative Tabs for JABCM
    public static final ItemGroup JABCM_BLOCKS = new ItemGroup("jabcm_blocks")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(StairsRegistry.SPECIAL_STAIRS.get());
        }
    };

    public static final ItemGroup JABCM_BARRIER = new ItemGroup("jabcm_wall")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(FenceRegistry.SPECIAL_FENCE.get());
        }
    };

    public static final ItemGroup JABCM_REDSTONE = new ItemGroup("jabcm_redstone")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(PressurePlateRegistry.SPECIAL_JPLATE.get());
        }
    };
}
