package com.zhang.prototype.deme01;

import java.util.Date;

/**
 * 客户端模拟克隆
 */
public class BiLiBiLi {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("张", date);
        System.out.println("v1=>"+v1);
        System.out.println("v1=hashCode>"+v1.hashCode());
        Video v2 = (Video) v1.clone();

        System.out.println("v2=>"+v2);
        System.out.println("v2=hashCode>"+v2.hashCode());
        System.out.println("======================");
        //由于克隆的对象和原对象指向的时间地址是同一个，所以更改时间之后两个都会变化
        //如果想保证克隆后的对象不进行改变则需要修改clone方法
        date.setTime(41584545);
        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);

    }
}
