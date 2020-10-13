package com.lw4you.patterns_learn.singleton;

public class SingletonType4 {
    public static void main(String[] args) {
        Singleton4 singletoninstance1=Singleton4.getSingletonInstance();
        Singleton4 singletoninstance2=Singleton4.getSingletonInstance();
        System.out.println(singletoninstance1==singletoninstance2);
        System.out.println(singletoninstance1.hashCode());
        System.out.println(singletoninstance2.hashCode());

    }
}

/**
 * 懒汉式
 */
class Singleton4 {
    //声明静态变量
    private static Singleton4 singleton;

    //私有化构造方法
    private Singleton4() {
    }
    //提供静态访问方法
    public static synchronized Singleton4 getSingletonInstance(){
        if(singleton==null){
            singleton=new Singleton4();
        }
        return singleton;
    }
    //优点，能够解决多线程的问题，但是sychronized 锁太重，在频繁使用的情况下造成锁等待，不推荐，
    //缺点是在多线程情况下，会存在问题，造成获取不是单例的情况，不推荐使用

}
