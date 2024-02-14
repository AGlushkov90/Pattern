package behaivoral.command;

public class CommandReset extends Command {

    public CommandReset(Comp comp) {
        super(comp);
    }

    @Override
    void execute() {
        comp.reset();
    }
}
