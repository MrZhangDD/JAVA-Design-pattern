package com.zhang.build.demo2;

public class Test {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.getProduct();
        product.setBuildA("可乐");
        System.out.println(product);
    }
}
