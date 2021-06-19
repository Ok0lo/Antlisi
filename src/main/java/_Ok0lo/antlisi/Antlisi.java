package _Ok0lo.antlisi;

import _Ok0lo.antlisi.proxy.CommonProxy;
import _Ok0lo.antlisi.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modid, useMetadata = true)
public class Antlisi {

	@Mod.Instance(Reference.modid)
	public static Antlisi instance;
	
	@SidedProxy(clientSide = "_Ok0lo.antlisi.proxy.ClientProxy", serverSide = "_Ok0lo.antlisi.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
