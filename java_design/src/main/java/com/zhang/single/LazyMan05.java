package com.zhang.single;

/**
 * 静态内部类
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
