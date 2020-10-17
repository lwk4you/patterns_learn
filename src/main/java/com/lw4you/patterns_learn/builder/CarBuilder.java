package com.lw4you.patterns_learn.builder;

/**
 * 汽车的建造者，实现builder接口
 */
public class CarBuilder implements Builder{

    private Car car=new Car();

    @Override
    public void createSeat() {
        this.car.setSeat("seat");
    }

    @Override
    public void createApperance() {
        car.setApperance("appearance");
    }

    @Override
    public void createComputer() {
        car.setComputer("computer");

    }

    @Override
    public void createEngine() {
        car.setEngine("engine");
    }

    public Car getResult(){
        return this.car;
    }
}
