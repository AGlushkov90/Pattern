package creational.factory_method.factory;

import creational.factory_method.product.Bread;
import creational.factory_method.product.Product;

public class BreadFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Bread();
    }
}
