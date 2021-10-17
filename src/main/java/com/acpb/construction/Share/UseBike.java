package com.acpb.construction.Share;

public class UseBike {

    public static void main(String[] args) {

        BikeFlyWeight bike1 = FlyWeightFactory.getFactory().getBike();
        bike1.ride("张三");

        BikeFlyWeight bike2 = FlyWeightFactory.getFactory().getBike();
        bike2.ride("李四");

        BikeFlyWeight bike3 = FlyWeightFactory.getFactory().getBike();
        bike3.ride("王五");
        bike3.back();//王五归还自行车，二狗和王五使用的是同一辆

        BikeFlyWeight bike4 = FlyWeightFactory.getFactory().getBike();
        bike4.ride("二狗");

        System.out.println(bike3==bike4);
    }
}
