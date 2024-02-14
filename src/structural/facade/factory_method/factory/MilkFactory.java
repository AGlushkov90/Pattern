package structural.facade.factory_method.factory;

import structural.facade.factory_method.product.Milk;
import structural.facade.factory_method.product.Product;

public class MilkFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Milk();
    }
}
