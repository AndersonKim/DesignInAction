package com.design.behavior.strategy.ywcode;

public class ServiceContext {
    PortalServer portalServer;

    public void setPortalServer(PortalServer portalServer) {
        this.portalServer = portalServer;
    }

    public ServiceContext(PortalServer portalServer) {
        this.portalServer = portalServer;
    }

    public void loginService(String msg){
        portalServer.login(msg);
    }
    public void registerService(String msg){
        portalServer.register(msg);
    }
}
