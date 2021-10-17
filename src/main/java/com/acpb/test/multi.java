package com.acpb.test;

public class multi {
    public static void main(String[] args) {
        chengfa();
    }

    private static void chengfa(){
        for(int i = 1;i < 10;i ++){
            for(int j = 1; j <= i;j ++){
                if(j == i){
                    System.out.println(j +" * " + i + "="+ (j * i) + " ");
                }else{
                    System.out.print(j +" * " + i + "="+ (j * i) + " ");
                }
            }
        }
    }
}
