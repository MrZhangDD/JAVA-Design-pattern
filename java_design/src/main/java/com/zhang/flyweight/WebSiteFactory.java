package com.zhang.flyweight;

import java.util.HashMap;

/**
 * 网站工厂类
 * 根据需求返回一个网站
 */
public class WebSiteFactory {
    //集合，充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站类型，返回一个网站，如果没有则创建一个放入池中，并且返回
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    //池中数量
    public int getWebSiteCount(){
        return pool.size();
    }
}
