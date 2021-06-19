package _Ok0lo.antlisi.player;

import java.util.ArrayList;

import _Ok0lo.antlisi.skills.IPlayerSkill;

public interface IPlayerExtension {

	IPlayerSkill getSkillbyName(String skillName);
	
	boolean isActive(IPlayerSkill skill);
	void setActive(IPlayerSkill skill, boolean active);
	
	int getSkillLevel(IPlayerSkill skill);
	void setSkillLevel(IPlayerSkill skill, int level);
	
	ArrayList<IPlayerSkill> getSkills();
}
