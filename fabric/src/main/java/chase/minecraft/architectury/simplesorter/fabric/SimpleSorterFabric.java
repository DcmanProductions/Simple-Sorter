package chase.minecraft.architectury.simplesorter.fabric;

import chase.minecraft.architectury.simplesorter.SimpleSorter;
import net.fabricmc.api.ModInitializer;

public class SimpleSorterFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SimpleSorter.init();
    }
}