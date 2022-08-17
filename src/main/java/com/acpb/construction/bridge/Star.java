package com.acpb.construction.bridge;

public class Star extends Actor{
    private String name;
    public Star(Performance performance,String name) {
        super(performance);
        this.name=name;
    }
    public void StarShow(){
        System.out.println(name);
        this.show();
    }
}
