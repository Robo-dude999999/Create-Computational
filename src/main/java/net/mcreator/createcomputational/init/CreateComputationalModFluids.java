/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createcomputational.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.createcomputational.fluid.CorrosionRemovingSolutionFluid;
import net.mcreator.createcomputational.CreateComputationalMod;

public class CreateComputationalModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateComputationalMod.MODID);
	public static final RegistryObject<FlowingFluid> CORROSION_REMOVING_SOLUTION = REGISTRY.register("corrosion_removing_solution", () -> new CorrosionRemovingSolutionFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CORROSION_REMOVING_SOLUTION = REGISTRY.register("flowing_corrosion_removing_solution", () -> new CorrosionRemovingSolutionFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CORROSION_REMOVING_SOLUTION.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CORROSION_REMOVING_SOLUTION.get(), RenderType.translucent());
		}
	}
}