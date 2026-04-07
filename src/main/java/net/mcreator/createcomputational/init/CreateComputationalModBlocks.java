/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createcomputational.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createcomputational.block.*;
import net.mcreator.createcomputational.CreateComputationalMod;

public class CreateComputationalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateComputationalMod.MODID);
	public static final RegistryObject<Block> ROBOT_CONSTRUCTOR;
	public static final RegistryObject<Block> CORROSION_REMOVING_SOLUTION;
	public static final RegistryObject<Block> PLASTIC_CASING;
	public static final RegistryObject<Block> TEST_TRANSFER;
	public static final RegistryObject<Block> TEST_HOLDER;
	public static final RegistryObject<Block> TEST_T_SPLIT;
	public static final RegistryObject<Block> TEST_T_SPLIT_IN;
	public static final RegistryObject<Block> SINGLE_OPTICAL_FIBER;
	static {
		ROBOT_CONSTRUCTOR = REGISTRY.register("robot_constructor", RobotConstructorBlock::new);
		CORROSION_REMOVING_SOLUTION = REGISTRY.register("corrosion_removing_solution", CorrosionRemovingSolutionBlock::new);
		PLASTIC_CASING = REGISTRY.register("plastic_casing", PlasticCasingBlock::new);
		TEST_TRANSFER = REGISTRY.register("test_transfer", TestTransferBlock::new);
		TEST_HOLDER = REGISTRY.register("test_holder", TestHolderBlock::new);
		TEST_T_SPLIT = REGISTRY.register("test_t_split", TestTSplitBlock::new);
		TEST_T_SPLIT_IN = REGISTRY.register("test_t_split_in", TestTSplitInBlock::new);
		SINGLE_OPTICAL_FIBER = REGISTRY.register("single_optical_fiber", SingleOpticalFiberBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}