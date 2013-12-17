package clashsoft.cslib.minecraft.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;

public class SlotInfo extends Slot2
{
	public SlotInfo(IInventory inventory, int slotID, int x, int y)
	{
		super(inventory, slotID, x, y);
	}
	
	@Override
	public boolean canTakeStack(EntityPlayer player)
	{
		return false;
	}
}
