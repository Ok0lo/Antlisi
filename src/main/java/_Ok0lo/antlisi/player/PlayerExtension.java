package _Ok0lo.antlisi.player;

import java.util.ArrayList;

import _Ok0lo.antlisi.skills.HealthSkill;
import _Ok0lo.antlisi.skills.IPlayerSkill;
import _Ok0lo.antlisi.skills.SpeedSkill;

public class PlayerExtension implements IPlayerExtension {
	
	private ArrayList<IPlayerSkill> skills = new ArrayList<IPlayerSkill>();
	
	public PlayerExtension() {
		skills.add(new HealthSkill());
		skills.add(new SpeedSkill());
	}
	
	@Override
	public IPlayerSkill getSkillbyName(String skillName) {
		for(int i = 0; skills.size() > i; i++) {
			if(skills.get(i).getSkillName() == skillName) {
				return skills.get(i);
			}
		}
		return null;
	}

	
	
	@Override
	public boolean isActive(IPlayerSkill skill) {
		return skill.isActive();
	}
	@Override
	public void setActive(IPlayerSkill skill, boolean active) {
		skill.setActive(active);
	}

	
	
	@Override
	public int getSkillLevel(IPlayerSkill skill) {
		return skill.getSkillLevel();
	}
	@Override
	public void setSkillLevel(IPlayerSkill skill, int level) {
		skill.setSkillLevel(level);
	}

	
	
	@Override
	public ArrayList<IPlayerSkill> getSkills() {
		return skills;
	}
}
