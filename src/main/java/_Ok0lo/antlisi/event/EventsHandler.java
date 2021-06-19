package _Ok0lo.antlisi.event;

import _Ok0lo.antlisi.capability.SkillsProvider;
import _Ok0lo.antlisi.player.IPlayerExtension;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventsHandler {

	@SubscribeEvent
	public void onPlayerClone(PlayerEvent.Clone event) {
		EntityPlayer player = event.getEntityPlayer();
		
		IPlayerExtension expand = player.getCapability(SkillsProvider.PLAYER_EXTENSION, null);
		IPlayerExtension oldExpand = event.getOriginal().getCapability(SkillsProvider.PLAYER_EXTENSION, null);
			
		//for(int i = 0; expand.getSkills().size() > i; i++) {
			expand.setSkillLevel(expand.getSkills().get(0), oldExpand.getSkills().get(0).getSkillLevel());
		//}
	}
}	
