package com.zhang.factory.abstracts;

public class XiaoMiPhone implements IPhoneFactory{
    @Override
    public void call() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("小米发短信");
    }

    @Override
    public void start() {
        System.out.println("小米开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米关机");
    }
}
