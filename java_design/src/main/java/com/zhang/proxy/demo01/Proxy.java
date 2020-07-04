package com.zhang.proxy.demo01;

public class Proxy {
    private Host host;

    public void rent(){
        fare();
        seeHouse();
        host.rent();
        write();

    }
    //看房
    public void seeHouse(){
        System.out.println("看房子");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
    //签合同
    public void write(){
        System.out.println("签合同");
    }

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }
}
