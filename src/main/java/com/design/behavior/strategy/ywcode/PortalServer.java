package com.design.behavior.strategy.ywcode;

public abstract class PortalServer {
    public void login(String msg){
        System.out.println("login with : "+msg);
    }
    public void register(String msg){
        System.out.println("register with : "+msg);
    }

}
