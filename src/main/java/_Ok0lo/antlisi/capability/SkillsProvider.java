package _Ok0lo.antlisi.capability;

import _Ok0lo.antlisi.player.IPlayerExtension;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class SkillsProvider implements ICapabilitySerializable<NBTBase> {
	
	@CapabilityInject(IPlayerExtension.class)
	public static final Capability<IPlayerExtension> PLAYER_EXTENSION = null;
	
	private IPlayerExtension instance = PLAYER_EXTENSION.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == PLAYER_EXTENSION;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == PLAYER_EXTENSION ? PLAYER_EXTENSION.<T> cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return PLAYER_EXTENSION.getStorage().writeNBT(PLAYER_EXTENSION, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		PLAYER_EXTENSION.getStorage().readNBT(PLAYER_EXTENSION, this.instance, null, nbt);
	}
}
