package net.mcreator.createcomputational.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.createcomputational.procedures.PlasticCasingNeighbourBlockChangesProcedure;

public class PlasticCasingBlock extends Block {
	public PlasticCasingBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(1f, 10f).instrument(NoteBlockInstrument.XYLOPHONE));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 13;
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		PlasticCasingNeighbourBlockChangesProcedure.execute(world);
	}
}