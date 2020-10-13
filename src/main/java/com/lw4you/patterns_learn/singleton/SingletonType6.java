package com.lw4you.patterns_learn.singleton;

public class SingletonType6 {
    public static void main(String[] args) {
        Singleton6 singletoninstance1=Singleton6.getSingletonInstance();
        Singleton6 singletoninstance2=Singleton6.getSingletonInstance();
        System.out.println(singletoninstance1==singletoninstance2);
        System.out.println(singletoninstance1.hashCode());
        System.out.println(singletoninstance2.hashCode());

    }
}

/**
 * 双重检查
 */
class Singleton6 {
    //声明静态变量，volatile将值刷新到主存中
    private volatile static Singleton6 singleton;

    //私有化构造方法
    private Singleton6() {
    }
    //提供静态访问方法
    public static  Singleton6 getSingletonInstance(){
        if(singleton==null){
            synchronized (Singleton6.class){
                if(singleton==null){
                    singleton=new Singleton6();
                }

            }

        }
        return singleton;
    }
   //解决多线程问题，推荐使用

}
