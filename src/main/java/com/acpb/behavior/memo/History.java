package com.acpb.behavior.memo;

import java.util.Stack;

/**
 * @author 22106
 */
public class History {
    Stack<BackUp> backUpStack=new Stack();

    public void add(BackUp backUp){
        backUpStack.add(backUp);
    }

    public BackUp getLastVersion(){
        return backUpStack.pop();
    }
}
