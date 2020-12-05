package rz.mod.jabcm.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Quotes
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static void QuoteSelect()
    {
        Random chooser = new Random();
        int lines;
        lines = chooser.nextInt(10);
        switch(lines){
            case 1:
                LOGGER.info("Keelah Se'lai!");
                break;
            case 2:
                LOGGER.info("I am the very model of a scientist salarian!");
                break;
            case 3:
                LOGGER.info("Siha");
                break;
            case 4:
                LOGGER.info("Cerberus used to be humanity's sword, not a dagger in its back!");
                break;
            case 5:
                LOGGER.info("I've studied species turian, asari, and batarian...");
                break;
            case 6:
                LOGGER.info("Did you know? JABCM originally started out as a private mod.");
                break;
            case 7:
                LOGGER.info("Subscribe to RavenholmZombie on YouTube!");
                break;
            case 8:
                LOGGER.info("Did you know? JABCM is available for both Minecraft 1.16.3 AND 1.12.2!");
                break;
            case 9:
                LOGGER.info("My xenoscience studies range from urban to agraian, I am the very model of a scientist salarian!");
                break;
            case 10:
                LOGGER.info("Thank you to all of the people who have downloaded JABCM. Your support is greatly appreciated!");
                break;
        }
    }
}
