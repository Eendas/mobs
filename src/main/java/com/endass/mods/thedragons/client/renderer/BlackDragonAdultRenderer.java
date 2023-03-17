
package com.endass.mods.thedragons.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.endass.mods.thedragons.entity.model.BlackDragonAdultModel;
import com.endass.mods.thedragons.entity.BlackDragonAdultEntity;

public class BlackDragonAdultRenderer extends GeoEntityRenderer<BlackDragonAdultEntity> {
	public BlackDragonAdultRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BlackDragonAdultModel());
		this.shadowRadius = 2.4f;
	}

	@Override
	public RenderType getRenderType(BlackDragonAdultEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
