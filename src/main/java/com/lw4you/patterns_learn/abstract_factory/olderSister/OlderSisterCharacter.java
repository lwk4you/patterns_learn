package com.lw4you.patterns_learn.abstract_factory.olderSister;

import com.lw4you.patterns_learn.abstract_factory.Character;

public class OlderSisterCharacter implements Character {
    @Override
    public void say() {
        System.out.println("我是御姐");
    }
}
