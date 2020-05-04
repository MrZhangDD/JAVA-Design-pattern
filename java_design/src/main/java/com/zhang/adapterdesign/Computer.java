package com.zhang.adapterdesign;

//电脑向上网，需要网线，接口转换器
public class Computer {
    public void net(NetUsb adapter){
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        //第一种：适配器继承网线
        //Adapter adapter = new Adapter();
        //computer.net(adapter);
        //第二种，网线连接适配器
        NetLine netLine = new NetLine();
        Adapter2 adapter2 = new Adapter2(netLine);
        computer.net(adapter2);
    }
}
