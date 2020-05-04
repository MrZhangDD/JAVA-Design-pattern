package com.zhang.adapterdesign;
//真正的适配器，需要连接usb，连接网线

//组合，对象适配器,注入另一个对象
public class Adapter2 implements NetUsb{

    private NetLine netLine;
    public Adapter2(NetLine netLine) {
        this.netLine = netLine;
    }

    @Override
    public void handleRequest() {
        netLine.netSuf();
    }
}
