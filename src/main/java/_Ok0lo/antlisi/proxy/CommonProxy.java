package _Ok0lo.antlisi.proxy;

import _Ok0lo.antlisi.capability.CapabilityHandler;
import _Ok0lo.antlisi.capability.SkillsStorage;
import _Ok0lo.antlisi.player.IPlayerExtension;
import _Ok0lo.antlisi.player.PlayerExtension;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		CapabilityManager.INSTANCE.register(IPlayerExtension.class, new SkillsStorage(), PlayerExtension.class);
		MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
		//MinecraftForge.EVENT_BUS.register(new EventHandler());
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	//----> Util <---
	public EntityPlayer getPlayer() {
		return null;
	}
	
	public EntityPlayer getPlayer(EntityPlayer player) {
		return null;
	}
	
	public void displayGuiForPlayer(EntityPlayer player) {}
	
	public void registerGui() {}
}
