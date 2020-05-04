package com.zhang.factory.abstracts;

/**
 * 总的工厂定了，需要各自的工厂来生产各自的东西
 */
public class XiaoMiFactory implements IProductFactory {

    @Override
    public IPhoneFactory iPhoneFactory() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouteFactory iRouteFactory() {
        return new XiaoMiRoute();
    }
}
