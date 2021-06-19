package _Ok0lo.antlisi.skills;

import _Ok0lo.antlisi.Antlisi;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;

public class SpeedSkill extends BasePlayerSkill {

	public SpeedSkill() {
		setSkillName("Speed");
		setActive(false);
		setSkillLevel(0);
		setMaxLevel(5);
	}
	
	@Override
	public void applySkilltoPlayer() {
		if(!isMaxLevel() || getSkillLevel() == getMaxLevel()) {
			EntityPlayer player = Antlisi.proxy.getPlayer(Antlisi.proxy.getPlayer());
			IAttributeInstance attribute = player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
			
			switch(getSkillLevel()) {
			case 0:
				attribute.removeAllModifiers();
				//attribute.setBaseValue(0.1D);
				break;
			case 1:
				attribute.removeAllModifiers();
				attribute.applyModifier(new AttributeModifier("speed", 0.11D, 1));
				//attribute.setBaseValue(0.15D);
				break;
			case 2:
				attribute.removeAllModifiers();
				attribute.applyModifier(new AttributeModifier("speed", 0.12D, 1));
				//attribute.setBaseValue(0.2D);
				break;
			case 3:
				attribute.removeAllModifiers();
				attribute.applyModifier(new AttributeModifier("speed", 0.13D, 1));
				//attribute.setBaseValue(0.25D);
				break;
			case 4:
				attribute.removeAllModifiers();
				attribute.applyModifier(new AttributeModifier("speed", 0.14D, 1));
				//attribute.setBaseValue(0.3D);
				break;
			case 5:
				attribute.removeAllModifiers();
				attribute.applyModifier(new AttributeModifier("speed", 1.0D, 1));
				//attribute.setBaseValue(1.0D);
				break;
			}
		}
	}
}
