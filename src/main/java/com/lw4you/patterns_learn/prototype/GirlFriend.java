package com.lw4you.patterns_learn.prototype;

import lombok.Data;


public class GirlFriend extends Friend{
    private String sex;

    public GirlFriend(){

    }

    public GirlFriend(GirlFriend friend){
        super(friend);
        this.sex=friend.sex;
    }

    public GirlFriend clone(){
        return new GirlFriend(this);
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "sex='" + sex +'\''+ "height='"+super.getHeight()+'\''+
                '}';
    }
}
