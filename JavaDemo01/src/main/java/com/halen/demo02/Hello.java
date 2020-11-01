package com.halen.demo02;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("hello");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
