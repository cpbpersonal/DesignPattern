package com.acpb.behavior.observe;

public class Dog implements MyObserver {
    @Override
    public void response() {
        System.out.println("汪汪汪");
    }
}
