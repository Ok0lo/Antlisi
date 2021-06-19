package _Ok0lo.antlisi.skills;

public class BasePlayerSkill implements IPlayerSkill {

	private String skillName = "skill";
	private boolean isActive = false;
	private int level = 0;
	private int maxLevel = 0;
	
	@Override
	public String getSkillName() {
		return skillName;
	}
	@Override
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	
	
	@Override
	public boolean isActive() {
		return isActive;
	}

	@Override
	public void setActive(boolean active) {
		isActive = active;
	}

	
	
	@Override
	public int getSkillLevel() {
		return level;
	}
	@Override
	public void setSkillLevel(int level) {
		this.level = level;
	}

	
	
	@Override
	public int getMaxLevel() {
		return maxLevel;
	}
	@Override
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	@Override
	public boolean isMaxLevel() {
		if(level == maxLevel) {
			return true;
		}
		return false;
	}
	
	
	
	@Override
	public void applySkilltoPlayer() {
	}
}
