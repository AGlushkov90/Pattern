package behaivoral.chain_of_command;

public class LoggerTG extends Logger {
    public LoggerTG(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("TG " + message);
    }
}
