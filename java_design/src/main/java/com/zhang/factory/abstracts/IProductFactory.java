package com.zhang.factory.abstracts;

/**
 * 抽象产品工厂，生产手机和路由器，总的一个产品工厂
 */
public interface IProductFactory {
    IPhoneFactory iPhoneFactory();
    IRouteFactory iRouteFactory();
}
