package com.acpb.create.prototype;

/**
 * @author
 * 原型模式
 *某一对象的构造在内部完成,不对外提供操作方法
 * 自己内部实现克隆，创造出相同的对象
 */
interface Clone{
    Object clone();
}
public class Plane implements Clone{
    private String name;
    private String type;

    public Plane() {
        this.name=Math.random()+"fly";
        this.type=Math.random()+"Air";
    }

    public Plane(Plane plane) {
        this.name=plane.name;
        this.type=plane.type;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
     @Override
     public Object clone(){
        return new Plane(this);
    }
}
class UseClone{
    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane clonePlane = (Plane)plane.clone();
        System.out.println(plane.getName()+plane.getType());
        System.out.println(clonePlane.getName()+clonePlane.getType());
        System.out.println(plane==clonePlane);
    }
}

