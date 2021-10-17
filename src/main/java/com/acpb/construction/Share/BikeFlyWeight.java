package com.acpb.construction.Share;

abstract class BikeFlyWeight {
    //内部状态,0未使用，1使用中
    protected  int state=0;
    //外部状态
    public  abstract void  ride(String username);
    public abstract void back();
    public Integer getState(){
        return state;
    }
}


