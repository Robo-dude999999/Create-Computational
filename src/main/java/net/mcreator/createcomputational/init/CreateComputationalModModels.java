/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createcomputational.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.createcomputational.client.model.ModelTreadRobo;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreateComputationalModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelTreadRobo.LAYER_LOCATION, ModelTreadRobo::createBodyLayer);
	}
}