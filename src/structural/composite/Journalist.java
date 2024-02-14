package structural.composite;

public class Journalist implements Author {
    @Override
    public void write() {
        System.out.println("write magazine");
    }
}
