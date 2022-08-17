package com.acpb.construction.bridge;

public abstract class Actor {
    private Performance performance;

    public Actor(Performance performance){
        this.performance=performance;
    }
    public void show(){
        performance.preform();
    }

}
