package com.zhang.single;

import java.lang.reflect.Constructor;

/**
 * 枚举
 */
public enum EnumSingle {
    INSTANCE;
    public EnumSingle getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        EnumSingle instance = EnumSingle.INSTANCE;
        Constructor constructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumSingle instance2 = (EnumSingle)constructor.newInstance();

        System.out.println(instance);
        System.out.println(instance2);

    }
}
