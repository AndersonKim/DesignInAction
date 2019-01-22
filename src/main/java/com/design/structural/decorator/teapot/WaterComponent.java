package com.design.structural.decorator.teapot;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class WaterComponent implements DrinkComponent{
    @Override
    public void operation() {
        System.out.println("drink water");
    }
}
