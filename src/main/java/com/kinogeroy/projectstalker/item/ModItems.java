package com.kinogeroy.projectstalker.item;

import com.kinogeroy.projectstalker.ProjectStalker;
import com.kinogeroy.projectstalker.misc.CreativeTabStalker;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import net.minecraftforge.registries.RegistryManager;
import org.lwjgl.util.glu.Registry;

public class ModItems {

    public static Item someItem;

    public static void preInit(){

        someItem = new Item().setUnlocalizedName("some_item").setCreativeTab(ProjectStalker.tabStalker);

        registerItems();
    }

    public static void registerItems(){
        RegistryEvent.Register();
    }

    public static void registerRenders(){

    }

    public static void registerRender(){

    }

}
