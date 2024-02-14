package creational.factory_method;

import creational.factory_method.factory.BreadFactory;
import creational.factory_method.factory.MilkFactory;
import creational.factory_method.factory.ProductFactory;
import creational.factory_method.product.Product;

public class Main {

    public static void main(String[] args) {
        ProductFactory productFactory = getFactoryProduct("milk");
        Product product = productFactory.createProduct();
        ship(product);
    }

    private static ProductFactory getFactoryProduct(String nameProduct) {
        if (nameProduct.equals("milk")) {
            return new MilkFactory();
        } else {
            return new BreadFactory();
        }
    }

    private static void ship(Product product) {
        product.pack();
        product.sell();
    }
}
