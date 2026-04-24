package edu.learn.Behavioural.templatemethod;

public class CsvExporter extends DataExporter {
    @Override
    protected void readData() { System.out.println("Reading CSV data"); }

    @Override
    protected void transformData() { System.out.println("Transforming CSV records"); }
}
