package behaivoral.command;

public class CommandStop extends Command {

    public CommandStop(Comp comp) {
        super(comp);
    }

    @Override
    public void execute() {
        comp.stop();
    }
}
