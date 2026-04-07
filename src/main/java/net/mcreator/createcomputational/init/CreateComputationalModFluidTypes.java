/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createcomputational.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.createcomputational.fluid.types.CorrosionRemovingSolutionFluidType;
import net.mcreator.createcomputational.CreateComputationalMod;

public class CreateComputationalModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateComputationalMod.MODID);
	public static final RegistryObject<FluidType> CORROSION_REMOVING_SOLUTION_TYPE = REGISTRY.register("corrosion_removing_solution", () -> new CorrosionRemovingSolutionFluidType());
}