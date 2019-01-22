package com.design.structural.decorator.prototype;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class ConcreteDecoratorA extends Decorator{


    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("decorator A operation");
    }
}
