package com.acpb.construction.decorator;

public class CookieDecorator extends RobotDecorator{

    public CookieDecorator(Robot robot) {
        super(robot);
    }
    @Override
    public void doSomething() {
        super.doSomething();
    }
    public void doMoreSomething(){
        this.doSomething();
        System.out.println("我会做饭");
    }
}
