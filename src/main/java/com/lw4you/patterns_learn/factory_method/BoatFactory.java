package com.lw4you.patterns_learn.factory_method;

/**
 * 工厂实现
 */
public class BoatFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Boat();
    }
}
