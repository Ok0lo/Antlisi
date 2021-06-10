package _Ok0lo.antlisi.proxy;

import _Ok0lo.antlisi.gui.GuiUpgradeSkills;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.client.FMLClientHandler;
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
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
	//---> Custom <--------
	@Override
	public void displayGuiForPlayer(EntityPlayer player) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiUpgradeSkills());
	}
	
	@Override
	public EntityPlayer getPlayer() {
		return FMLClientHandler.instance().getClient().player;
	}
}
