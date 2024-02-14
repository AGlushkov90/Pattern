package behaivoral.chain_of_command;

public class LoggerInfo extends Logger {
    public LoggerInfo(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("display " + message);
    }
}
