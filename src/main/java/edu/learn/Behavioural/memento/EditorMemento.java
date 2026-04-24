package edu.learn.Behavioural.memento;

public class EditorMemento {
    private final String state;

    public EditorMemento(String state) { this.state = state; }
    public String getState() { return state; }
}
