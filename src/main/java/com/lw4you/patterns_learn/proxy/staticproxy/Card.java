package com.lw4you.patterns_learn.proxy.staticproxy;

public class Card implements Account {
    @Override
    public void buySomething() {
        System.out.println("花钱买电脑");
    }
}
