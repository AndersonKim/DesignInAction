package com.design.structural.decorator.coffce;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+10;
    }

    @Override
    public String getName() {
        return coffee.getName()+" add milk";
    }
}
