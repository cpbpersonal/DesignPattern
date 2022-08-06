package com.acpb.create.factory;


//简单工厂模式，根据类型直接创建出对应的对象。
public class SimpleFactory {
    public static void main(String[] args) {
        DoorFactory doorFactory = new DoorFactory();
        Door woodDoor = doorFactory.getDoor(10.0f, 20.0f, "WoodDoor");
        Door IronDoor = doorFactory.getDoor(8.0f, 15.0f, "IronDoor");
        System.out.println(woodDoor.gethigh());
        System.out.println(IronDoor.gethigh());

    }


}
class DoorFactory{
   public DoorFactory(){
    }
    public Door getDoor(float width,float high,String type){
        if (type=="WoodDoor"){
            return new WoodDoor(width,high);
        }else if (type=="IronDoor"){
            return new IronDoor(width, high);
        }else {
            return null;
        }
    }
}

interface Door{
    public float getwidth();
    public  float gethigh();
}
class WoodDoor implements Door{
    private float width;
    private float high;

    public WoodDoor(float width, float high) {
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
}
class IronDoor implements Door{
    private float width;
    private float high;

    public IronDoor(float width, float high) {
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
}
