package rz.mod.jabcm;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class JABCMConfig {

    public static class Common {
        public final ForgeConfigSpec.BooleanValue rainbowConcreteEffects;
        public final ForgeConfigSpec.BooleanValue showQuotes;

        public Common(ForgeConfigSpec.Builder builder) {
            rainbowConcreteEffects = builder
                    .comment("If false, all Rainbow Concrete blocks will be purely decorative and give no potion effects to players or mobs.")
                    .define("rainbowConcreteEffects", true);
            showQuotes = builder
                    .comment("Show a random quote during startup?")
                    .define("showQuotes", true);
        }
    }

    static final ForgeConfigSpec commonSpec;
    public static final Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonSpec = specPair.getRight();
        COMMON = specPair.getLeft();
    }

}