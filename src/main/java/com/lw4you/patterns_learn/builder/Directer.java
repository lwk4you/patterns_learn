package com.lw4you.patterns_learn.builder;

import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType;

/**
 * 定义主管类，来管理实现builder接口的一系列建造者和建造步骤
 */
public class Directer {
    /**
     * 如果建造类的步骤一致，可以考虑直接传抽象接口
     * @param builder
     * @param type
     */
    void createCar(Builder builder,String type){
        if("simple".equals(type)){
            builder.createApperance();
            builder.createEngine();
            builder.createSeat();
        }else {
            builder.createApperance();
            builder.createEngine();
            builder.createSeat();
            builder.createComputer();
        }
    }

}
