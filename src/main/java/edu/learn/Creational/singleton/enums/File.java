package edu.learn.Creational.singleton.enums;

public class File {
    private final String name;
    private final int size; // in bytes

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{name='" + name + "', size=" + size + " bytes}";
    }
}
