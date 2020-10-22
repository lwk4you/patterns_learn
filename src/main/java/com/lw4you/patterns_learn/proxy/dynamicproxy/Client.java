package com.lw4you.patterns_learn.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk的动态代理实现
 */
public class Client {
    public static void main(String[] args) {
        Card card=new Card();
        Object proxy= Proxy.newProxyInstance(card.getClass().getClassLoader(), card.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("校验是不是本人");
               Object obj= method.invoke(card,args);
                System.out.println("obj"+obj);
                System.out.println("完成支付");
                return obj;
            }
        });

        Account account=(Account)proxy;
        account.buySomething();
    }
}
