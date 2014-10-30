package com.gildedgames.aether.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsAether
{
	
    public static final CreativeTabs blocksNatural = new CreativeTabs("blocksNatural")
    {
    	
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(BlocksAether.aetherGrass);
        }
        
    };
	
}