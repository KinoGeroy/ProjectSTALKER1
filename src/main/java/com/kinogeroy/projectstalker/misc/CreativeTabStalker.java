package com.kinogeroy.projectstalker.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;



public class CreativeTabStalker extends CreativeTabs {
    //совя ебучая вкладка
    public CreativeTabStalker(String label) {
        super(label);
    }
    //иконка ебучей вкладки
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.APPLE);
    }
}
