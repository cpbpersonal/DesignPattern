package com.acpb.behavior.observe.observeapi;

import java.util.Observable;
import java.util.Observer;

public class Mouse implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("老鼠跑了");
    }
}
