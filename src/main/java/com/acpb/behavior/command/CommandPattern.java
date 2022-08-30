package com.acpb.behavior.command;

/**
 * @author chengpengbo
 */
public class CommandPattern {
    public static void main(String[] args) {
        //使用命令模式分离 业务逻辑与图形界面 ,使业务逻辑可复用
        SaveButton saveButton = new SaveButton();
        //请求体
        BoxText boxText = new BoxText();
        //将请求转为一个独立对象
        PrintCommand printCommand = new PrintCommand(boxText);
        //绑定业务逻辑
        saveButton.bindComand(printCommand);
        boxText.setContext("123456");
        //执行业务逻辑
        saveButton.doPrint();
        boxText.setContext("789");
        saveButton.doPrint();
    }
}
