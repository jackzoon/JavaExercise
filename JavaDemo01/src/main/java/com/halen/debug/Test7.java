package com.halen.debug;

public class Test7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "张三");
        Thread t2 = new Thread(new MyRunnable(), "李四");
        Thread t3 = new Thread(new MyRunnable(), "王五");
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "______进入");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "______退出");
    }
}
