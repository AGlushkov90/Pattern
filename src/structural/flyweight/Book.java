package structural.flyweight;

public class Book {
    private final String name;
    private final String author;
    private final TypeBook typeBook;

    public Book(String name, String author, TypeBook typeBook) {
        this.name = name;
        this.author = author;
        this.typeBook = typeBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", typeBook=" + typeBook +
                '}';
    }
}
