package com.zhang.single;

/**
 * 最完美的单例，可以解决线程同步和反序列化问题
 * 枚举类没有构造方法所以不会被反序列化
 */
public enum LazyMan06 {
    INSTANCE;
    public void m(){};
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(LazyMan06.INSTANCE.hashCode());
            }).start();

        }
    }
}
