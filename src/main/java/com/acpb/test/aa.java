package com.acpb.test;

public class aa {
    public static void main(String[] args) {
        String s = new String("aaa");
        s="b";
        s+="a";
        System.out.println(s);
     Person p=new Person();
        System.out.println(p);
        fun(p);
        System.out.println(p);
    }

    public static void fun(Person person){
       person=new Person();

    }
}
