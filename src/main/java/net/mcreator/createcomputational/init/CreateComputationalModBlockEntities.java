/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createcomputational.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;

import net.mcreator.createcomputational.block.entity.TestTransferBlockEntity;
import net.mcreator.createcomputational.block.entity.RobotConstructorBlockEntity;
import net.mcreator.createcomputational.CreateComputationalMod;

public class CreateComputationalModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateComputationalMod.MODID);
	public static final RegistryObject<BlockEntityType<RobotConstructorBlockEntity>> ROBOT_CONSTRUCTOR = register("robot_constructor", CreateComputationalModBlocks.ROBOT_CONSTRUCTOR, RobotConstructorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<TestTransferBlockEntity>> TEST_TRANSFER = register("test_transfer", CreateComputationalModBlocks.TEST_TRANSFER, TestTransferBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}