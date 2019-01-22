package com.design.structural.decorator.teapot;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class DrinkDecorator implements DrinkComponent {

    DrinkComponent drinkComponent;

    public DrinkDecorator(DrinkComponent drinkComponent) {
        this.drinkComponent = drinkComponent;
    }

    @Override
    public void operation() {

    }
}
