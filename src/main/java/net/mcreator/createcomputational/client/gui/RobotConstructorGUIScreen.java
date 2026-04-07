package net.mcreator.createcomputational.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.createcomputational.world.inventory.RobotConstructorGUIMenu;
import net.mcreator.createcomputational.init.CreateComputationalModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class RobotConstructorGUIScreen extends AbstractContainerScreen<RobotConstructorGUIMenu> implements CreateComputationalModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private EditBox commandbar;
	private ImageButton imagebutton_arrowup;

	public RobotConstructorGUIScreen(RobotConstructorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 260;
		this.imageHeight = 192;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("commandbar"))
				commandbar.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("create_computational:textures/screens/robot_constructor_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		commandbar.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 3 && mouseX < leftPos + 27 && mouseY > topPos + 84 && mouseY < topPos + 108) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.create_computational.robot_constructor_gui.tooltip_use_blueprintadd_robot_name_t"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + 84 && mouseY < topPos + 108) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.create_computational.robot_constructor_gui.tooltip_use_build_to_build_the_robot"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("create_computational:textures/screens/guilogscreen.png"), this.leftPos + 4, this.topPos + 4, 0, 0, 160, 160, 160, 160);
		guiGraphics.blit(ResourceLocation.parse("create_computational:textures/screens/arrowright.png"), this.leftPos + 199, this.topPos + 27, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("create_computational:textures/screens/folder-icon-big-256.png"), this.leftPos + 173, this.topPos + 18, 0, 0, 32, 32, 32, 32);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (commandbar.isFocused())
			return commandbar.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String commandbarValue = commandbar.getValue();
		super.resize(minecraft, width, height);
		commandbar.setValue(commandbarValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.create_computational.robot_constructor_gui.label_test"), 9, 9, -16738048, false);
	}

	@Override
	public void init() {
		super.init();
		commandbar = new EditBox(this.font, this.leftPos + 7, this.topPos + 87, 118, 18, Component.translatable("gui.create_computational.robot_constructor_gui.commandbar"));
		commandbar.setMaxLength(8192);
		commandbar.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "commandbar", content, false);
		});
		commandbar.setHint(Component.translatable("gui.create_computational.robot_constructor_gui.commandbar"));
		this.addWidget(this.commandbar);
		imagebutton_arrowup = new ImageButton(this.leftPos + 200, this.topPos + 89, 16, 16, 0, 0, 16, ResourceLocation.parse("create_computational:textures/screens/atlas/imagebutton_arrowup.png"), 16, 32, e -> {
		});
		this.addRenderableWidget(imagebutton_arrowup);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		commandbar.tick();
	}
}