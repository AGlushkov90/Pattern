package structural.facade;

import structural.facade.factory_method.factory.BreadFactory;
import structural.facade.factory_method.factory.MilkFactory;
import structural.facade.factory_method.factory.ProductFactory;
import structural.facade.factory_method.product.Product;

public class FacadeFactory {
    public void startFactory() {
        ProductFactory productFactory = getFactoryProduct("milk");
        Product product = productFactory.createProduct();
        ship(product);
    }


    private ProductFactory getFactoryProduct(String nameProduct) {
        if (nameProduct.equals("milk")) {
            return new MilkFactory();
        } else {
            return new BreadFactory();
        }
    }

    private void ship(Product product) {
        product.pack();
        product.sell();
    }
}
