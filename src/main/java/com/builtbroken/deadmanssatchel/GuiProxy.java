package com.builtbroken.deadmanssatchel;

import com.builtbroken.deadmanssatchel.gui.GuiSatchel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiProxy implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		ItemStack stack = player.getHeldItem(EnumHand.values()[x]);
		return new ContainerSatchel(player.inventory, stack);


	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		ItemStack stack = player.getHeldItem(EnumHand.values()[x]);
		return new GuiSatchel(stack, new ContainerSatchel(player.inventory, stack));


	}
}