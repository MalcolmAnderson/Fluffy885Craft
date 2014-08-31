package net.fluffy885craft.mod;

import net.fluffy885craft.mod.blocks.CopperBlock;
import net.fluffy885craft.mod.blocks.CopperOre;
import net.fluffy885craft.mod.items.FCItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Fluffy885Craft.modid, version = Fluffy885Craft.version)
public class Fluffy885Craft {
	public static final String modid = "Fluffy885Craft";
	public static final String version = "Alpha v0.1";
	
	public static CreativeTabs fluffy885craftTab;
	
	public static Item itemCopperIngot;
	public static Block oreCopperOre;
	public static Block blockCopperBlock;
	
	public static Item itemFashionIngot;
	public static Block oreFashionOre;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		fluffy885craftTab = new CreativeTabs("Fluffy885Craft"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(Fluffy885Craft.oreCopperOre);
			}
		};
		
		itemCopperIngot = new FCItems().setUnlocalizedName("CopperIngot");
		GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
		
		oreCopperOre = new CopperOre(Material.rock).setBlockName("CopperOre");
		GameRegistry.registerBlock(oreCopperOre, "CopperOre");
		
		itemFashionIngot = new FCItems().setUnlocalizedName("FashionIngot");
		GameRegistry.registerItem(itemFashionIngot, "FashionIngot");
		
		oreFashionOre = new CopperOre(Material.rock).setBlockName("FashionOre");
		GameRegistry.registerBlock(oreFashionOre, "FashionOre");
		
		blockCopperBlock = new CopperBlock(Material.iron).setBlockName("CopperBlock");
		GameRegistry.registerBlock(blockCopperBlock, "CopperBlock");
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		GameRegistry.addSmelting(oreCopperOre, new ItemStack(itemCopperIngot, 2), 0);
		GameRegistry.addSmelting(oreFashionOre, new ItemStack(itemFashionIngot, 4), 0);
		GameRegistry.addRecipe(
				new ItemStack(blockCopperBlock), 
				new Object[]{"CCC", "CCC", "CCC", 'C', itemCopperIngot}
		); 
	
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	
}
