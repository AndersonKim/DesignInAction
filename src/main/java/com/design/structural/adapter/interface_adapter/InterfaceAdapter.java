package com.design.structural.adapter.interface_adapter;

/**
 * edited by AndersonKim
 * at 2019/2/13
 */
public abstract class InterfaceAdapter implements TargetInterface {
    public void a(){};
    public void b(){};
    public void targetMethod(){
        System.out.println("interface running target method");
    };
}
