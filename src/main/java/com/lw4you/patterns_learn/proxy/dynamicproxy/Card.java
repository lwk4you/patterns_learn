package com.lw4you.patterns_learn.proxy.dynamicproxy;


public class Card implements Account {
    @Override
    public void buySomething() {
        System.out.println("花钱买电脑");
    }
}
