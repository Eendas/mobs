package com.endass.mods.thedragons.entity.model;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import com.endass.mods.thedragons.entity.BlackDragonAdultEntity;

public class BlackDragonAdultModel extends AnimatedGeoModel<BlackDragonAdultEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlackDragonAdultEntity entity) {
		return new ResourceLocation("thedragons", "animations/blackdragonadult.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackDragonAdultEntity entity) {
		return new ResourceLocation("thedragons", "geo/blackdragonadult.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackDragonAdultEntity entity) {
		return new ResourceLocation("thedragons", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BlackDragonAdultEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("animation.model.head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
