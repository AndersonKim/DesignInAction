package com.design.behavior.chain_of_responsibility.prototype;

/**
 * edited by AndersonKim
 * at 2019/1/23
 */
public abstract class Handler {
    protected Handler successor;
    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
