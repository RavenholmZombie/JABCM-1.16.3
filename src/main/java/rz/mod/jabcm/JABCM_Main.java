package rz.mod.jabcm;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rz.mod.jabcm.util.RegistryHandler;

@Mod("jabcm")
public class JABCM_Main
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "jabcm";

    public JABCM_Main() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("JABCM 0.0.2-1.16.3 is loading...");
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }
}
