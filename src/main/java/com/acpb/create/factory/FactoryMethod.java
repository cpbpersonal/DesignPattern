package com.acpb.create.factory;

/**
 * 工厂方法
 */
public class FactoryMethod {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        woodenDoorFactory.install();

    }
}

abstract class Factory{

    public abstract DoorM getDoor ();

    public void install(){
        DoorM door = this.getDoor();
        door.description();
        System.out.println("开始安装");
    }

}
class WoodenDoorFactory extends Factory{

    @Override
    public DoorM getDoor() {
        return new WoodDoorM();
    }
}
class IronDoorFactory extends Factory{

    @Override
    public DoorM getDoor() {
        return new IronDoorM();
    }
}


interface DoorM{
    public float getwidth();
    public  float gethigh();
    void description();
}
class WoodDoorM implements DoorM{
    private float width;
    private float high;

    public WoodDoorM() {
    }

    public WoodDoorM(float width, float high) {
        this.width = width;
        this.high = high;
    }

    @Override
    public float getwidth() {
        return this.width;
    }

    @Override
    public float gethigh() {
        return this.high;
    }

    @Override
    public void description() {
        System.out.println("这是木门");
    }
}
class IronDoorM implements DoorM {
    private float width;
    private float high;

    public IronDoorM(float width, float high) {
        this.width = width;
        this.high = high;
    }

    public IronDoorM() {

    }

    @Override
    public float getwidth() {
        return this.width;
    }

    @Override
    public float gethigh() {
        return this.high;
    }

    @Override
    public void description() {
        System.out.println("这是铁门");
    }
}
