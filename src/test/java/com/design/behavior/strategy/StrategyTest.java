package com.design.behavior.strategy;

import com.design.behavior.strategy.comparator.CompareItem;
import com.design.behavior.strategy.comparator.CompareItemNameComparator;
import com.design.behavior.strategy.comparator.CompareItemNumComparator;
import com.design.behavior.strategy.prototype.Context;
import com.design.behavior.strategy.prototype.StrategyA;
import com.design.behavior.strategy.prototype.StrategyB;
import com.design.behavior.strategy.ywcode.*;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrategyTest {

    @Test
    public void testProtoTypeStrategy(){
        Context context=new Context(new StrategyA());
        context.strategyInterface();

        context.setStrategy(new StrategyB());
        context.strategyInterface();
    }

    @Test
    public void testComparatorStrategy(){
        CompareItem a=new CompareItem(1,"A");
        CompareItem b=new CompareItem(9,"1B");

        CompareItem[] items={a,b};
        Arrays.sort(items,new CompareItemNumComparator());

        List<CompareItem> compareItemList=new ArrayList<>();
        compareItemList.add(a);
        compareItemList.add(b);
        Collections.sort(compareItemList,new CompareItemNameComparator());
    }

    @Test
    public void testYwCodeStategy(){
        ServiceContext serviceContext=new ServiceContext(new NormalPortalServer());
        PortalServer enc=new EncPortalServer();
        PortalServer bst=new BSTPortalServer();

        serviceContext.loginService("login");
        serviceContext.registerService("register");

        serviceContext.setPortalServer(enc);
        serviceContext.loginService("login");
        serviceContext.registerService("register");

        serviceContext.setPortalServer(bst);
        serviceContext.loginService("login");
        serviceContext.registerService("register");
    }


}
