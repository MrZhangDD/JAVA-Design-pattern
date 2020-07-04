package com.zhang.facade;

/**
 * 模拟门面模式的细节
 */
public class DVDPalyer {
    //单例，使用饿汉式
    private static DVDPalyer instance = new DVDPalyer();
    public static DVDPalyer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd on");
    }
    public void off(){
        System.out.println("dvd off");
    }
    public void play(){
        System.out.println("dvd play");
    }
    public void pause(){
        System.out.println("dvd pause");
    }
}
