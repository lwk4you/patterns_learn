package com.lw4you.patterns_learn.factory_method;

public class AirPlane implements Transport {
    @Override
    public void delivery() {
        System.out.println("走空中运输");
    }
}
