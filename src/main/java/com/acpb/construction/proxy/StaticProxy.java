package com.acpb.construction.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface  speaker{
        void speak();
    }

class Zhangsan implements speaker{
    @Override
    public void speak() {
        System.out.println("我老婆打我");
    }
}
     class Lisi{
     public void speak(){
         System.out.println("李四自己的方法");
     }
     }
     class Lawyerinterceptor implements MethodInterceptor{
         private Object obj;

         public Lawyerinterceptor(Object obj) {
             this.obj = obj;
         }
         @Override
         public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
             if(method.getName().equals("speak")) {
                 System.out.println("引用法律条文");
                 method.invoke(obj,objects);//通过反射调用对应实体的方法
                 System.out.println("打人是不对的");
             }

             return null;
         }
     }

       //抽象代理对象的行为
     class LawyerProxy implements InvocationHandler {
         private Object obj;

           public LawyerProxy(Object obj) {
               this.obj = obj;
           }
           @Override
         public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
           if(method.getName().equals("speak")) {
               System.out.println("引用法律条文");
               method.invoke(obj,args);//通过反射调用对应实体的方法
               System.out.println("打人是不对的");
           }
            return null;
         }
     }
     //代理类，张三的代理律师对张三的方法进行增强
      class Zhangsanlaywer implements speaker{
        private Zhangsan zhangsan=new Zhangsan();
         @Override
         public void speak() {
             System.out.println("引用法律条文");
             zhangsan.speak();
             System.out.println("打人是不对的");
         }
     }
    class ProxyTest{
        public static void main(String[] args) {
            speaker speaker=new Zhangsanlaywer();
            speaker.speak();
            //动态代理
            LawyerProxy lawyerProxy =new LawyerProxy(new Zhangsan());
            speaker speaker1=
                    (speaker) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),new Class[]{speaker.class},lawyerProxy);
            speaker1.speak();
            //cglib动态代理
            Lawyerinterceptor lawyerinterceptor=new Lawyerinterceptor(new Lisi());
            Lisi lisi = (Lisi) Enhancer.create(Lisi.class, lawyerinterceptor);
            lisi.speak();

        }
    }

