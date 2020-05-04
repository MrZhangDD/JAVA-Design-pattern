package com.zhang.build.demo2;

/**
 * 套餐
 */
public class Product {

    private String BuildA = "汉堡";
    private String BuildB = "薯条";
    private String BuildC = "可乐";
    private String BuildD = "甜品";

    public void setBuildA(String buildA) {
        BuildA = buildA;
    }

    public void setBuildB(String buildB) {
        BuildB = buildB;
    }

    public void setBuildC(String buildC) {
        BuildC = buildC;
    }

    public void setBuildD(String buildD) {
        BuildD = buildD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "BuildA='" + BuildA + '\'' +
                ", BuildB='" + BuildB + '\'' +
                ", BuildC='" + BuildC + '\'' +
                ", BuildD='" + BuildD + '\'' +
                '}';
    }
}
