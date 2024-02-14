package structural.decorator;

public class Writer implements Author {

    @Override
    public String write() {
        return "write book";
    }
}
