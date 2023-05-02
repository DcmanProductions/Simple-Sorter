package chase.minecraft.architectury.simplesorter;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class InventorySortModule
{
	public static void clientHandleSortCheck(){
		if(Minecraft.getInstance().screen instanceof InventoryScreen screen)
		{
		}
	}
	public static void sort(ServerPlayer player)
	{
		Inventory inventory = player.getInventory();
		List<ItemStack> sortedItemStack = new ArrayList<>();
		for (int i = 0; i < inventory.items.size() - 9; i++)
		{
			sortedItemStack.add(inventory.getItem(i));
		}
		sortedItemStack.sort((a, b) -> String.CASE_INSENSITIVE_ORDER.compare(a.getDisplayName().getString(), b.getDisplayName().getString()));
		
		for (int i = 0; i < inventory.items.size() - 9; i++)
		{
			inventory.setItem(i, sortedItemStack.get(i));
		}
	}
}
