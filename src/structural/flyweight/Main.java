package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("book", "author", FactoryBook.getTypeBook("greenDetective", "green", "detective")));
        list.add(new Book("book1", "author1", FactoryBook.getTypeBook("greenDetective", "green", "detective")));
        list.add(new Book("book2", "author2", FactoryBook.getTypeBook("greenFantastic", "green", "fantastic")));
        for (Book book : list) {
            System.out.println(book);
        }
        FactoryBook.printTypeBook();
    }
}
