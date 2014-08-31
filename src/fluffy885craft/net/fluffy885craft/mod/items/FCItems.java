package net.fluffy885craft.mod.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.fluffy885craft.mod.Fluffy885Craft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class FCItems extends Item {
	public FCItems() {
		this.setCreativeTab(Fluffy885Craft.fluffy885craftTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Fluffy885Craft.modid + ":" + this.getUnlocalizedName().substring(5)); // remove "item." from beginning of name
	}

}
