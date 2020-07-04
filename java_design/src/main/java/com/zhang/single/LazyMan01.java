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
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lazyMan01 = new LazyMan01();
        }
        return lazyMan01;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(LazyMan01.getInstance().hashCode());
            }).start();
        }
    }
}
