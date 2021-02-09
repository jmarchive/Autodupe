package com.ljm12914.autodupe;

import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.chat.IChatListener;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Autodupe.MODID, name = Autodupe.NAME, version = Autodupe.VERSION)
public class Autodupe
{
    public static final String MODID = "autodupe";
    public static final String NAME = "Auto Dupe";
    public static final String VERSION = "1.0.0";
    Postx postx = new Postx();
    Negax negax = new Negax();
    Postz postz = new Postz();
    Negaz negaz = new Negaz();
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void ingame(WorldEvent event) {
        
    }
    @SubscribeEvent
    public void main(ClientChatEvent event) {
        if(event.getMessage().equals("!k"))
        {
            event.setCanceled(true);
            postx.start();
        }
        else if(event.getMessage().equals("!l"))
        {
            event.setCanceled(true);
            negax.start();
        }
        else if(event.getMessage().equals("!m"))
        {
            event.setCanceled(true);
            postz.start();
        }
        else if(event.getMessage().equals("!n"))
        {
            event.setCanceled(true);
            negaz.start();
        }
        else if(event.getMessage().equals("!t"))
        {
            event.setCanceled(true);
            postx.exit = true;
        }
        else if(event.getMessage().equals("!u"))
        {
            event.setCanceled(true);
            negax.exit = true;
        }
        else if(event.getMessage().equals("!v"))
        {
            event.setCanceled(true);
            postz.exit = true;
        }
        else if(event.getMessage().equals("!w"))
        {
            event.setCanceled(true);
            negaz.exit = true;
        }
    }
}