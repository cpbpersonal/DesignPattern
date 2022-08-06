package com.acpb.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
//        for (Object item : list) {
//            if (item.equals("3")) {
//                System.out.println(item);
//                list.remove(item);
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)=="3"){
                list.remove("3");
            }
        }
        System.out.println(list.get(3));
        System.out.println(list.size());

    }
}
