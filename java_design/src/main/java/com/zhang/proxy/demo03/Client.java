package com.zhang.proxy.demo03;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(host);
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();
    }
}
