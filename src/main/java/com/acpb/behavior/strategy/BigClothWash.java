package com.acpb.behavior.strategy;

public class BigClothWash implements WashMethod{

    @Override
    public void wash(Cloth cloth) {
        System.out.println("大物洗----");
        cloth.setStatus(true);
    }
}
