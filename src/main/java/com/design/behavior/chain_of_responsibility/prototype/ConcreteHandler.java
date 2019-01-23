package com.design.behavior.chain_of_responsibility.prototype;

/**
 * edited by AndersonKim
 * at 2019/1/23
 */
public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest() {
        if(successor!=null){
            System.out.println(getClass().getName()+" upload request");
            successor.handleRequest();
        }else{
            System.out.println("process request");
        }
    }
}
