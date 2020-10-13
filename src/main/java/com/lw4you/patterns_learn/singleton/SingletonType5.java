package com.lw4you.patterns_learn.singleton;

public class SingletonType5 {
    public static void main(String[] args) {
        Singleton5 singletoninstance1=Singleton5.getSingletonInstance();
        Singleton5 singletoninstance2=Singleton5.getSingletonInstance();
        System.out.println(singletoninstance1==singletoninstance2);
        System.out.println(singletoninstance1.hashCode());
        System.out.println(singletoninstance2.hashCode());

    }
}

/**
 * 懒汉式
 */
class Singleton5 {
    //声明静态变量
    private static Singleton5 singleton;

    //私有化构造方法
    private Singleton5() {
    }
    //提供静态访问方法
    public static Singleton5 getSingletonInstance(){
        if(singleton==null){
            synchronized (Singleton5.class){
                singleton=new Singleton5();
            }

        }
        return singleton;
    }
   //没有解决多线程的问题。不推荐使用

}
