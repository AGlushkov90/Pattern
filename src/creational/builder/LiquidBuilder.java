package creational.builder;

public class LiquidBuilder implements Builder<LiquidProduct> {
    private String name;
    private TypeProduct typeProduct;
    private int price;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTypeProduct() {
        this.typeProduct = TypeProduct.LIQUID;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public LiquidProduct getResult() {
        return new LiquidProduct(name, typeProduct, price);
    }
}
