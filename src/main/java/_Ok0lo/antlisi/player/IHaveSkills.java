package _Ok0lo.antlisi.player;

import net.minecraft.nbt.NBTTagCompound;

public interface IHaveSkills {

	NBTTagCompound saveNBTData(NBTTagCompound tag);
	
	void loadNBTTagCompound(NBTTagCompound tag);
	
	
}
