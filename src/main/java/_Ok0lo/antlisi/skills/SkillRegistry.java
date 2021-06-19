package _Ok0lo.antlisi.skills;

import java.util.ArrayList;
import java.util.List;

public class SkillRegistry {
	
	private static ArrayList<IPlayerSkill> skills;

	public static void loadSkills() {
		skills.add(new HealthSkill());
	}
	
	public static List<IPlayerSkill> getSkills(){
		return skills;
	}
}
