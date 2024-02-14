package behaivoral.visitor;

public class Seller implements Visitor {
    @Override
    public void visit(Market market) {
        System.out.println("sold banana");
    }

    @Override
    public void visit(Supermarket supermarket) {
        System.out.println("sold potato");
    }
}
