package com.acpb.construction.bridge;

public class Client {
    public static void main(String[] args) {
        Star star = new Star(new Sing(),"蔡徐坤");
        star.StarShow();
        Star star2 = new Star(new Rap(),"蔡徐坤");
        star2.StarShow();
    }
}
