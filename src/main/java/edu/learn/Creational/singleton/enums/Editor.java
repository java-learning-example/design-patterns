package edu.learn.Creational.singleton.enums;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public enum Editor {
    INSTANCE;

    // Shared session state across the app.
    private final Map<String, File> openFiles = new LinkedHashMap<>();

    public void openFile(File file) {
        openFiles.put(file.getName(), file);
        System.out.println("Opened: " + file);
    }

    public void closeFile(String name) {
        File removed = openFiles.remove(name);
        if (removed == null) {
            System.out.println("No open file named: " + name);
            return;
        }
        System.out.println("Closed: " + removed.getName());
    }

    public Collection<File> listOpenFiles() {
        return Collections.unmodifiableCollection(openFiles.values());
    }

    public int totalOpenSize() {
        int total = 0;
        for (File file : openFiles.values()) {
            total += file.getSize();
        }
        return total;
    }
}
