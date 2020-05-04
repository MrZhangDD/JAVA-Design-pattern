package com.zhang.build.demo1;

public class Test {

    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build);
    }
}
