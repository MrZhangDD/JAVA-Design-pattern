package com.zhang.factory.factorymethod;

/**
 * 提供一个工厂接口，所有类型的汽车都可以实现这个接口而单独造汽车
 */
public interface CarFactory {
    public Car getCar();
}
