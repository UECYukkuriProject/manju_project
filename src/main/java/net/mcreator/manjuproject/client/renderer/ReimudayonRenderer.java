
package net.mcreator.manjuproject.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.manjuproject.entity.ReimudayonEntity;

public class ReimudayonRenderer extends HumanoidMobRenderer<ReimudayonEntity, HumanoidModel<ReimudayonEntity>> {
	public ReimudayonRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(ReimudayonEntity entity) {
		return new ResourceLocation("manju_project:textures/entities/f2ef048b6a9edef084f8aa87ca91fd4d1ce0b4d1.png");
	}
}
