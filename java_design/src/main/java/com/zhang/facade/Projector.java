package com.zhang.facade;

/**
 * 投影仪
 */
public class Projector {
    //单例，使用饿汉式
    private static Projector instance = new Projector();
    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
    public void facus(){
        System.out.println("Projector facus");
    }

}
