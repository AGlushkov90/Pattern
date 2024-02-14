package creational.abstract_factory;

import creational.abstract_factory.factory.AbstractFactory;
import creational.abstract_factory.factory.BreadFactory;
import creational.abstract_factory.factory.MilkFactory;
import creational.abstract_factory.goods.Dish;
import creational.abstract_factory.goods.Product;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = getAbstractFactory("milk");
        Product product = abstractFactory.createProduct();
        Dish dish = abstractFactory.createDish();
        product.displayName();
        dish.displayName();
    }

    private static AbstractFactory getAbstractFactory(String nameFactory) {
        if (nameFactory.equals("milk")) {
            return new MilkFactory();
        } else {
            return new BreadFactory();
        }
    }
}
