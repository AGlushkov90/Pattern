package behaivoral.visitor;

public class Supermarket implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
