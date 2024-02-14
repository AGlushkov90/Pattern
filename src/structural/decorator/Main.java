package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Author author = new ScienceFictionWriter(new Writer());
        System.out.println(author.write());
    }
}
