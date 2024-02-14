package behaivoral.command;

public class CommandStart extends Command {

    public CommandStart(Comp comp) {
        super(comp);
    }

    @Override
    public void execute() {
        comp.start();
    }
}
