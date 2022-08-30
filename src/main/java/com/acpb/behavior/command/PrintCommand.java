package com.acpb.behavior.command;

public class PrintCommand implements Command{
    private BoxText boxText;

    public PrintCommand(BoxText boxText) {
        this.boxText = boxText;
    }

    @Override
    public void excute() {
        System.out.println(boxText.getContext());
    }
}
