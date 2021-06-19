package _Ok0lo.antlisi.skills;

public interface IPlayerSkill {

	String getSkillName();
	void setSkillName(String skillName);
	
	boolean isActive();
	void setActive(boolean active);
	
	int getSkillLevel();
	void setSkillLevel(int level);
	
	int getMaxLevel();
	void setMaxLevel(int maxLevel);
	boolean isMaxLevel();
	
	void applySkilltoPlayer();
}
