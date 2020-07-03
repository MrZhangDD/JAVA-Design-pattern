package com.zhang.bridge;

/**
 * 抽象的电脑类型
 */
public abstract class Computer {

    //组合 protected子类继承也可以使用
    // brand相当于一个桥，电脑自带品牌之后，新加的电脑就可以选择品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info();//自带品牌信息
    }
}

class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
