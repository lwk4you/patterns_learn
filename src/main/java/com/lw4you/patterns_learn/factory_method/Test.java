package com.lw4you.patterns_learn.factory_method;

import java.util.Scanner;

public class Test {
    private static TransportFactory transportFactory;
    public static void main(String[] args) {

        String type= new Scanner(System.in).next();

        if("boat".equals(type)){
            transportFactory=new BoatFactory();
            new BoatFactory().createTransport().delivery();
        }
        if ("air".equals(type)){
            transportFactory=new AirPlaneFactory();

        }
        transportFactory.createTransport().delivery();


    }
}
