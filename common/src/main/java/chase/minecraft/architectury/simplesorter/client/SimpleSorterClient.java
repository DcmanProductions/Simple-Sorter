package chase.minecraft.architectury.simplesorter.client;

import com.mojang.blaze3d.platform.InputConstants;
import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.KeyMapping;

public class SimpleSorterClient
{
	public static final KeyMapping SORT_KEY = new KeyMapping("key.simple-sorter.sort", InputConstants.MOUSE_BUTTON_MIDDLE, "key.categories.inventory");
	
	public static void init()
	{
		KeyMappingRegistry.register(SORT_KEY);
		ClientTickEvent.CLIENT_POST.register(client ->
		{
			if (SORT_KEY.consumeClick())
			{
				
				KeyMapping.setAll();
			}
		});
	}
	
}
