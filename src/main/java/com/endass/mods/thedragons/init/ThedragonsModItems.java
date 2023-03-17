
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.endass.mods.thedragons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import com.endass.mods.thedragons.ThedragonsMod;

public class ThedragonsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThedragonsMod.MODID);
	public static final RegistryObject<Item> BLACK_DRAGON_ADULT_SPAWN_EGG = REGISTRY.register("black_dragon_adult_spawn_egg",
			() -> new ForgeSpawnEggItem(ThedragonsModEntities.BLACK_DRAGON_ADULT, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
