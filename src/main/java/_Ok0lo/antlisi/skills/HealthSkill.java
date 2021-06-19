package _Ok0lo.antlisi.skills;

import _Ok0lo.antlisi.Antlisi;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;

public class HealthSkill extends BasePlayerSkill {
	
	public HealthSkill() {
		setSkillName("Health");
		setActive(false);
		setSkillLevel(0);
		setMaxLevel(5);
	}

	@Override
	public void applySkilltoPlayer() {
		if(!isMaxLevel() || getSkillLevel() == getMaxLevel()) {
			EntityPlayer player = Antlisi.proxy.getPlayer(Antlisi.proxy.getPlayer());
			IAttributeInstance attribute = player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
			
			switch(getSkillLevel()) {
			case 0:
				attribute.setBaseValue(20.0D);
				break;
			case 1:
				attribute.setBaseValue(22.0D);
				break;
			case 2:
				attribute.setBaseValue(24.0D);
				break;
			case 3:
				attribute.setBaseValue(26.0D);
				break;
			case 4:
				attribute.setBaseValue(28.0D);
				break;
			case 5:
				attribute.setBaseValue(30.0D);
				break;
			}
			
			if(player.getHealth() > player.getMaxHealth()) {
				player.setHealth(player.getMaxHealth());
			}
		}
	}
}
