package net.mcreator.createcomputational.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.createcomputational.procedures.TankRobotItemRightclickedOnBlockProcedure;

public class TankRobotItemItem extends Item {
	public TankRobotItemItem() {
		super(new Item.Properties().stacksTo(40));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TankRobotItemRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}