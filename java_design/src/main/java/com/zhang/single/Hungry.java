package com.zhang.single;

/**
 * 饿汉式单例
 * 不管用不用都加载对象，可能会浪费空间
 */
public class Hungry {

    //构造器私有
    private Hungry(){}
    private final static Hungry HUNGRY = new Hungry();
    public static Hungry getHungry(){
        return HUNGRY;
    }
}
