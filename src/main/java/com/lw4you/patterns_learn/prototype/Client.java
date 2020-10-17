package com.lw4you.patterns_learn.prototype;

public class Client {
    public static void main(String[] args) {
        GirlFriend girlFriend=new GirlFriend();
        girlFriend.setSex("女性");
        girlFriend.setHeight("170cm");

        GirlFriend gf2=girlFriend.clone();

        System.out.println(gf2);
        System.out.println(girlFriend.hashCode()==gf2.hashCode());
    }


}
