package com.zhang.single;

/**
 * 静态内部类
 * 初始化的时候类只加载一次，静态内部类调用的时候也只加载一次
 */
public class LazyMan05 {

    private LazyMan05(){}
    public static LazyMan05 getInstance(){
        return InnerClass.LAZY_MAN_05;
    }
    public static class InnerClass{
        private static final LazyMan05 LAZY_MAN_05 = new LazyMan05();
    }
}
