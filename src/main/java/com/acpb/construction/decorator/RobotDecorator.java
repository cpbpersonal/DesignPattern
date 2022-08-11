package com.acpb.construction.decorator;

public abstract class RobotDecorator implements Robot{

    private Robot robot;
    public RobotDecorator(Robot robot){
        this.robot=robot;
    }
    @Override
    public void doSomething() {
        robot.doSomething();
    }
}
