package com.acpb.create.abstractfactory;

//抽象工厂，工厂模式的扩展，类型为一时就是简单工厂
public class AbstractFactory {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        appleFactory.createComputer().create();
        appleFactory.createPhone().create();
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.createComputer().create();
        huaWeiFactory.createPhone().create();

    }
}


interface  AbastractFactory{
    /**
     *  抽象工厂定义多种类型接口,由具体工厂去实现，
     *  具体工厂可以产出多种类型的对象
     */
    Computer createComputer();
    Phone createPhone();

}


     class AppleFactory implements AbastractFactory{


        @Override
        public Computer createComputer() {
            return new AppleComputer();
        }

        @Override
        public Phone createPhone() {
            return new Iphone();
        }
    }
    class HuaWeiFactory implements AbastractFactory{
        @Override
        public Computer createComputer() {
            return new HuaWeiComputer();
        }

        @Override
        public Phone createPhone() {
            return new HuaWeiPhone();
        }
    }
    interface Computer{
        void create();
    }
     class AppleComputer implements Computer{
        @Override
        public void create() {
            System.out.println("生产苹果电脑");
        }
    }
    class HuaWeiComputer implements Computer{
        @Override
        public void create() {
            System.out.println("生产华为电脑");
        }
    }

    interface Phone{
        void create();
    }
    class Iphone implements Phone{

        @Override
        public void create() {
            System.out.println("生产苹果手机");
        }
    }
    class HuaWeiPhone implements Phone{

        @Override
        public void create() {
            System.out.println("生产华为手机");
        }
    }

