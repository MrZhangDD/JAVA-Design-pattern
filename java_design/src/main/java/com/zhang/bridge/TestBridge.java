package com.zhang.bridge;

public class TestBridge {
    public static void main(String[] args) {
        //目标  苹果笔记本  联想台式机
        Laptop laptop = new Laptop(new Phone());
        laptop.info();

        Desktop desktop = new Desktop(new Lenovo());
        desktop.info();
    }
}
