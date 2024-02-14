package behaivoral.command;

public abstract class Command {
    public Command(Comp comp) {
        this.comp = comp;
    }

    protected Comp comp;

    abstract void execute();
}
