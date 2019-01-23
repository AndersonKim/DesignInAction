package com.design.behavior.chain_of_responsibility.manager;

/**
 * edited by AndersonKim
 * at 2019/1/23
 */
public  abstract class FeeHandler {
    protected FeeHandler successor;
    protected Boolean haveSuccessor=false;
    public abstract String handleFeeRequest(double fee);

    public FeeHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(FeeHandler successor) {
        this.successor = successor;
        haveSuccessor=true;
    }
}
