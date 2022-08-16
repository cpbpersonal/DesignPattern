package com.acpb.construction.combination;

public class Shopping {
    public static void main(String[] args) {
        Goods go;
        Bags bigBag = new Bags("大袋子");
        Bags midBag = new Bags("中袋子");
        Bags smallBag = new Bags("小袋子");
        Bags smallRedBag = new Bags("小红袋子");
        Bags smallBlackBag = new Bags("小黑袋子");
         go=new Goods("鞋子",2,200f);
         bigBag.add(go);
         go=new Goods("袜子",3,3L);
         smallBag.add(go);
        go=new Goods("篮球",1,88);
        smallRedBag.add(go);
        go=new Goods("文具",2,6);
        smallBlackBag.add(go);
        midBag.add(smallBlackBag);
        midBag.add(smallRedBag);
        bigBag.add(smallBag);
        bigBag.add(midBag);


        float calculate = bigBag.calculate();
        System.out.println(calculate);
        bigBag.show();
    }
}
