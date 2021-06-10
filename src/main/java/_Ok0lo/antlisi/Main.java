package _Ok0lo.antlisi;

import _Ok0lo.antlisi.proxy.CommonProxy;
import _Ok0lo.antlisi.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, useMetadata = true)
public class Main {
	
	@Mod.Instance(Reference.MODID)
	public static Main instance;

	@SidedProxy(clientSide = "_Ok0lo.antlisi.proxy.ClientProxy", serverSide = "_Ok0lo.atlisi.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
