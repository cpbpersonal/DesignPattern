package com.acpb.behavior.observe.observeapi;


import java.util.Observable;
import java.util.Observer;

public class Dog implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("汪汪汪 ... ");
    }
}
