package java.learn.Structural.composite;

import java.util.ArrayList;
import java.util.List;

interface FileSystemNode {
    int size();
}

class FileLeaf implements FileSystemNode {
    private final int bytes;

    public FileLeaf(int bytes) { this.bytes = bytes; }

    public int size() { return bytes; }
}

class FolderComposite implements FileSystemNode {
    private final List<FileSystemNode> children = new ArrayList<>();

    public void add(FileSystemNode node) { children.add(node); }

    public int size() {
        int sum = 0;
        for (FileSystemNode child : children) sum += child.size();
        return sum;
    }
}

public class CompositeDemo {
    public static void main(String[] args) {
        FolderComposite root = new FolderComposite();
        root.add(new FileLeaf(120));

        FolderComposite images = new FolderComposite();
        images.add(new FileLeaf(400));
        images.add(new FileLeaf(600));

        root.add(images);
        System.out.println("Total bytes: " + root.size());
    }
}
