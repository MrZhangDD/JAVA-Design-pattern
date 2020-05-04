/*
// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EnumSingle.java

package org.example;

import java.io.PrintStream;
import java.lang.reflect.Constructor;

*/
/**
 * 反编译之后的文件
 * jad工具，jad -s.java EnumSingle.class
 *//*

public final class EnumSingle extends Enum
{

    public static EnumSingle[] values()
    {
        return (EnumSingle[])$VALUES.clone();
    }

    public static EnumSingle valueOf(String name)
    {
        return (EnumSingle)Enum.valueOf(com/zhang/single/EnumSingle, name);
    }

    private EnumSingle(String s, int i)
    {
        super(s, i);
    }

    public EnumSingle getInstance()
    {
        return INSTANCE;
    }

    public static void main(String args[])
        throws Exception
    {
        EnumSingle instance = INSTANCE;
        Constructor constructor = com/zhang/single/EnumSingle.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        EnumSingle instance2 = (EnumSingle)constructor.newInstance(new Object[0]);
        System.out.println(instance);
        System.out.println(instance2);
    }

    public static final EnumSingle INSTANCE;
    private static final EnumSingle $VALUES[];

    static 
    {
        INSTANCE = new EnumSingle("INSTANCE", 0);
        $VALUES = (new EnumSingle[] {
            INSTANCE
        });
    }
}
*/
