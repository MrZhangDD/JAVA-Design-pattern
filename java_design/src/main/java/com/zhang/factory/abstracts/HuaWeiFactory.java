package com.zhang.factory.abstracts;

public class HuaWeiFactory implements IProductFactory {

    @Override
    public IPhoneFactory iPhoneFactory() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouteFactory iRouteFactory() {
        return new HuaWeiRoute();
    }
}
