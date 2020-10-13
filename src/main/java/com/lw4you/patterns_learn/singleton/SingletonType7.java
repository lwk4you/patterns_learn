package com.lw4you.patterns_learn.singleton;

public class SingletonType7 {
    public static void main(String[] args) {
        Singleton7 singletoninstance1=Singleton7.getSingletonInstance();
        Singleton7 singletoninstance2=Singleton7.getSingletonInstance();
        System.out.println(singletoninstance1==singletoninstance2);
        System.out.println(singletoninstance1.hashCode());
        System.out.println(singletoninstance2.hashCode());

    }
}

/**
 * 静态内部类的方法
 */
class Singleton7 {

    private static class SingletonInstacne{
        private static Singleton7 instance=new Singleton7();
    }

    //私有化构造方法
    private Singleton7() {
    }
    //提供静态访问方法
    public static  Singleton7 getSingletonInstance(){
        return SingletonInstacne.instance;
    }
//加载外部类时，不会加载内部类，可以实现懒加载
}
