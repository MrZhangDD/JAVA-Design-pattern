package com.zhang.flyweight;

/**
 * 测试享元模式
 */
public class Cilent {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("汤姆"));

        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("吉米"));

        WebSite webSite3 = webSiteFactory.getWebSiteCategory("新闻");
        webSite3.use(new User("汤姆"));
        System.out.println(webSiteFactory.getWebSiteCount());
    }


}
