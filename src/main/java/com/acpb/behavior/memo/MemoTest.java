package com.acpb.behavior.memo;

public class MemoTest {
    //在不暴露对象行为和细节的情况下对该对象进行保存和恢复之前的状态
    public static void main(String[] args) {
        History history = new History();
        Document document = new Document();
        document.change("abc");
        history.add(document.save());
        document.print();

        document.change("def");
        history.add(document.save());
        document.print();

        document.resume(history.getLastVersion());
        document.print();

        document.resume(history.getLastVersion());
        document.print();
    }
}
