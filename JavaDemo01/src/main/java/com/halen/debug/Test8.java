package com.halen.debug;

public class Test8 {

    public static void main(String[] args) {
        Box box = new Box();
        Producer producer = new Producer(box);
        Consumer consumer = new Consumer(box);

        Thread t1 = new Thread(producer, "生产者");
        Thread t2 = new Thread(consumer, "消费者");

        t1.start();
        t2.start();
    }

}
