package com.design.structural.decorator.teapot;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class SugarDecorator extends DrinkDecorator {
    public SugarDecorator(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }

    @Override
    public void operation() {
        drinkComponent.operation();
        System.out.println(",with sugar");
    }
}
