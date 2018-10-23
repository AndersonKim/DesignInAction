package com.smith;


import java.util.Random;

/**
 * edit by AndersonKim
 * @Date：2018/10/8
 * @Description：测试主流程
 */
public class TestSmithMain {

    private int Monster;
    private int Tree;
    private int Mineral;

    public Item[] goForAdventure(Slave character, Envirement target, Weaponry tool){

        //1.init target monster / tree / mineral
        Slave[] adv_objs=GameBuilder.initSlaveByCharAndTool(character,tool);

        //2.character get materials from local things
        for (Object obj:adv_objs) {
            character.haverst(adv_objs);
        }

        //3.return by hand



        Item[] objs=new Item[Monster*3+Tree*3+Mineral*3];
        return objs;
    }
}
