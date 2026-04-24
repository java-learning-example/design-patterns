package edu.learn.Behavioural.templatemethod;

public class JsonExporter extends DataExporter {
    @Override
    protected void readData() { System.out.println("Reading JSON data"); }

    @Override
    protected void transformData() { System.out.println("Transforming JSON nodes"); }
}
