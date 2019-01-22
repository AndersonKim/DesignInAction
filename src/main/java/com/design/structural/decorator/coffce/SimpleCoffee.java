package com.design.structural.decorator.coffce;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class SimpleCoffee extends Coffee {
    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public String getName() {
        return " simple coffee ";
    }
}
