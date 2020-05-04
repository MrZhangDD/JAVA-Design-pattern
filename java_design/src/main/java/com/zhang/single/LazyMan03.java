package com.zhang.single;

/**
 * 懒汉式单例
 * 双重检测锁模式，懒汉式单例，DCL懒汉式
 */
public class LazyMan03 {

    private LazyMan03() {
        System.out.println(Thread.currentThread().getName());
    }
    //volatile保证可见性，可以防止指令重排序
    private volatile static LazyMan03 lazyMan02;

    public static LazyMan03 getInstance(){
        //双重检测锁模式，懒汉式单例，DCL懒汉式
        if(lazyMan02 == null){
            synchronized (LazyMan03.class){
                if(lazyMan02 == null){
                    lazyMan02 = new LazyMan03();
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
                LazyMan03.getInstance();
            }).start();
        }
    }
}
