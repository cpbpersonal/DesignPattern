package com.acpb.construction.Share;

import java.util.HashSet;
import java.util.Set;
/**
 * @author 22106
 */ //享元对象池，负责维护享元对象。通过池技术 复用相同对象，极大的节约系统资源
//享元对象的内外状态分离，外部状态客户端指定，内部状态自己维护
public class FlyWeightFactory {

    private static FlyWeightFactory instance=new FlyWeightFactory();
      private Set<BikeFlyWeight> pool=new HashSet<>();
    public static FlyWeightFactory getFactory(){
        return instance;
    }

    private FlyWeightFactory (){

        for (int i=0; i<3;i++){
            pool.add(new MobikeFlyWeight(i));
        }
    }

    public BikeFlyWeight getBike(){
        for (BikeFlyWeight bike : pool){
           if (bike.getState()==0){
               return bike;
           }
        }
        return null;
    }
}

