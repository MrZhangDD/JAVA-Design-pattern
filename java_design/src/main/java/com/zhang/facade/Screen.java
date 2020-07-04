package com.zhang.facade;

/**
 * 模拟门面模式的细节
 */
public class Screen {
    //单例，使用饿汉式
    private static Screen instance = new Screen();
    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen up");
    }
    public void down(){
        System.out.println("Screen down");
    }
}
