package com.zhang.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式单例
 * 双重检测锁模式，懒汉式单例，DCL懒汉式
 */
public class LazyMan04 {

    private static boolean zhang = false;
    private LazyMan04() {
        //防止反射获取对象
        synchronized (LazyMan04.class){
            if(zhang == false){
                zhang = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
    }
    //volatile保证可见性，可以防止指令重排序
    private volatile static LazyMan04 lazyMan04;

    public static LazyMan04 getInstance(){
        //双重检测锁模式，懒汉式单例，DCL懒汉式
        if(lazyMan04 == null){
            synchronized (LazyMan04.class){
                if(lazyMan04 == null){
                    lazyMan04 = new LazyMan04();
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
        return lazyMan04;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //LazyMan04 instance = LazyMan04.getInstance();
        //System.out.println(instance);
        //反射破坏单例
        /*Constructor constructor = LazyMan04.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyMan04 instance2 = (LazyMan04)constructor.newInstance();
        LazyMan04 instance3 = (LazyMan04)constructor.newInstance();
        //两个对象不是同一个
        System.out.println(instance3);
        System.out.println(instance2);
        */
        //反射破坏单例，获取属性并更改
        Constructor constructor = LazyMan04.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Field zhang = LazyMan04.class.getDeclaredField("zhang");
        zhang.setAccessible(true);
        LazyMan04 instance4 = (LazyMan04)constructor.newInstance();
        zhang.set(instance4,false);
        LazyMan04 instance5 = (LazyMan04)constructor.newInstance();
        System.out.println(instance4);
        System.out.println(instance5);
    }
}
