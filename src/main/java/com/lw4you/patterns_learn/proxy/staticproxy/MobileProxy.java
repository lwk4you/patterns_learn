package com.lw4you.patterns_learn.proxy.staticproxy;

public class MobileProxy implements Account {
    private Card card;

    MobileProxy(){
        card=new Card();
    }

    @Override
    public void buySomething() {
        System.out.println("校验是不是本人");
        card.buySomething();
        System.out.println("完成支付");
    }
}
