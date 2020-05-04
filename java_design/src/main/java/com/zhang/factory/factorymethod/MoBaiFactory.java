package com.zhang.factory.factorymethod;

public class MoBaiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
