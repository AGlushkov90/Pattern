package creational.builder;

public class SolidBuilder implements Builder<SolidProduct> {
    private String name;
    private TypeProduct typeProduct;
    private int price;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTypeProduct() {
        this.typeProduct = TypeProduct.SOLID;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public SolidProduct getResult() {
        return new SolidProduct(name, typeProduct, price);
    }
}
