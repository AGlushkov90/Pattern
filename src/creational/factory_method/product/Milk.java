package creational.factory_method.product;

public class Milk implements Product {
    @Override
    public void pack() {
        System.out.println("milk packed");
    }

    @Override
    public void sell() {
        System.out.println("milk sold");
    }
}
