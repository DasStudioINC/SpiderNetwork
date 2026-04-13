package com.spidernetwork.core;

public class Debug {

    public void log(String msg){
        System.out.println("[SpiderNetwork] " + msg);
    }

    public void warn(String msg){
        System.out.println("[SpiderNetwork WARNING] " + msg);
    }
    public void error(String msg){
        System.out.println("[SpiderNetwork] ERROR" + msg);
    }

}
