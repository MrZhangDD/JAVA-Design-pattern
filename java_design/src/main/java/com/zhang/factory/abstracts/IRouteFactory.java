package com.zhang.factory.abstracts;

/**
 * 路由器工厂
 */
public interface IRouteFactory {
    void start();
    void shutdown();
    void openWifi();
    void connect();
}
