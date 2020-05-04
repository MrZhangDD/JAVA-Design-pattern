package com.zhang.factory.simple;

public class SimpleTest {

    public static void main(String[] args) {
       /* 不去直接new对象，而是通过工厂模式的方法
       Tesla c1 = new Tesla();
        Wuling c2 = new Wuling();
        */
        Car c1 = SimpleFactory.getCar("五菱");
        Car c2 = SimpleFactory.getCar("特斯拉");
        c1.name();
        c2.name();

    }
}
