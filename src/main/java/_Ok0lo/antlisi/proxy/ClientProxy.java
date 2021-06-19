package _Ok0lo.antlisi.proxy;

import _Ok0lo.antlisi.event.KeybindEventHandler;
import _Ok0lo.antlisi.gui.GuiUpgrade;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.management.PlayerList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		
		registerGui();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
	//----> Util <---
	@Override
	public EntityPlayer getPlayer() {
		return FMLClientHandler.instance().getClient().player;
	}
	
	@Override
	public EntityPlayer getPlayer(EntityPlayer player) {
		PlayerList allPlayer = FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList();
		return allPlayer.getPlayerByUsername(getPlayer().getName());
	}
	
	@Override
	public void displayGuiForPlayer(EntityPlayer player) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiUpgrade());
	}
	
	@Override
	public void registerGui() {
		MinecraftForge.EVENT_BUS.register(KeybindEventHandler.instance);
	}
}
