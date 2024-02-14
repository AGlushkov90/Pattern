package behaivoral.command;

public class Comp {
    private final String name;

    public Comp(String name) {
        this.name = name;
    }

    void start() {
        System.out.println("start " + name);
    }

    void stop() {
        System.out.println("stop " + name);
    }

    void reset() {
        System.out.println("reset " + name);
    }
}
