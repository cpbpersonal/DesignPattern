package com.acpb.behavior.observe.observenoapi;

public class ClientTest {
    public static void main(String[] args) {
        Student person = new Student();
        Assistant a = new Assistant();
        Assistant b = new Assistant();
        person.addObserver(a);
        person.addObserver(b);
        person.setName("joe");
        person.setAge(18);
        person.setGender("男");
    }
}
