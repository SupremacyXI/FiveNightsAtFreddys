package com.fnaf.Common.Entity.mangle;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityMangle {
	
	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		
		createEntity(EntityMangleMob.class, "Mangle", 0xEFF0DF, 0xF20568);
		
	}
	//Sounds
	protected String getLivingSound()
	{
	    return "scare.ogg";
	}
	protected String getHurtSound()
	{
	    return "CROWD_SMALL_CHIL_EC049202";
	}
	protected String getDeathSound()
	{
	    return "CROWD_SMALL_CHIL_EC049202.ogg";
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, com.fnaf.Client.main.main_fnaf.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

}