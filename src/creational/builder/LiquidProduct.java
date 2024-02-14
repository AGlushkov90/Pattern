package creational.builder;

public class LiquidProduct {
    private final String name;
    private final TypeProduct typeProduct;
    private final int price;

    public LiquidProduct(String name, TypeProduct typeProduct, int price) {
        this.name = name;
        this.typeProduct = typeProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LiquidProduct{" +
                "name='" + name + '\'' +
                ", typeProduct=" + typeProduct +
                ", price=" + price +
                '}';
    }
}
