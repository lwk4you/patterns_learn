package com.lw4you.patterns_learn.abstract_factory.olderSister;

import com.lw4you.patterns_learn.abstract_factory.Height;

public class OldSisterHeight implements Height {
    @Override
    public void show() {
        System.out.println("我身高172cm");
    }
}
