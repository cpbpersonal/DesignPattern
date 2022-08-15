package com.acpb.construction.interview;

/**
 * @author chengpengbo
 * 门面模式，封装系统的调用过程
 * 违反了开闭原则
 */
public class Interviewpattern {
    public static void main(String[] args) {
        Face face = new Face();
        face.faceMethod();
    }
}

class SystemA{
    public void methodA (){
        System.out.println("第一步");
    }
}
class SystemB{
    public void methodA (){
        System.out.println("第二步");
    }
}
class Face{
    SystemA sa=new SystemA();
    SystemA sb=new SystemA();

    public void faceMethod(){
        sa.methodA();
        sb.methodA();
    }
}
