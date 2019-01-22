package com.design.structural.decorator.prototype;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("decorator B operation");
    }
}
