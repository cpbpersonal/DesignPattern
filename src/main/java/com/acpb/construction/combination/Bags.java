package com.acpb.construction.combination;

import java.util.ArrayList;
import java.util.List;

public class Bags implements Articles {
    private String name;
    private List<Articles> articlesList=new ArrayList<>();

    public Bags (String name){
        this.name=name;
    }
    public void add(Articles articles){
        articlesList.add(articles);
    }
    public void remove(Articles articles){
        articlesList.remove(articles);
    }

    @Override
    public float calculate() {
        float totalNum=0;
        for (Articles articles : articlesList) {
            totalNum+=articles.calculate();
        }
        return totalNum;
    }

    @Override
    public void show(){
        for (Articles articles : articlesList) {
            articles.show();
        }
    }

}
