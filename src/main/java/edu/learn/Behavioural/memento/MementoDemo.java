package edu.learn.Behavioural.memento;

import java.util.Stack;

class TextEditor {
    private String text;

    public void setText(String text) { this.text = text; }
    public String getText() { return text; }

    public EditorMemento save() { return new EditorMemento(text); }
    public void restore(EditorMemento memento) { this.text = memento.getState(); }
}

class EditorMemento {
    private final String state;

    public EditorMemento(String state) { this.state = state; }
    public String getState() { return state; }
}

class History {
    private final Stack<EditorMemento> stack = new Stack<>();

    public void push(EditorMemento memento) { stack.push(memento); }
    public EditorMemento pop() { return stack.pop(); }
}

public class MementoDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("v1 draft");
        history.push(editor.save());

        editor.setText("v2 with typo");
        history.push(editor.save());

        editor.restore(history.pop());
        System.out.println("Undo once: " + editor.getText());
        editor.restore(history.pop());
        System.out.println("Undo twice: " + editor.getText());
    }
}
