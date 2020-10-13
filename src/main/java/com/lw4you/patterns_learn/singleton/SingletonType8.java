package com.lw4you.patterns_learn.singleton;

public class SingletonType8 {
    public static void main(String[] args) {
        Singleton8 singletoninstance1=Singleton8.getSingletonInstance();
        Singleton8 singletoninstance2=Singleton8.getSingletonInstance();
        System.out.println(singletoninstance1==singletoninstance2);
        System.out.println(singletoninstance1.hashCode());
        System.out.println(singletoninstance2.hashCode());

    }
}

/**
 * 使用枚举
 */
enum Singleton8 {
    SINGLETON_8;

    //提供静态访问方法
    public static  Singleton8 getSingletonInstance(){
        return SINGLETON_8;
    }
}

//枚举是最好的单例实现，因为枚举可以阻止反射攻击，和反序列化攻击。
