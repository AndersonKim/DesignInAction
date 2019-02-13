package com.design.structural.adapter.interface_adapter;

/**
 * edited by AndersonKim
 * at 2019/2/13
 */
public class ConcreteAdapter extends InterfaceAdapter {
    @Override
    public void targetMethod() {
        //被适配的方法
        //先通过抽象类实现接口，而后通过继承重写接口中指定的方法
        super.targetMethod();
        System.out.println("concrete adapter running target method  ");
    }
}
