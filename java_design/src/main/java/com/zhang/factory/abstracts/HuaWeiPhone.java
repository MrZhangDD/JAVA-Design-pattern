package com.zhang.factory.abstracts;

public class HuaWeiPhone implements IPhoneFactory{
    @Override
    public void call() {
        System.out.println("华为打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("华为发短信");
    }

    @Override
    public void start() {
        System.out.println("华为开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关机");
    }
}
