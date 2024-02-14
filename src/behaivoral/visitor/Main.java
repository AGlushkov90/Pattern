package behaivoral.visitor;

public class Main {
    public static void main(String[] args) {
        Element market = new Market();
        Element supermarket = new Supermarket();
        Visitor seller = new Seller();
        Visitor man = new Man();

        market.accept(seller);
        market.accept(man);
        supermarket.accept(seller);
        supermarket.accept(man);
    }
}
