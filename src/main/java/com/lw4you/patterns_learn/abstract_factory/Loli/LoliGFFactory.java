package com.lw4you.patterns_learn.abstract_factory.Loli;

import com.lw4you.patterns_learn.abstract_factory.AbstratGFFactory;
import com.lw4you.patterns_learn.abstract_factory.Character;
import com.lw4you.patterns_learn.abstract_factory.Hair;
import com.lw4you.patterns_learn.abstract_factory.Height;

public class LoliGFFactory implements AbstratGFFactory {
    @Override
    public Character createCharacter() {
        return new LoliCharacter();
    }

    @Override
    public Height createHeight() {
        return new LoliHeight();
    }

    @Override
    public Hair createHair() {
        return new LoliHair();
    }
}
