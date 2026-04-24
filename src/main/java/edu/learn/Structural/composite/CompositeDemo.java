package edu.learn.Structural.composite;

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
