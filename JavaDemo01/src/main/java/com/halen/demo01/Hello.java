package com.halen.demo01;

public class Hello {
    private static int i = 1;

    public static void main(String[] args) {
        staticClass.print();
    }

    static class staticClass{
        public static void print() {
            System.out.println(i);
        }
    }
}
