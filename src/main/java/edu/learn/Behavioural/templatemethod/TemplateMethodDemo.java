package edu.learn.Behavioural.templatemethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        DataExporter exporter = new CsvExporter();
        exporter.export();
    }
}
