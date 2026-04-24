package edu.learn.Creational.abstractfactory;

public class AbstractFactoryDemo {
    // Client depends only on the abstract factory, not concrete UI widgets.
    public static void main(String[] args) {
        String theme = args.length > 0 ? args[0] : "light";
        UIFactory factory = "dark".equalsIgnoreCase(theme)
                ? new DarkThemeFactory()
                : new LightThemeFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
