package com.zhang.build.demo1;

/**
 * 抽象的一个建造者，定义一些方法和接口
 */

public abstract class Builder {
    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    //完工
    abstract Product getProduct();

}
