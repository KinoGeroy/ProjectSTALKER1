package com.kinogeroy.projectstalker.proxy;

import com.kinogeroy.projectstalker.ProjectStalker;
import com.kinogeroy.projectstalker.item.ModItems;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {

        OBJLoader.INSTANCE.addDomain(ProjectStalker.MODID);
        registerModel(ModItems)
    }

    public void  registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0,new);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
