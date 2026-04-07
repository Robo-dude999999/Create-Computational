package net.mcreator.createcomputational.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.createcomputational.entity.TankRobotEntity;
import net.mcreator.createcomputational.client.model.ModelTreadRobo;

public class TankRobotRenderer extends MobRenderer<TankRobotEntity, ModelTreadRobo<TankRobotEntity>> {
	public TankRobotRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTreadRobo<TankRobotEntity>(context.bakeLayer(ModelTreadRobo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TankRobotEntity entity) {
		return ResourceLocation.parse("create_computational:textures/entities/treadrobotexture.png");
	}
}