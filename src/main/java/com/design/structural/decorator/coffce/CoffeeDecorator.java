package com.design.structural.decorator.coffce;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
