package com.fnaf.Client.handlers;

import java.util.Random;

import com.fnaf.Common.main.mainRegistry;

import net.minecraft.util.ChatComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class ForgeEventHandler {

	
	
	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerLoggedInEvent event){
		@SuppressWarnings("unused")
		ChatComponentTranslation chatcomponenttranslation = new ChatComponentTranslation("Thanks for signing up for the FNAF Mod Beta-Program, " + mainRegistry.getVersion() + "! Tip: " + getRandomTip(), new Object[0]);
		}
	private String getRandomTip(){
    	Random random = new Random();
    	int randomInt = random.nextInt(2);
    	
    	if(randomInt == 0){
    		return "This version is: Beta Stable.";
    	}else if(randomInt == 1){
    		return "Don't forget to download -Magik-'s Notch VS Herobrine Mod.";
    	}else{
    		return "";
    	}
	}
	public static void mainRegistry() {
		MinecraftForge.EVENT_BUS.register(mainRegistry.FeventHandler);
		
	}
}



