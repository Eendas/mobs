
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.endass.mods.thedragons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.endass.mods.thedragons.client.renderer.BlackDragonAdultRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThedragonsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ThedragonsModEntities.BLACK_DRAGON_ADULT.get(), BlackDragonAdultRenderer::new);
	}
}
