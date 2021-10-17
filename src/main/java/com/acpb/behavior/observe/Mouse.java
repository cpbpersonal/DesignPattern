package com.acpb.behavior.observe;

public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("the mouse run");
    }
}
