package structural.facade.factory_method.product;

public class Bread implements Product {
    @Override
    public void pack() {
        System.out.println("bread packed");
    }

    @Override
    public void sell() {
        System.out.println("bread sold");
    }
}
