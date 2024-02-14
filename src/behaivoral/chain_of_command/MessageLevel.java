package behaivoral.chain_of_command;

public enum MessageLevel {
    INFO(1), WARNING(2), ERROR(3);
    private final int level;

    MessageLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
