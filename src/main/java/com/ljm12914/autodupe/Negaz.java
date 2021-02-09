package com.ljm12914.autodupe;

import net.minecraft.client.Minecraft;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Negaz extends Thread
{
    public boolean exit = false;
    public Negaz() { }
    Robot robot;
    public void run() {
        try
        {
            robot = new Robot();
        }
        catch(AWTException a)
        {
            a.printStackTrace();
        }
        K.ic(true);
        Minecraft.getMinecraft().player.sendChatMessage(".b followradius 1");
        if(exit){break;}
        Minecraft.getMinecraft().player.sendChatMessage(".b follow entities");
        if(exit){break;}
        //get on the donkey
        Minecraft.getMinecraft().player.rotationYaw = 0f;
        while(!Minecraft.getMinecraft().player.isRiding()) {
            Minecraft.getMinecraft().player.rotationYaw += 90f;
            mpress(InputEvent.BUTTON3_MASK);
            if(exit){break;}
            robot.delay(500);
        }
        Minecraft.getMinecraft().player.sendChatMessage(".b stop");
        //end get on the donkey
        if(exit){break;}
        Minecraft.getMinecraft().player.rotationYaw = 180f;
        if(exit){break;}
        dismount();
        robot.delay(1000);
        if(exit){break;}
        press(KeyEvent.VK_V);
        robot.delay(500);
        if(exit){break;}
        press(KeyEvent.VK_W,16000);
        robot.delay(2000);
        if(exit){break;}
        robot.keyPress(KeyEvent.VK_F3);
        press(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_F3);
        robot.delay(500);
        if(exit){break;}
        remount();
        robot.delay(800);
        if(exit){break;}
        press(KeyEvent.VK_E);
        robot.delay(100);  //wait for wwe
        if(exit){break;}
        //try to get onto the real donkey
        Minecraft.getMinecraft().player.rotationPitch = 90f;
        mpress(InputEvent.BUTTON3_MASK);
        if(exit){break;}
        Minecraft.getMinecraft().player.rotationPitch = 0f;
        mpress(InputEvent.BUTTON3_MASK);
        if(exit){break;}
        //END try to get onto the real donkey
        robot.delay(100);
        press(KeyEvent.VK_V);
        robot.delay(500);
        if(exit){break;}
        press(KeyEvent.VK_SHIFT);
        if(exit){break;}
        while(Minecraft.getMinecraft().player.isRiding()) {//lag prevent
            press(KeyEvent.VK_SHIFT);
            if(exit){break;}
            robot.delay(450);
        }
        robot.delay(200);
        if(exit){break;}
        Minecraft.getMinecraft().player.sendChatMessage(".b goto hopper");
        while(Minecraft.getMinecraft().player.prevPosX == 0 && Minecraft.getMinecraft().player.prevPosY == 0 && Minecraft.getMinecraft().player.prevPosZ == 0) {
            robot.delay(2000);
            if(exit){break;}
            Minecraft.getMinecraft().player.sendChatMessage("hopper didn't find yet");
        }
        if(exit){break;}
        press(KeyEvent.VK_ESCAPE);
        if(exit){break;}
        Minecraft.getMinecraft().player.rotationPitch = 90f;
        robot.delay(200);
        if(exit){break;}
        Minecraft.getMinecraft().player.sendChatMessage("finished");
        K.ic(false);
    }
    private void press(int ke, int time) {
        robot.keyPress(ke);
        robot.delay(time);
        robot.keyRelease(ke);
    }
    private void press(int ke) {
        robot.keyPress(ke);
        robot.delay(50);
        robot.keyRelease(ke);
    }
    private void mpress(int ke) {
        robot.mousePress(ke);
        robot.delay(50);
        robot.mouseRelease(ke);
    }
    private void dismount(){
        press(KeyEvent.VK_PERIOD);
        press(KeyEvent.VK_V);
        press(KeyEvent.VK_A);
        press(KeyEvent.VK_N);
        press(KeyEvent.VK_TAB);
        press(KeyEvent.VK_SPACE);
        press(KeyEvent.VK_D);
        press(KeyEvent.VK_TAB);
        press(KeyEvent.VK_ENTER);
    }
    private void remount(){
        press(KeyEvent.VK_PERIOD);
        press(KeyEvent.VK_V);
        press(KeyEvent.VK_A);
        press(KeyEvent.VK_N);
        press(KeyEvent.VK_TAB);
        press(KeyEvent.VK_SPACE);
        press(KeyEvent.VK_R);
        press(KeyEvent.VK_TAB);
        press(KeyEvent.VK_ENTER);
}
}