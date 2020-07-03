package com.zhang.build.demo2;

//抽象的建造者
public abstract class Builder {

    abstract Builder builderA(String msg);
    abstract Builder builderB(String msg);
    abstract Builder builderC(String msg);
    abstract Builder builderD(String msg);

    abstract Product getProduct();
}
