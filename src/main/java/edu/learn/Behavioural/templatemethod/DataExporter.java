package edu.learn.Behavioural.templatemethod;

public abstract class DataExporter {
    // Template method defines fixed algorithm skeleton.
    public final void export() {
        readData();
        transformData();
        writeData();
    }

    protected abstract void readData();
    protected abstract void transformData();

    protected void writeData() {
        System.out.println("Writing exported data to file");
    }
}
