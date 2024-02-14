package structural.bridge;

public class Writer implements Profession {
    @Override
    public void writeText() {
        System.out.println("write fantastic book");
    }
}
