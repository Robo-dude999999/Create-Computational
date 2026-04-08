package net.mcreator.createcomputational.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.createcomputational.init.CreateComputationalModBlocks;

public class TestTransferOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xx = 0;
		double zz = 0;
		if (Direction.NORTH == (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z)))))) {
			xx = x;
			zz = z + 1;
		} else if (Direction.SOUTH == (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z)))))) {
			xx = x;
			zz = z + -1;
		} else if (Direction.EAST == (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z)))))) {
			xx = x + -1;
			zz = z;
		} else if (Direction.WEST == (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z)))))) {
			xx = x + 1;
			zz = z;
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(xx, y, zz))).getBlock()
				&& (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(xx, y, zz))))) == (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z)))))
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CreateComputationalModBlocks.TEST_T_SPLIT_IN.get()
						&& (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(xx, y, zz))))) == (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z)))))
				|| (world.getBlockState(BlockPos.containing(xx, y, zz))).getBlock() == CreateComputationalModBlocks.TEST_HOLDER.get()
				|| (world.getBlockState(BlockPos.containing(xx, y, zz))).getBlock() == CreateComputationalModBlocks.TEST_T_SPLIT.get()
						&& ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(xx, y, zz))))) == ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))).getClockWise(Direction.Axis.Y))
								|| (getDirectionFromBlockState((world.getBlockState(BlockPos.containing(xx, y, zz))))) == ((getDirectionFromBlockState((world.getBlockState(BlockPos.containing(x, y, z))))).getCounterClockWise(Direction.Axis.Y)))) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("transfer") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, ((world.getBlockState(BlockPos.containing(xx, y, zz))).getBlock().getStateDefinition().getProperty("transfer") instanceof BooleanProperty _getbp44
							&& (world.getBlockState(BlockPos.containing(xx, y, zz))).getValue(_getbp44))), 3);
			}
		} else {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("transfer") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
			}
		}
	}

	private static Direction getDirectionFromBlockState(BlockState blockState) {
		Property<?> prop = blockState.getBlock().getStateDefinition().getProperty("facing");
		if (prop instanceof DirectionProperty dp)
			return blockState.getValue(dp);
		prop = blockState.getBlock().getStateDefinition().getProperty("axis");
		return prop instanceof EnumProperty ep && ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) blockState.getValue(ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
	}
}