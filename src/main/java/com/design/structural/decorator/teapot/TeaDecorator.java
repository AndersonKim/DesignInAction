package com.design.structural.decorator.teapot;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class TeaDecorator extends DrinkDecorator {
    public TeaDecorator(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }

    @Override
    public void operation() {
        drinkComponent.operation();
        System.out.println(",with tea");
    }
}
