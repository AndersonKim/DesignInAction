package com.smith.round;

import java.util.Map;
import java.util.Scanner;

/**
 * edited by AndersonKim
 * at 2018/10/16
 */
public class BaseObject {
    Integer health;
    Integer attack;
    String name;
    Map<EquipmentLocation,Item> equipment;

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseObject(Integer health, Integer attack, String name) {
        this.health = health;
        this.attack = attack;
        this.name = name;
    }

    /**
     * edit by AndersonKim
     * @Date：2018/10/30
     * @Description：
     */
    public static BaseObject attack(BaseObject player,BaseObject monster){
        while (true){
            //todo 使用策略模式重构攻击结算方式
            //get player's input
            Scanner scanner=new Scanner(System.in);
            Integer choice=scanner.nextInt();
            System.out.print("input you'r damage choice:");
            //count damage to monster
            System.out.println(player.getName()+" attack "+monster.getName()+" demage is :"+player.getAttack()*choice);
            monster.setHealth(monster.getHealth()-player.getAttack()*choice);
            if(monster.getHealth()<=0){
                System.out.println(player.getName()+" killed "+monster.getName());
                break;
            }
            //count damage to player
            System.out.println(monster.getName()+" attack "+player.getName()+" demage is :"+monster.getAttack());
            player.setHealth(player.getHealth()-monster.getAttack());
            if(player.getHealth()<=0){
                System.out.println(monster.getName()+" killed "+player.getName());
                break;
            }

        }
        return player;
    }
}
