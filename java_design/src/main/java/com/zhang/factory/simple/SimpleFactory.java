package com.zhang.factory.simple;


/**
 * 简单工厂模式也叫静态工厂模式
 * 若新加汽车需要更改代码
 * 不符合OOP开闭原则，所以还有更好的办法及工厂方法模式
 */
public class SimpleFactory{

    public static Car getCar(String name){
        if(name.equals("五菱")){
            return new Wuling();
        } else if(name.equals("特斯拉")){
            return new Tesla();
        } else {
            return null;
        }
    }
}
