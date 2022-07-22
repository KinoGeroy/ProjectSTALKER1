package com.kinogeroy.projectstalker;

import com.kinogeroy.projectstalker.item.ModItems;
import com.kinogeroy.projectstalker.proxy.CommonProxy;
import com.kinogeroy.projectstalker.misc.CreativeTabStalker;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import org.apache.logging.log4j.Logger;


@Mod(modid = ProjectStalker.MODID, name = ProjectStalker.NAME, version = ProjectStalker.VERSION)
public class ProjectStalker
{
    public static final String MODID = "projectstalker";
    public static final String NAME = "Project Stalker";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @Mod.Instance
    public static ProjectStalker instance;

    public static CreativeTabStalker tabStalker;

    @SidedProxy(clientSide = "com.kinogeroy.projectstalker.proxy.ClientProxy", serverSide = "com.kinogeroy.projectstalker.proxy.CommonProxy")
    public static CommonProxy proxy;

    //ебучая вкладка
    public static final CreativeTabs TAB_STALKER = new CreativeTabStalker("tab_stalker");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
        ModItems.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
