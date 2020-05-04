package com.zhang.adapterdesign;
//真正的适配器，需要连接usb，连接网线

//继承，类适配器
public class Adapter extends NetLine implements NetUsb{
    @Override
    public void handleRequest() {
        super.netSuf();
    }
}
