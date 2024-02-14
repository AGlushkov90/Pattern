package structural.adapter;

public class Adapter extends TypeWriter implements Write {
    @Override
    public void write() {
        type();
    }
}
