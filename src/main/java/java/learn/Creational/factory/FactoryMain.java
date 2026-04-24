package java.learn.Creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        String osType = args.length > 0 ? args[0] : "android";
        OS os = OSFactory.getInstance(osType);
        os.spec();
    }
}
