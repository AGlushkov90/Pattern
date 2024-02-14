package structural.decorator;

public class ScienceFictionWriter extends AuthorDecorator {
    public ScienceFictionWriter(Author author) {
        super(author);
    }

    @Override
    public String write() {
        return super.write() + writeFantasticBook();
    }

    private String writeFantasticBook() {
        return " ,write fantastic book";
    }
}
