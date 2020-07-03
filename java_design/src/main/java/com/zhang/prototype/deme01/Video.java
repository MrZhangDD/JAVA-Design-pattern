package com.zhang.prototype.deme01;

import java.util.Date;

/**
 * 原型模式
 * 1.实现一个接口，Cloneable
 * 2.重写一个方法clone()
 */
public class Video implements Cloneable{
    private String name;
    private Date date;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        //todo 克隆属性然后重新赋值给克隆后的对象  springfremark自带的属性克隆为深度克隆
        Video video = (Video) obj;
        video.date = (Date) this.date.clone();
        return obj;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Video() {

    }
}
