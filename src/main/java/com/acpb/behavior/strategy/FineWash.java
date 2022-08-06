package com.acpb.behavior.strategy;

public class FineWash implements WashMethod {

    @Override
    public void wash(Cloth cloth) {
        System.out.println("精洗----");
        cloth.setStatus(true);
    }
}
