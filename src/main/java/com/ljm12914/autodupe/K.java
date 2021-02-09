package com.ljm12914.autodupe;

import net.minecraft.client.Minecraft;

public class K {
    public static void ic(boolean a) {
        String[] color = {"white","orange","magenta","light_blue","yellow","lime","pink","gray","silver","cyan","purple","blue","brown","green","red","black"};
        String c;
        if(a)
            c="add ";
        else
            c="remove ";
        for(int i = 0; i <= 15; i++)
        {
            Minecraft.getMinecraft().player.sendChatMessage(".inventorycleaner " + c + color[i] + "_shulker_box");
        }
    }
}