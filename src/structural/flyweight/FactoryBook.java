package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryBook {
    private static final Map<String, TypeBook> map = new HashMap<>();

    public static TypeBook getTypeBook(String name, String genre, String color) {
        TypeBook typeBook = map.get(name);
        if (typeBook == null) {
            typeBook = new TypeBook(name, genre, color);
            map.put(name, typeBook);
        }
        return typeBook;
    }

    public static void printTypeBook() {
        for (TypeBook typeBook : map.values()) {
            System.out.println(typeBook);
        }
    }


}
