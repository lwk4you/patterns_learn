package com.lw4you.patterns_learn.proxy.staticproxy;

/**
 * 静态代理的实际操作对象对客户端不可见
 * 而装饰器一般的实际操作对象客户端可见
 * 我的理解大概是组合和聚合的区别
 */
public class Client {
    public static void main(String[] args) {
        MobileProxy mobileProxy=new MobileProxy();
        mobileProxy.buySomething();
    }
}
