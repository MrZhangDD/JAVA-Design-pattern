package com.zhang.facade;

/**
 * 模拟门面模式的细节
 */
public class Stereo {
    //单例，使用饿汉式
    private static Stereo instance = new Stereo();
    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }
    public void off(){
        System.out.println("Stereo off");
    }
    public void up(){
        System.out.println("Stereo up");
    }
    public void down(){
        System.out.println("Stereo down");
    }
}
