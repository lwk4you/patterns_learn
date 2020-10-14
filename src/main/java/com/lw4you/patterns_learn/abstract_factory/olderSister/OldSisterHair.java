package com.lw4you.patterns_learn.abstract_factory.olderSister;

import com.lw4you.patterns_learn.abstract_factory.Hair;

public class OldSisterHair implements Hair {
    @Override
    public void show() {
        System.out.println("我有一头长发");
    }
}
