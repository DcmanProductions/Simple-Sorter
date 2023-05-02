package chase.minecraft.architectury.simplesorter.forge;

import dev.architectury.platform.forge.EventBuses;
import chase.minecraft.architectury.simplesorter.SimpleSorter;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SimpleSorter.MOD_ID)
public class SimpleSorterForge {
    public SimpleSorterForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SimpleSorter.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            SimpleSorter.init();
    }
}