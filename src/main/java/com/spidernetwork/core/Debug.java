package com.spidernetwork.core;

public class Debug {

    public static void log(String msg){
        System.out.println("[SpiderNetwork] " + msg);
    }

    public static void warn(String msg){
        System.out.println("[SpiderNetwork WARNING] " + msg);
    }
    public static void error(String msg){
        System.out.println("[SpiderNetwork] ERROR" + msg);
    }

}
