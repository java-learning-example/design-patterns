package edu.learn.Behavioural.memento;

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
