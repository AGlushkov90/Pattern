package creational.abstract_factory.factory;

import creational.abstract_factory.goods.Dish;
import creational.abstract_factory.goods.Product;

public interface AbstractFactory {
    Product createProduct();

    Dish createDish();
}
