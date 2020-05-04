package com.zhang.single;

/**
 * 懒汉式单例
 * 双重检测锁模式，懒汉式单例，DCL懒汉式
 */
public class LazyMan02 {

    private LazyMan02() {
        System.out.println(Thread.currentThread().getName());
    }
    private static LazyMan02 lazyMan02;

    public static LazyMan02 getInstance(){
        //双重检测锁模式，懒汉式单例，DCL懒汉式
        if(lazyMan02 == null){
            synchronized (LazyMan02.class){
                if(lazyMan02 == null){
                    lazyMan02 = new LazyMan02();
                    //不是原子性操作
                    /*
                    1.分配内存空间
                    2.执行构造方法，初始化对象
                    3.把这个对象只想这个空间
                    指令重排之后可能顺序错乱，会出现问题，导致先指向了地址，导致return的null
                     */
                }
            }
        }
        return lazyMan02;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyMan02.getInstance();
            }).start();
        }
    }
}
