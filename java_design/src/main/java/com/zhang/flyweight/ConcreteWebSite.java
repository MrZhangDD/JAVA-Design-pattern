package com.zhang.flyweight;

//具体的网站
public class ConcreteWebSite extends WebSite{
    private String type = ""; //网站发布形式

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站使用的发布形式为："+ type +", " + user +" 使用中 ...");
    }
}
