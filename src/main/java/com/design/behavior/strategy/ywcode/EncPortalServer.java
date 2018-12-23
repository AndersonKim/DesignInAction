package com.design.behavior.strategy.ywcode;

public class EncPortalServer extends PortalServer {
    @Override
    public void login(String msg) {
        decodeMsg(msg);
        super.login(msg);
    }

    @Override
    public void register(String msg) {
        decodeMsg(msg);
        super.register(msg);
    }

    public void decodeMsg(String msg){
        System.out.println("decode msg");
    }
}
