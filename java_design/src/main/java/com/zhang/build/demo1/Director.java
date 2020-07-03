package com.zhang.build.demo1;

/**
 * 指挥，负责构建一个工程，工程如何构建由它决定
 * 构建顺序及构建的步骤都由Director决定
 */
public class Director {

    //指挥工人盖房子
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }

}
