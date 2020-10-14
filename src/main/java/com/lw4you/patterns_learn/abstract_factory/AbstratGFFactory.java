package com.lw4you.patterns_learn.abstract_factory;

/**
 * 定义一个抽象女友制造工厂，定义一些特性创建方法
 */
public interface AbstratGFFactory {
    //定义GF的性格
    Character createCharacter();
    //定义GF的身高
    Height createHeight();
    //定义GF的发型
    Hair createHair();


}
