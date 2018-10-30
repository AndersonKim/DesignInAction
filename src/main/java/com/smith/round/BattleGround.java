package com.smith.round;

import java.util.Scanner;

/**
 * edited by AndersonKim
 * at 2018/10/30
 */
public class BattleGround {

    /**
     * edit by AndersonKim
     * @Date：2018/10/30
     * @Description：
     */
    public static Player battleWithMonster(Player player,Monster monster){
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
