/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createcomputational.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.createcomputational.item.TankRobotItemItem;
import net.mcreator.createcomputational.item.PlasticSheetItem;
import net.mcreator.createcomputational.item.CorrosionRemovingSolutionItem;
import net.mcreator.createcomputational.CreateComputationalMod;

public class CreateComputationalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateComputationalMod.MODID);
	public static final RegistryObject<Item> ROBOT_CONSTRUCTOR;
	public static final RegistryObject<Item> TANK_ROBOT_SPAWN_EGG;
	public static final RegistryObject<Item> TANK_ROBOT_ITEM;
	public static final RegistryObject<Item> CORROSION_REMOVING_SOLUTION_BUCKET;
	public static final RegistryObject<Item> PLASTIC_CASING;
	public static final RegistryObject<Item> PLASTIC_SHEET;
	public static final RegistryObject<Item> TEST_TRANSFER;
	public static final RegistryObject<Item> TEST_HOLDER;
	public static final RegistryObject<Item> TEST_T_SPLIT;
	public static final RegistryObject<Item> TEST_T_SPLIT_IN;
	public static final RegistryObject<Item> SINGLE_OPTICAL_FIBER;
	static {
		ROBOT_CONSTRUCTOR = block(CreateComputationalModBlocks.ROBOT_CONSTRUCTOR);
		TANK_ROBOT_SPAWN_EGG = REGISTRY.register("tank_robot_spawn_egg", () -> new ForgeSpawnEggItem(CreateComputationalModEntities.TANK_ROBOT, -16777216, -16724992, new Item.Properties()));
		TANK_ROBOT_ITEM = REGISTRY.register("tank_robot_item", TankRobotItemItem::new);
		CORROSION_REMOVING_SOLUTION_BUCKET = REGISTRY.register("corrosion_removing_solution_bucket", CorrosionRemovingSolutionItem::new);
		PLASTIC_CASING = block(CreateComputationalModBlocks.PLASTIC_CASING);
		PLASTIC_SHEET = REGISTRY.register("plastic_sheet", PlasticSheetItem::new);
		TEST_TRANSFER = block(CreateComputationalModBlocks.TEST_TRANSFER);
		TEST_HOLDER = block(CreateComputationalModBlocks.TEST_HOLDER);
		TEST_T_SPLIT = block(CreateComputationalModBlocks.TEST_T_SPLIT);
		TEST_T_SPLIT_IN = block(CreateComputationalModBlocks.TEST_T_SPLIT_IN);
		SINGLE_OPTICAL_FIBER = block(CreateComputationalModBlocks.SINGLE_OPTICAL_FIBER);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}