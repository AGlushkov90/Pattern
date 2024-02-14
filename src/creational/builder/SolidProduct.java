package creational.builder;

public class SolidProduct {
    private final String name;
    private final TypeProduct typeProduct;
    private final int price;

    public SolidProduct(String name, TypeProduct typeProduct, int price) {
        this.name = name;
        this.typeProduct = typeProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SolidProduct{" +
                "name='" + name + '\'' +
                ", typeProduct=" + typeProduct +
                ", price=" + price +
                '}';
    }
}
