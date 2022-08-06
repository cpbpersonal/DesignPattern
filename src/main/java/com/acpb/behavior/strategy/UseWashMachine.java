package com.acpb.behavior.strategy;

/**
 * 多种算法单独封装起来实现共同的接口,其他对象或方法将此接口作为成员变量或参数使用
 * 通过更换不同的算法来完成工作。
 */
public class UseWashMachine {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        Cloth cloth = new Cloth(false);
        washingMachine.WashCloth(cloth,new FastWash());
    }
}
