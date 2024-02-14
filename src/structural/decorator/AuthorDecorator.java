package structural.decorator;

public class AuthorDecorator implements Author {

    private final Author author;

    public AuthorDecorator(Author author) {
        this.author = author;
    }

    @Override
    public String write() {
        return author.write();
    }
}
