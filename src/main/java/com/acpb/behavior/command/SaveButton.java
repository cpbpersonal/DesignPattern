package com.acpb.behavior.command;

public class SaveButton {
    private Command command;

    public void bindComand(Command command){
        this.command=command;
    }
    public void doPrint(){
        command.excute();
    }

}
