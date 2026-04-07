package net.mcreator.createcomputational.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

public class PlasticCasingNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world) {
		for (Direction directioniterator : Direction.values()) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("" + directioniterator)), false);
			}
		}
	}
}