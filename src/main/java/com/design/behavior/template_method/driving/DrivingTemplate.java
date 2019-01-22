package com.design.behavior.template_method.driving;

/**
 * edited by AndersonKim
 * at 2019/1/22
 */
public abstract class DrivingTemplate {
    public final void drive() {
        start();
        if (music()) {
            mp3();
        }
        stop();
    }

    protected abstract boolean music();

    protected final void start(){
        System.out.println("start");
    }

    protected final void stop(){
        System.out.println("stop");
    }


    protected final void mp3(){
        System.out.println("music is loud");
    }
}
