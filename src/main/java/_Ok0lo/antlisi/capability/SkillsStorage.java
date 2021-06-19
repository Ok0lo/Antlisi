package _Ok0lo.antlisi.capability;

import _Ok0lo.antlisi.player.IPlayerExtension;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class SkillsStorage implements IStorage<IPlayerExtension> {
	
	@Override
	public NBTBase writeNBT(Capability<IPlayerExtension> capability, IPlayerExtension instance, EnumFacing side) {
		NBTTagCompound tag = new NBTTagCompound();
		
		for(int i = 0; instance.getSkills().size() > i; i++) {
			tag.setString("SkillName_" + instance.getSkills().get(i).getSkillName(), instance.getSkills().get(i).getSkillName());
			tag.setBoolean("isActive_" + instance.getSkills().get(i).getSkillName(), instance.getSkills().get(i).isActive());
			tag.setInteger("SkillLevel_" + instance.getSkills().get(i).getSkillName(), instance.getSkills().get(i).getSkillLevel());
			tag.setInteger("MaxSkillLevel_" + instance.getSkills().get(i).getSkillName(), instance.getSkills().get(i).getMaxLevel());
		}
		
		return tag;
	}

	@Override
	public void readNBT(Capability<IPlayerExtension> capability, IPlayerExtension instance, EnumFacing side, NBTBase nbt) {
		NBTTagCompound tag = (NBTTagCompound)nbt;
		
		for(int i = 0; instance.getSkills().size() > i; i++) {
			if(tag.hasKey("MaxSkillLevel_" + instance.getSkills().get(i).getSkillName())) {
				instance.getSkills().get(i).setMaxLevel(tag.getInteger("MaxSkillLevel_" + instance.getSkills().get(i).getSkillName()));
			}
			if(tag.hasKey("SkillLevel_" + instance.getSkills().get(i).getSkillName())) {
				instance.getSkills().get(i).setSkillLevel(tag.getInteger("SkillLevel_" + instance.getSkills().get(i).getSkillName()));
			}
			if(tag.hasKey("isActive_" + instance.getSkills().get(i).getSkillName())) {
				instance.getSkills().get(i).setActive(tag.getBoolean("isActive_" + instance.getSkills().get(i).getSkillName()));
			}
			if(tag.hasKey("SkillName_" + instance.getSkills().get(i).getSkillName())) {
				instance.getSkills().get(i).setSkillName(tag.getString("SkillName" + instance.getSkills().get(i).getSkillName()));
			}
		}
	}
}
