package net.mcreator.createcomputational.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.createcomputational.init.CreateComputationalModItems;
import net.mcreator.createcomputational.init.CreateComputationalModFluids;
import net.mcreator.createcomputational.init.CreateComputationalModFluidTypes;
import net.mcreator.createcomputational.init.CreateComputationalModBlocks;

public abstract class CorrosionRemovingSolutionFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CreateComputationalModFluidTypes.CORROSION_REMOVING_SOLUTION_TYPE.get(), () -> CreateComputationalModFluids.CORROSION_REMOVING_SOLUTION.get(),
			() -> CreateComputationalModFluids.FLOWING_CORROSION_REMOVING_SOLUTION.get()).explosionResistance(100f).bucket(() -> CreateComputationalModItems.CORROSION_REMOVING_SOLUTION_BUCKET.get())
			.block(() -> (LiquidBlock) CreateComputationalModBlocks.CORROSION_REMOVING_SOLUTION.get());

	private CorrosionRemovingSolutionFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CorrosionRemovingSolutionFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CorrosionRemovingSolutionFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}