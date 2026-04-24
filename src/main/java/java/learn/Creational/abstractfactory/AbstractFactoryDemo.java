package java.learn.Creational.abstractfactory;

interface Button {
    void render();
}

interface Checkbox {
    void render();
}

interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class LightButton implements Button {
    public void render() {
        System.out.println("Render light button");
    }
}

class LightCheckbox implements Checkbox {
    public void render() {
        System.out.println("Render light checkbox");
    }
}

class DarkButton implements Button {
    public void render() {
        System.out.println("Render dark button");
    }
}

class DarkCheckbox implements Checkbox {
    public void render() {
        System.out.println("Render dark checkbox");
    }
}

class LightThemeFactory implements UIFactory {
    public Button createButton() { return new LightButton(); }
    public Checkbox createCheckbox() { return new LightCheckbox(); }
}

class DarkThemeFactory implements UIFactory {
    public Button createButton() { return new DarkButton(); }
    public Checkbox createCheckbox() { return new DarkCheckbox(); }
}

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
