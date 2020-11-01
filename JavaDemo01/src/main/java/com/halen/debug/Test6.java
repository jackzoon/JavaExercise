package com.halen.debug;

public class Test6 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            execute(i);
        }
    }

    private static void execute(int num) {
        int rs = ((num + 3) * 5 + 9) / num;
        System.out.println(rs);
    }
}
