package com.acpb.construction.Share;

public class MobikeFlyWeight extends BikeFlyWeight{
    private Integer bikecode;
    MobikeFlyWeight (Integer bikecode){
        this.bikecode=bikecode;
    }

    @Override
    public void ride(String username) {
        state=1;
        System.out.println(username+"正在使用"+bikecode+"自行车");
    }

    @Override
    public void back() {
        state=0;
    }
}
