package com.lw4you.patterns_learn.builder;

/**
 * 客户端代码，
 * 现在我们要new 一个builder和一个direct,通过创建者模式来进行创建
 *
 */
public class Client {
    public static void main(String[] args) {
        //创建汽车构建者
        CarInfoBuilder carInfoBuilder=new CarInfoBuilder();
        //创建汽车说明书构建者
        CarBuilder carBuilder=new CarBuilder();

        //创建主管类
        Directer directer=new Directer();
        directer.createCar(carBuilder,"simple");
        directer.createCar(carInfoBuilder,"simple");
        Car car=carBuilder.getResult();
        CarInfo carInfo=carInfoBuilder.getResult();
        System.out.println(car);
        System.out.println(carInfo);
    }
}
