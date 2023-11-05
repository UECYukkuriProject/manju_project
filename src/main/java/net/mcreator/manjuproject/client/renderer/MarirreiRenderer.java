
package net.mcreator.manjuproject.client.renderer;

public class MarirreiRenderer extends HumanoidMobRenderer<MarirreiEntity, HumanoidModel<MarirreiEntity>> {

	public MarirreiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(MarirreiEntity entity) {
		return new ResourceLocation("manju_project:textures/entities/wu_yu_mo_li_sha__skin.png");
	}

}
