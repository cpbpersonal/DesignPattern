package com.acpb.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
//封装迭代

/**
 *         //在添加或移除元素时 modCount++,导致值不相同
 *        final void checkForComodification() {
 *            if (modCount != expectedModCount)
 *                 throw new ConcurrentModificationException();
 *         }
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("ab");
        stringArrayList.add("cd");
        stringArrayList.add("ef");
        stringArrayList.add("gh");
        stringArrayList.add("gh");
        stringArrayList.add("ij");
        stringArrayList.add("kl");
//        for (String s : stringArrayList) {
//            System.out.println(s);
//            if (s.equals("cd")){
//                stringArrayList.remove(s);
//            }
//        }


        Iterator<String> iterator = stringArrayList.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            if ("gh".equals(s)){
                iterator.remove();
            }
        }
        for (String s : stringArrayList) {
            System.out.println(s);
        }

    }
}
