package _Ok0lo.antlisi.event;

import org.lwjgl.input.Keyboard;

import _Ok0lo.antlisi.Antlisi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeybindEventHandler {

	public static final KeybindEventHandler instance = new KeybindEventHandler();
	private final KeyBinding upgradePane = new KeyBinding("Upgrade Pane", Keyboard.KEY_B, "key.categories.gui");
	
	private KeybindEventHandler() {
		ClientRegistry.registerKeyBinding(upgradePane);
	}
	
	@SubscribeEvent
	public void openGui(InputEvent.KeyInputEvent event) {
		if(upgradePane.isKeyDown() && Minecraft.getMinecraft().currentScreen == null) {
			Antlisi.proxy.displayGuiForPlayer(Antlisi.proxy.getPlayer());
		}
	}
}
