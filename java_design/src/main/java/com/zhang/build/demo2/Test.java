package com.zhang.build.demo2;

public class Test {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.getProduct();
        //不设置则有默认值
        product.setBuildA("可口可乐");
        System.out.println(product);
    }
}
