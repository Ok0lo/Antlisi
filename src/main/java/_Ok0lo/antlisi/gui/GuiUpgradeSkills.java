package _Ok0lo.antlisi.gui;

import _Ok0lo.antlisi.Main;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.SharedMonsterAttributes;

public class GuiUpgradeSkills extends GuiScreen {
	
	private int imageWidth = 256;
	
	public GuiUpgradeSkills() {
	}
	
	@Override
	public void initGui( ) {
		this.buttonList.clear();
		this.buttonList.add(new GuiButton(0, (width - imageWidth) / 2 + 27, this.height / 2, "Add heart"));
	}
	
	@Override
	protected void actionPerformed(GuiButton button) {
		if (button.id == 0) {
			Main.proxy.getPlayer().getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
		}
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}
