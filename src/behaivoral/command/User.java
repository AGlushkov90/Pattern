package behaivoral.command;

public class User {
    private final Command start;
    private final Command stop;
    private final Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void start() {
        start.execute();
    }

    void stop() {
        stop.execute();
    }

    void reset() {
        reset.execute();
    }
}
