package com.fnaf.Common.armor.main;

import com.fnaf.Client.main.Reference;
import com.fnaf.Common.armor.bonnie.itemBonnie;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmor {
	
	
public static Item BonnieHelmet;
public static Item BonnieChestplate;
public static Item BonnieLeggings;
public static Item BonnieFeet;



	public static void init()
	{

		ArmorMaterial Useless = EnumHelper.addArmorMaterial("useless", 0, new int[]{0, 0, 0, 0}, 0);
   
		BonnieHelmet = (new itemBonnie(Useless, 0, 0).setUnlocalizedName("bonnie_helmet"));
		GameRegistry.registerItem(BonnieHelmet, "bonnie_helmet", Reference.MODID);
		
		BonnieChestplate = (new itemBonnie(Useless, 1, 0).setUnlocalizedName("bonnie_chestplate"));
		GameRegistry.registerItem(BonnieChestplate, "bonnie_chestplate", Reference.MODID);
		
		BonnieLeggings = (new itemBonnie(Useless, 2, 0).setUnlocalizedName("bonnie_leggings"));
		GameRegistry.registerItem(BonnieLeggings, "bonnie_leggings", Reference.MODID);
		
		
}
}
