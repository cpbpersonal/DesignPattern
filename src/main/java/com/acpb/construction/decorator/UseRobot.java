package com.acpb.construction.decorator;

/**
 * 装饰器模式
 * 使用装饰器对原有的对象功能进行扩展---JavaIO流
 * 通过组合 在装饰器构造时传入需要被装饰的对象,装饰器实现了新的功能。
 */
public class UseRobot {
    public static void main(String[] args) {
       new CleanDecorator(new FirstRobot()).doMoreSomething();
       new CookieDecorator(new FirstRobot()).doMoreSomething();
    }
}
