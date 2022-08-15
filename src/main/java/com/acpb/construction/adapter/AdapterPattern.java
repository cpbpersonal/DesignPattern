package com.acpb.construction.adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        new TranslatorAdapter(new Speaker()).translate();
    }
}

class Speaker{
    public void speak(){
        System.out.println("china");
    }
}
interface Translator{
    void translate();
}

class TranslatorAdapter implements Translator{

    private Speaker speaker;
    public TranslatorAdapter(Speaker speaker){
        this.speaker=speaker;
    }
    @Override
    public void translate() {
        speaker.speak();
        System.out.println("中国");
    }
}
