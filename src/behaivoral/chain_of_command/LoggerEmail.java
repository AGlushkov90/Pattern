package behaivoral.chain_of_command;

public class LoggerEmail extends Logger {
    public LoggerEmail(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("email " + message);
    }
}
