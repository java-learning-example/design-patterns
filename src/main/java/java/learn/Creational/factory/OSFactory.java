package java.learn.Creational.factory;

public class OSFactory {

    public static OS getInstance(String osType) {
        if (osType == null || osType.isBlank()) {
            return new Android();
        }

        return switch (osType.toLowerCase()) {
            case "android", "google" -> new Android();
            case "ios", "apple", "open" -> new IOS();
            default -> throw new IllegalArgumentException("Unknown OS type: " + osType);
        };
    }
}
