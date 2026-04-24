package edu.learn.Creational.singleton.enum_emp;

public class EnumEditorDemo {
    public static void main(String[] args) {
        Editor editorFromTab1 = Editor.INSTANCE;
        Editor editorFromTab2 = Editor.INSTANCE;

        editorFromTab1.openFile(new File("notes.md", 1024));
        editorFromTab2.openFile(new File("design-patterns.java", 4096));

        System.out.println("Same instance: " + (editorFromTab1 == editorFromTab2));
        System.out.println("Open files: " + editorFromTab1.listOpenFiles());
        System.out.println("Total size: " + editorFromTab2.totalOpenSize() + " bytes");

        editorFromTab2.closeFile("notes.md");
        System.out.println("After close: " + editorFromTab1.listOpenFiles());
    }
}
