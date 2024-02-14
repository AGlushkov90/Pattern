package creational.abstract_factory.factory;

import creational.abstract_factory.goods.Bread;
import creational.abstract_factory.goods.Dish;
import creational.abstract_factory.goods.Knife;
import creational.abstract_factory.goods.Product;

public class BreadFactory implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new Bread();
    }

    @Override
    public Dish createDish() {
        return new Knife();
    }
}
