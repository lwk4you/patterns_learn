package com.lw4you.patterns_learn.memento.history;

import com.lw4you.patterns_learn.memento.edit.Editor;

public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
