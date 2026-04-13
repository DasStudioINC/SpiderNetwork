package com.spidernetwork.core;

import com.spidernetwork.visuals.colors;

public class Debug {

    public static void log(String msg){
        System.out.println(colors.nameToAnsi("Gray") + "[SpiderNetwork] " + colors.getRESET() + colors.nameToAnsi("White") + msg + colors.getRESET());
    }
    public static void warn(String msg){
        System.out.println("[SpiderNetwork WARNING] " + msg);
    }
    public static void error(String msg){
        System.out.println("[SpiderNetwork] ERROR" + msg);
    }

}
