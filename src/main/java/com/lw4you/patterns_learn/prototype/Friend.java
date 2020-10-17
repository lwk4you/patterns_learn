package com.lw4you.patterns_learn.prototype;

public class Friend implements Prototype{
    private String height;



    @Override
    public Friend clone() {
        return new Friend(this);
    }

    public Friend(){

    }

    public Friend(Friend friend){
        this.height=friend.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

}
