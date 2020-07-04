package com.zhang.facade;

/**
 * 模拟门面模式的细节  灯光
 */
public class TheaterLight {
    //单例，使用饿汉式
    private static TheaterLight instance = new TheaterLight();
    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }
    public void off(){
        System.out.println("TheaterLight off");
    }
    public void dim(){
        System.out.println("TheaterLight dim");
    }
    public void bright(){
        System.out.println("TheaterLight bright");
    }
}
