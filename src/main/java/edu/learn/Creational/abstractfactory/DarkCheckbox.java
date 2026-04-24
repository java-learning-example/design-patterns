package edu.learn.Creational.abstractfactory;

public class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Render dark checkbox");
    }
}
