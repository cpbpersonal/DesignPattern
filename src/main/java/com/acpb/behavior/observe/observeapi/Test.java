package com.acpb.behavior.observe.observeapi;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog=new Dog();
        Mouse mouse=new Mouse();
        cat.addObserver(dog);
        cat.addObserver(mouse);
        System.out.println(cat.countObservers());
        cat.speak();

    }
}
