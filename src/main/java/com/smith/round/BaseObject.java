package com.smith.round;

/**
 * edited by AndersonKim
 * at 2018/10/16
 */
public class BaseObject {
    Integer health;
    Integer attack;
    String name;

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
}
