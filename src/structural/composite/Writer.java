package structural.composite;

public class Writer implements Author {
    @Override
    public void write() {
        System.out.println("write book");
    }
}
