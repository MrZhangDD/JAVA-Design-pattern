package com.zhang.factory.factorymethod;

/**
 * 实际的调用类只需要调用工厂即可
 */
public class Consumer {
    public static void main(String[] args) {
        Car c1 = new TeslaFactory().getCar();
        Car c2 = new WulingFactory().getCar();
        Car c3 = new MoBaiFactory().getCar();
        c1.name();
        c2.name();
        c3.name();
    }
}
