package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device[] devices = {new Feather(new Writer()), new TypeWriter(new Journalist())};
        for (Device device : devices) {
            device.enterDevice();
        }
    }
}
