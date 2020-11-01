package com.halen.debug;

public class Box {
    private int milk;
    private boolean state = false;

    public void put(int milk) {
        System.out.println("put begin");
        synchronized (this) {
            if (state) {
                try {
                    System.out.println("put wait");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("put wait end");
            }
            this.milk = milk;
            System.out.println("送奶工将第" + this.milk + "瓶牛奶送出");
            this.state = true;
            notifyAll();
        }
        System.out.println("put end");
    }

    public void get() {
        System.out.println("get begin");
        synchronized (this) {
            if (!state) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("用户拿到第" + this.milk + "瓶牛奶");
            this.state = false;
            notifyAll();
        }
    }
}
