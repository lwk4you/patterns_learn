package com.lw4you.patterns_learn.abstract_factory;

import com.lw4you.patterns_learn.abstract_factory.Loli.LoliCharacter;
import com.lw4you.patterns_learn.abstract_factory.Loli.LoliGFFactory;
import com.lw4you.patterns_learn.abstract_factory.olderSister.OlderSisterGFFactory;

import java.util.Scanner;

public class Test {
    private static Character character;
    private static Hair hair;
    private static Height height;
    public static void main(String[] args) {
        String type= new Scanner(System.in).next();

        if("萝莉".equals(type)){
            AbstratGFFactory factory=new LoliGFFactory();
            character=factory.createCharacter();
            hair=factory.createHair();
            height=factory.createHeight();
        }
        if ("御姐".equals(type)){
            AbstratGFFactory factory=new OlderSisterGFFactory();
            character=factory.createCharacter();
            hair=factory.createHair();
            height=factory.createHeight();

        }

        character.say();
        hair.show();
        height.show();
    }
}
