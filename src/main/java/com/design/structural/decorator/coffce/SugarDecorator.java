package com.design.structural.decorator.coffce;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+11;
    }

    @Override
    public String getName() {
        return coffee.getName()+" add sugar";
    }
}
