package com.zhang.single;

/**
 * 懒汉式单例
 * 单线程ok
 */
public class LazyMan01 {

    private LazyMan01() {
        System.out.println(Thread.currentThread().getName());
    }
    private static LazyMan01 lazyMan01;

    public static LazyMan01 getInstance(){
        if(lazyMan01 == null){
            lazyMan01 = new LazyMan01();
        }
        return lazyMan01;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyMan01.getInstance();
            }).start();
        }
    }
}
