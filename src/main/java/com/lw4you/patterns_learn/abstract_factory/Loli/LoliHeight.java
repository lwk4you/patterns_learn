package com.lw4you.patterns_learn.abstract_factory.Loli;

import com.lw4you.patterns_learn.abstract_factory.Height;

public class LoliHeight implements Height {
    @Override
    public void show() {
        System.out.println("我身高155cm");
    }
}
