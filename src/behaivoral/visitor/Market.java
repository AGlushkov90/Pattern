package behaivoral.visitor;

public class Market implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
