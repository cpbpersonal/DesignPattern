package com.acpb.construction.decorator;

public class CleanDecorator extends RobotDecorator{


    public CleanDecorator(Robot robot) {
        super(robot);
    }
    @Override
    public void doSomething() {
        super.doSomething();
    }
    public void doMoreSomething(){
        this.doSomething();
        System.out.println("我会扫地");
    }
}
