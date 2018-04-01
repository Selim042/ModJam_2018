package selim.modjam.packs;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.items.IItemHandlerModifiable;

public interface IBackpackHandler
		extends IItemHandlerModifiable, ICapabilitySerializable<NBTTagCompound> {

	void setUpgradeStackInSlot(int slot, @Nonnull ItemStack stack);

	int getUpgradeSlots();

	@Nonnull
	ItemStack getUpgradeStackInSlot(int slot);

	@Nonnull
	ItemStack insertUpgradeItem(int slot, @Nonnull ItemStack stack, boolean simulate);

	@Nonnull
	ItemStack extractUpgradeItem(int slot, int amount, boolean simulate);

	int getUpgradeSlotLimit(int slot);

}
