package com.lw4you.patterns_learn.singleton;

public class SingletonType2 {
    public static void main(String[] args) {
        Singleton2 singletoninstance1=Singleton2.getSingletonInstance();
        Singleton2 singletoninstance2=Singleton2.getSingletonInstance();
        System.out.println(singletoninstance1==singletoninstance2);
        System.out.println(singletoninstance1.hashCode());
        System.out.println(singletoninstance2.hashCode());

    }
}

/**
 * 饿汉式
 */
class Singleton2 {
    //声明静态变量,并初始化构造
    private static Singleton2 singleton;
    //静态块
    static{
        singleton=new Singleton2();
    }
    //私有化构造方法
    private Singleton2() {
    }
    //提供静态访问方法
    public static Singleton2 getSingletonInstance(){
        return singleton;
    }
    //好处是，不会有多线程的问题，缺点是必定会实例化一个对象，可能会造成资源浪费。
    //推荐使用

}
