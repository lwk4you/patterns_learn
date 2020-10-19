package com.lw4you.patterns_learn.memento.commands;

public interface Command {
    String getName();
    void execute();
}