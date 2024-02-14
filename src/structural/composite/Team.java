package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Author {

    List<Author> authorList = new ArrayList<>();

    void add(Author author) {
        authorList.add(author);
    }

    @Override
    public void write() {
        for (Author author : authorList) {
            author.write();
        }
    }
}
