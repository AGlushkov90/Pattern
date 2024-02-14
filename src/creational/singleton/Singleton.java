package creational.singleton;

public class Singleton {

    private static volatile Singleton instance;
    private final String value;

    private Singleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (result == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
