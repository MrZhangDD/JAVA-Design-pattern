package com.zhang.proxy.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //host.rent();
        //找代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
