package net.mcreator.createcomputational.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.createcomputational.init.CreateComputationalModFluids;

public class CorrosionRemovingSolutionBlock extends LiquidBlock {
	public CorrosionRemovingSolutionBlock() {
		super(() -> CreateComputationalModFluids.CORROSION_REMOVING_SOLUTION.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 70;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 40;
	}
}