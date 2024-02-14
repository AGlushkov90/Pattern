package creational.abstract_factory.factory;

import creational.abstract_factory.goods.Dish;
import creational.abstract_factory.goods.Milk;
import creational.abstract_factory.goods.Mug;
import creational.abstract_factory.goods.Product;

public class MilkFactory implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new Milk();
    }

    @Override
    public Dish createDish() {
        return new Mug();
    }
}
