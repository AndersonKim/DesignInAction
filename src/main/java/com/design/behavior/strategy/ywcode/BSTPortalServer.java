package com.design.behavior.strategy.ywcode;

public class BSTPortalServer extends PortalServer {
    @Override
    public void login(String msg) {
        BSTMsg(msg);
        super.login(msg);
    }

    @Override
    public void register(String msg) {
        BSTMsg(msg);
        super.register(msg);
    }

    public void BSTMsg(String msg){
        System.out.println("BST Msg");
    }
}
