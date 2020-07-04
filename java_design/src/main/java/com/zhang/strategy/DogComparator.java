package com.zhang.strategy;

/**
 * 策略模式需要实现Comparator接口，传入想变化的对象
 */
public class DogComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.food > o2.food) return 1;
        else if(o1.food < o2.food) return -1;
        else return 0;
    }
}
