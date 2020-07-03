package com.zhang.build.demo1;

/**
 * 抽象的一个建造者，定义一些方法和接口
 */

public abstract class Builder {
    abstract void buildA(); //地基
    abstract void buildB(); //钢筋
    abstract void buildC(); //铺电线
    abstract void buildD(); //粉刷

    //完工
    abstract Product getProduct();

}
