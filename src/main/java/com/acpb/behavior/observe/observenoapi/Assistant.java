package com.acpb.behavior.observe.observenoapi;

public class Assistant implements Myobserver {

    @Override
    public void update(MyObservable myObservable, Object arg) {
        System.out.println("学生的属性改变了");
    }
}
