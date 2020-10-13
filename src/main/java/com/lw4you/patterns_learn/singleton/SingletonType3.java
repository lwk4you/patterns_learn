package com.lw4you.patterns_learn.singleton;

public class SingletonType3 {
    public static void main(String[] args) {
//        Singleton3 singletoninstance1=Singleton3.getSingletonInstance();
//        Singleton3 singletoninstance2=Singleton3.getSingletonInstance();
//        System.out.println(singletoninstance1==singletoninstance2);
//        System.out.println(singletoninstance1.hashCode());
//        System.out.println(singletoninstance2.hashCode());
        for(int i=0;i<50;i++){
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(Singleton3.getSingletonInstance().hashCode()); ;
                        }
                    }
            ).start();
        }

    }
}

/**
 * 懒汉式
 */
class Singleton3 {
    //声明静态变量,并初始化构造
    private static Singleton3 singleton;

    //私有化构造方法
    private Singleton3() {
    }
    //提供静态访问方法
    public static Singleton3 getSingletonInstance(){
        if(singleton==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton=new Singleton3();
        }
        return singleton;
    }
    //这种是懒汉式的实现方法，好处是能够避免造成资源浪费，
    //缺点是在多线程情况下，会存在问题，造成获取不是单例的情况，不推荐使用

}
