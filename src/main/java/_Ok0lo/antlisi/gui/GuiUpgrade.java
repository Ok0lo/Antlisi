package _Ok0lo.antlisi.gui;

import _Ok0lo.antlisi.Antlisi;
import _Ok0lo.antlisi.capability.SkillsProvider;
import _Ok0lo.antlisi.skills.IPlayerSkill;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

public class GuiUpgrade extends GuiScreen {
	
	@Override
	public void initGui() {
		this.buttonList.clear();
		this.buttonList.add(new GuiButton(0, this.width / 2 - 170, this.height / 2 - 100, 100, 20, "Upgrade Health"));  //HealthSkill
		this.buttonList.add(new GuiButton(1, this.width / 2 - 170, this.height / 2 - 70, 100, 20, "Fuck Health"));
		this.buttonList.add(new GuiButton(2, this.width / 2 + 70, this.height / 2 - 100, 100, 20, "Upgrade Health"));  //SpeedSkill
		this.buttonList.add(new GuiButton(3, this.width / 2 + 70, this.height / 2 - 70, 100, 20, "Fuck Health"));
	}
	
	@Override
	public void actionPerformed(GuiButton button) {
		EntityPlayer player = Antlisi.proxy.getPlayer(Antlisi.proxy.getPlayer());
		
		if(button.id == 0) {  //HealthSkill
			IPlayerSkill healthSkill = player.getCapability(SkillsProvider.PLAYER_EXTENSION, null).getSkillbyName("Health");
			
			if(!healthSkill.isMaxLevel()) {
				healthSkill.setSkillLevel(healthSkill.getSkillLevel() + 1);
				healthSkill.applySkilltoPlayer();
			}
			else {
				player.sendMessage(new TextComponentString("It's Max Level, Stop now bastard"));
			}
		}
		if(button.id == 1) {
			IPlayerSkill healthSkill = player.getCapability(SkillsProvider.PLAYER_EXTENSION, null).getSkillbyName("Health");
			
			if(healthSkill.getSkillLevel() != 0) {
				healthSkill.setSkillLevel(healthSkill.getSkillLevel() - 1);
				healthSkill.applySkilltoPlayer();
			}
			else {
				player.sendMessage(new TextComponentString("It's Min Level, Shut up!"));
			}
		}
		
		if(button.id == 2) {  //SpeedSkill
			IPlayerSkill speedSkill = player.getCapability(SkillsProvider.PLAYER_EXTENSION, null).getSkillbyName("Speed");
			
			if(!speedSkill.isMaxLevel()) {
				speedSkill.setSkillLevel(speedSkill.getSkillLevel() + 1);
				speedSkill.applySkilltoPlayer();
			}
			else {
				player.sendMessage(new TextComponentString("It's Max Level, Syka!"));
			}
		}
		if(button.id == 3) {
			IPlayerSkill speedSkill = player.getCapability(SkillsProvider.PLAYER_EXTENSION, null).getSkillbyName("Speed");
			
			if(speedSkill.getSkillLevel() != 0) {
				speedSkill.setSkillLevel(speedSkill.getSkillLevel() - 1);
				speedSkill.applySkilltoPlayer();
			}
			else {
				player.sendMessage(new TextComponentString("It's Min Level, Mather f*cker!"));
			}
		}
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float particalTicks) {
		this.drawDefaultBackground();
		this.drawTitle();
		
		super.drawScreen(mouseX, mouseY, particalTicks);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
	
	public void drawTitle() {
		int edgeX = this.width / 2;
		int edgeY = this.height / 2;
		this.fontRenderer.drawString(I18n.format("Syka"), edgeX + 50, edgeY + 15, 1210752);
	}
}
