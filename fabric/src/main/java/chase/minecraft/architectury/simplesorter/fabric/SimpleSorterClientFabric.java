package chase.minecraft.architectury.simplesorter.fabric;

import chase.minecraft.architectury.simplesorter.client.SimpleSorterClient;
import net.fabricmc.api.ClientModInitializer;

public class SimpleSorterClientFabric extends SimpleSorterClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		init();
	}
}
