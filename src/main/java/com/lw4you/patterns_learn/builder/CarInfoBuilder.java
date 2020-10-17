package com.lw4you.patterns_learn.builder;

/**
 * 汽车说明书的建造者，实现builder接口
 */
public class CarInfoBuilder implements Builder{
    private CarInfo carInfo=new CarInfo();
    @Override
    public void createSeat() {
        carInfo.setSeatInfo("seatInfo");
    }

    @Override
    public void createApperance() {
        carInfo.setApperanceInfo("apperanceInfo");
    }

    @Override
    public void createComputer() {
        carInfo.setComputerInfo("computerInfo");
    }

    @Override
    public void createEngine() {
        carInfo.setEngineInfo("engineInfo");
    }

    public CarInfo getResult(){
        return carInfo;
    }

}
