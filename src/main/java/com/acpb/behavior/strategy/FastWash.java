package com.acpb.behavior.strategy;

public class FastWash implements WashMethod{
    @Override
    public void wash(Cloth cloth) {
        System.out.println("快速洗----");
        cloth.setStatus(true);
    }
}
