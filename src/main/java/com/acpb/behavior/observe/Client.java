package com.acpb.behavior.observe;

public class Client {

    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        Mouse mouse=new Mouse();
        cat.attach(dog);
        cat.attach(mouse);
        cat.advice();
    }
}
