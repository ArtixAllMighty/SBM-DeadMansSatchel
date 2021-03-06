package com.builtbroken.deadmanssatchel.gui;

import com.builtbroken.deadmanssatchel.SatchelMod;
import com.builtbroken.deadmanssatchel.item.ContainerSatchel;
import com.builtbroken.deadmanssatchel.item.ItemDeadMansSatchel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiProxy implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		ItemStack stack = player.getHeldItem(EnumHand.values()[x]);
		int count = SatchelMod.getSlotCount((ItemDeadMansSatchel) stack.getItem());
		return new ContainerSatchel(player.inventory, stack, count);
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		ItemStack stack = player.getHeldItem(EnumHand.values()[x]);
		int count = SatchelMod.getSlotCount((ItemDeadMansSatchel) stack.getItem());
		return new GuiSatchel(stack, new ContainerSatchel(player.inventory, stack, count));
	}
}