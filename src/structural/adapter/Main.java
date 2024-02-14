package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Write writer = new Adapter();
        writer.write();
    }
}
