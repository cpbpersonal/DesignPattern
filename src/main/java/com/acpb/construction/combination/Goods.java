package com.acpb.construction.combination;


public class Goods implements Articles {
    private String name;
    private int num;
    private float price;

    public Goods(String name, int num, float price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }


    @Override
    public float calculate() {
        return num*price;
    }

    @Override
    public void show() {
        System.out.println("商品名:"+name+"数量:"+num+"价格:"+price);
    }
}
