/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createcomputational.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.createcomputational.CreateComputationalMod;

public class CreateComputationalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateComputationalMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATE_COMPUTATONAL = REGISTRY.register("create_computatonal",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_computational.create_computatonal")).icon(() -> new ItemStack(CreateComputationalModItems.TANK_ROBOT_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateComputationalModBlocks.ROBOT_CONSTRUCTOR.get().asItem());
				tabData.accept(CreateComputationalModItems.TANK_ROBOT_SPAWN_EGG.get());
				tabData.accept(CreateComputationalModItems.TANK_ROBOT_ITEM.get());
				tabData.accept(CreateComputationalModItems.CORROSION_REMOVING_SOLUTION_BUCKET.get());
				tabData.accept(CreateComputationalModBlocks.PLASTIC_CASING.get().asItem());
			}).withSearchBar().build());
}