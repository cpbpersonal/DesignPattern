package com.acpb.behavior.observe.observeapi;

import java.util.Observable;

public class Cat extends Observable {

   public void speak(){
       System.out.println("miao miao miao");
       this.setChanged();
       this.notifyObservers();
   }
}
