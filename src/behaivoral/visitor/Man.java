package behaivoral.visitor;

public class Man implements Visitor {
    @Override
    public void visit(Market market) {
        System.out.println("buy banana");
    }

    @Override
    public void visit(Supermarket supermarket) {
        System.out.println("buy potato");
    }
}
