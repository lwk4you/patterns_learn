package com.lw4you.patterns_learn.factory_method;

public class Boat implements Transport {
    @Override
    public void delivery() {
        System.out.println("走水水路运输");
    }
}
