package com.smith;


import com.smith.round.BattleGround;
import com.smith.round.Monster;
import com.smith.round.Player;

import java.util.Random;

/**
 * edit by AndersonKim
 * @Date：2018/10/8
 * @Description：测试主流程
 */
public class TestSmithMain {

    public static void main(String args[]){
        Player p=new Player(10,1,"tom");
        Monster m=new Monster(10,1,"jack");
        BattleGround.battleWithMonster(p,m);
    }
}
