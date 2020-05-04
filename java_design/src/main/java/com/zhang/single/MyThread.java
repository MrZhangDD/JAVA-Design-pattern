package com.zhang.single;

public class MyThread {
    public static int i =0;
    public static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    flag = true;
                    System.out.println("flag == true");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        while (!flag){
            synchronized (MyThread.class){
                i++;
            }



        }
        System.out.println("i=="+i);
    }

}
