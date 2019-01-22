package com.design.structural;

import com.design.structural.decorator.coffce.Coffee;
import com.design.structural.decorator.coffce.MilkDecorator;
import com.design.structural.decorator.coffce.SimpleCoffee;
import com.design.structural.decorator.coffce.SugarDecorator;
import com.design.structural.decorator.prototype.Component;
import com.design.structural.decorator.prototype.ConcreteComponent;
import com.design.structural.decorator.prototype.ConcreteDecoratorA;
import com.design.structural.decorator.prototype.ConcreteDecoratorB;
import com.design.structural.decorator.teapot.TeaDecorator;
import com.design.structural.decorator.teapot.WaterComponent;
import org.junit.Test;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public class DecoratorTest {
    @Test
    public void testCoffee(){
        Coffee coffee=new SimpleCoffee();
        MilkDecorator milkDecorator=new MilkDecorator(coffee);
        SugarDecorator sugarDecorator=new SugarDecorator(coffee);

        //之调用了其中一个装饰器
        displayInfo(milkDecorator);
        displayInfo(sugarDecorator);
        //调用了多个装饰器：这里的m1,m2,s1都可以替换为coffee从而可能混淆
        //即使是使用了coffee这个对象，编译器依然知道对应的是哪一个类
        MilkDecorator m1=new MilkDecorator(coffee);
        MilkDecorator m2=new MilkDecorator(m1);
        SugarDecorator s1=new SugarDecorator(m2);
        displayInfo(s1);

    }

    @Test
    public void testWater(){
        WaterComponent water=new WaterComponent();
        com.design.structural.decorator.teapot.SugarDecorator sugar =new com.design.structural.decorator.teapot.SugarDecorator(water);
        TeaDecorator tea=new TeaDecorator(sugar);
        tea.operation();
    }


    @Test
    public void testPrototype(){
        Component component=new ConcreteComponent();
        component.operation();
        component=new ConcreteDecoratorA(component);
        component.operation();
        component=new ConcreteDecoratorB(component);
        component.operation();
    }

    public void displayInfo(Coffee coffee){
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());
    }
}
