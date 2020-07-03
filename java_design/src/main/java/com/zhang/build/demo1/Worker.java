package com.zhang.build.demo1;


/**
 * 具体的工人建造者
 */
public class Worker extends Builder{

    private Product product;
    //工人负责创建产品
    public Worker() {
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("A");
        System.out.println("A");
    }

    @Override
    void buildB() {
        product.setBuildB("B");
        System.out.println("B");
    }

    @Override
    void buildC() {
        product.setBuildC("C");
        System.out.println("C");
    }

    @Override
    void buildD() {
        product.setBuildD("D");
        System.out.println("D");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
