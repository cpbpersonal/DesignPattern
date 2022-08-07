package com.acpb.behavior.chain;

//责任链模式
//将请求和处理分开，请求者不需要知道谁去处理，通过链式的处理过程，新增一个处理器即可 ，更易扩展
public class ChainHandler {

    public static void main(String[] args) {
        Handler level1=new Leader();
        Handler level2=new Boss();
        level1.setHandler(level2);

        level1.processor(8);
        level1.processor(11);
    }
}


    abstract class  Handler{
        protected   Handler nextHandler;
       public void setHandler(Handler nextHandler){
          this.nextHandler=nextHandler;
       }
        public  abstract  void  processor(int info);
    }

    class Leader extends  Handler{
        @Override
        public void processor(int info) {
            if (info>0&&info<10){
                System.out.println("leader 处理了");
            }else{
             nextHandler.processor(info);
            }

        }
    }

    class  Boss extends  Handler{

        @Override
        public void processor(int info) {
            if (info>10){
                System.out.println("Boss 处理");
            }
        }
    }




