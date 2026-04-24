package edu.learn.Structural.composite;

public class FileLeaf implements FileSystemNode {
    private final int bytes;

    public FileLeaf(int bytes) { this.bytes = bytes; }

    @Override
    public int size() { return bytes; }
}
