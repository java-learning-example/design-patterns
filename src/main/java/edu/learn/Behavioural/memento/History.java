package edu.learn.Behavioural.memento;

import java.util.Stack;

public class History {
    private final Stack<EditorMemento> stack = new Stack<>();

    public void push(EditorMemento memento) { stack.push(memento); }
    public EditorMemento pop() { return stack.pop(); }
}
