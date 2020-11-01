package com.halen.debug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {
         System.out.println("begin....");
        operatorList();
        System.out.println("end...");
    }

    public static void operatorList() {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if ("王五".equals(name)) {
                list.add("赵六");
            }
        }
    }

}
