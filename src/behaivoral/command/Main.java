package behaivoral.command;

public class Main {
    public static void main(String[] args) {
        Comp comp = new Comp("First");
        User user = new User(new CommandStart(comp), new CommandStop(comp), new CommandReset(comp));
        user.start();
        user.stop();
        user.reset();
    }
}
