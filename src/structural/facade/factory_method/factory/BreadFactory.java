package structural.facade.factory_method.factory;

import structural.facade.factory_method.product.Bread;
import structural.facade.factory_method.product.Product;

public class BreadFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Bread();
    }
}
