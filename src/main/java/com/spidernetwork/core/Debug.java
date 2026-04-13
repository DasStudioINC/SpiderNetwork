package com.spidernetwork.core;
import java.awt.*;
import com.spidernetwork.visuals.colors;

public class Debug {

    public static void log(String msg){
        System.out.println(colors.nameToAnsi("Gray") + "[SpiderNetwork]" + colors.getRESET() +" "+ colors.nameToAnsi("Bright White") + msg + colors.getRESET());
    }

    public static void log(String msg, String color){
        System.out.println(colors.nameToAnsi("Gray") + "[SpiderNetwork]" + colors.getRESET() +" "+ colors.nameToAnsi(color) + msg + colors.getRESET());
    }
    public static void warn(String msg){
        System.out.println( colors.nameToAnsi("Orange")+ "[SpiderNetwork WARNING] "  + colors.getRESET() + msg);
    }
    public static void error(String msg){
        System.out.println( colors.nameToAnsi("Crimson") + "[SpiderNetwork] ERROR" + colors.getRESET() + msg);
    }

}
