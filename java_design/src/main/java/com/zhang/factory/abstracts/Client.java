package com.zhang.factory.abstracts;

public class Client {
    public static void main(String[] args) {
        System.out.println("====小米系列产品====");
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IPhoneFactory iPhoneFactory = xiaoMiFactory.iPhoneFactory();
        iPhoneFactory.call();
        iPhoneFactory.sendSms();
        iPhoneFactory.shutdown();

        IRouteFactory iRouteFactory = xiaoMiFactory.iRouteFactory();
        iRouteFactory.connect();
        iRouteFactory.openWifi();
        iRouteFactory.start();


        System.out.println("====华为系列产品====");
    }

}
