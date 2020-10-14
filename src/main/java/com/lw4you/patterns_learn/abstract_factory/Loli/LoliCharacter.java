package com.lw4you.patterns_learn.abstract_factory.Loli;

import com.lw4you.patterns_learn.abstract_factory.Character;

public class LoliCharacter implements Character {
    @Override
    public void say() {
        System.out.println("我是萝莉");
    }
}
