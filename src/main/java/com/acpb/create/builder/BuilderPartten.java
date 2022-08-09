package com.acpb.create.builder;

import lombok.Data;

/**
 * 面对复杂对象时,无法提供全部的构造器参数
 * 可以通过创建者模式逐步生成
 */
public class BuilderPartten {
    House house=new House.Builder().setDoor(new Doors()).setWindow(new Windows()).setWall(new Wall()).build();

}
@Data
class House{
    private Doors door;
    private Windows windows;
    private Wall wall;

    public House(Builder builder){
        this.door=builder.door;
        this.windows=builder.windows;
        this.wall=builder.wall;
    }
    static final class Builder{
        private Doors door;
        private Windows windows;
        private Wall wall;

        public Builder setDoor(Doors door){
            this.door=door;
            return this;
        }
        public Builder setWindow(Windows windows){
            this.windows=windows;
            return this;
        }
        public Builder setWall(Wall wall){
            this.wall=wall;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }

}
class Doors{}
class Windows{}
class Wall{}
