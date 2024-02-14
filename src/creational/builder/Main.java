package creational.builder;

public class Main {
    public static void main(String[] args) {
        Builder<LiquidProduct> builder = new LiquidBuilder();
        builder.setName("milk");
        builder.setTypeProduct();
        builder.setPrice(55);
        System.out.println(builder.getResult());
    }
}
