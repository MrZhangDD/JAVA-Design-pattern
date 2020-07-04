package com.zhang.facade;

/**
 * 模拟调用每个设备，通过门面模式联系
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.paly();
        homeTheaterFacade.end();

    }

}
