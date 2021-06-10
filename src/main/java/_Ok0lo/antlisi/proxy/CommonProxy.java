package _Ok0lo.antlisi.proxy;

import _Ok0lo.antlisi.event.KeybindEventHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(KeybindEventHandler.instance);
	}
	
	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	//---> Custom <--------
	public void displayGuiForPlayer(EntityPlayer player) {
	}
	
	public EntityPlayer getPlayer() {
		return null;
	}
}
