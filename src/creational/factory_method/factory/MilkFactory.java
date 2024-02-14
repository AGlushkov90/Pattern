package creational.factory_method.factory;

import creational.factory_method.product.Milk;
import creational.factory_method.product.Product;

public class MilkFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Milk();
    }
}
