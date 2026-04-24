package edu.learn.Structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileSystemNode {
    private final List<FileSystemNode> children = new ArrayList<>();

    public void add(FileSystemNode node) { children.add(node); }

    @Override
    public int size() {
        int sum = 0;
        for (FileSystemNode child : children) sum += child.size();
        return sum;
    }
}
