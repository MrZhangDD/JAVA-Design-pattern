package com.zhang.factory.abstracts;

public class HuaWeiRoute implements IRouteFactory{
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器开wifi");
    }

    @Override
    public void connect() {
        System.out.println("华为路由器链接");
    }
}
