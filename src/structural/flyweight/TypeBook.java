package structural.flyweight;

public class TypeBook {
    private final String name;
    private final String genre;
    private final String color;

    public TypeBook(String name, String genre, String color) {
        this.name = name;
        this.genre = genre;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TypeBook{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
