package behaivoral.chain_of_command;

public abstract class Logger {
    private final int priority;
    private Logger nextLogger;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    protected void sendMessage(MessageLevel messageLevel, String message) {
        if (priority <= messageLevel.getLevel()) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.sendMessage(messageLevel, message);
        }
    }
    abstract protected void write(String message);
}
