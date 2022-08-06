package com.acpb.behavior.strategy;

/**
 * @author 22106
 */
public class WashingMachine {

    public void WashCloth(Cloth cloth ,WashMethod washMethod){
        washMethod.wash(cloth);
        System.out.println("洗完了--衣服状态=="+cloth.getStatus());
    }
}
