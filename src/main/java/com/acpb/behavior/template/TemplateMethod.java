package com.acpb.behavior.template;

//模板方法模式，定义一些算法框架，而将一些具体的实现延迟到子类中，使得子类可以不改变算法的结构而重新定义算法的某些特定步骤。
//行为由父类控制，子类去实现。
public class TemplateMethod {
    public static void main(String[] args) {
        Template template=new Cooking();
        template.cook();
    }


}

abstract  class  Template{
    protected abstract void  step1();
    protected abstract void  step2();
    protected abstract void  step3();

    public void  cook(){
        System.out.println("开始做饭");
        step1();
        step2();
        step3();
        System.out.println("做饭结束");
    }

}

 class  Cooking extends  Template{

    protected void step1() {
        System.out.println("开火倒油");
    }

    protected void step2() {
        System.out.println("加入西红柿鸡蛋");
    }

    protected void step3() {
        System.out.println("翻炒装盘");
    }
}
