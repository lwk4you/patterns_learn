package com.lw4you.patterns_learn.abstract_factory.olderSister;

import com.lw4you.patterns_learn.abstract_factory.AbstratGFFactory;
import com.lw4you.patterns_learn.abstract_factory.Character;
import com.lw4you.patterns_learn.abstract_factory.Hair;
import com.lw4you.patterns_learn.abstract_factory.Height;

public class OlderSisterGFFactory implements AbstratGFFactory {
    @Override
    public Character createCharacter() {
        return new OlderSisterCharacter();
    }

    @Override
    public Height createHeight() {
        return new OldSisterHeight();
    }

    @Override
    public Hair createHair() {
        return new OldSisterHair();
    }
}
