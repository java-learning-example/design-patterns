package edu.learn.Creational.abstractfactory;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() { return new DarkButton(); }

    @Override
    public Checkbox createCheckbox() { return new DarkCheckbox(); }
}
