package _Ok0lo.antlisi.skill;

import net.minecraft.util.ResourceLocation;

public interface IPlayerSkill {

	ResourceLocation getSkillName();
	
	void setSkillName(ResourceLocation skill);
	
	int getUpgradeCost(int currentLevel);
	
	void setUpgradeCosts(int[] levels);
	
	boolean isMaxLevel(int Level);
	
	int getMaxLevel();
	
	boolean isActive();
	
	void setActive(boolean active);
}
 