package com.acpb.behavior.observe;
import java.util.ArrayList;
import java.util.List;

public abstract class Mysubject {
    List<MyObserver> observers=new ArrayList<>();

    public  void  attach (MyObserver observer){
        observers.add(observer);
    }
    public  void  remove (MyObserver observer){
        observers.remove(observer);
    }

    public abstract void advice();

}
