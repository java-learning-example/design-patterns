package edu.learn.Behavioural.templatemethod;

abstract class DataExporter {
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

class CsvExporter extends DataExporter {
    protected void readData() { System.out.println("Reading CSV data"); }
    protected void transformData() { System.out.println("Transforming CSV records"); }
}

class JsonExporter extends DataExporter {
    protected void readData() { System.out.println("Reading JSON data"); }
    protected void transformData() { System.out.println("Transforming JSON nodes"); }
}

public class TemplateMethodDemo {
    public static void main(String[] args) {
        DataExporter exporter = new CsvExporter();
        exporter.export();
    }
}
