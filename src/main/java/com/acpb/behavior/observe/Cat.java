package com.acpb.behavior.observe;

public class Cat extends Mysubject {
    @Override
    public void advice() {
        System.out.println("miao miao miao ...");

        for(MyObserver obs:observers){
            obs.response();
        }
    }

}
