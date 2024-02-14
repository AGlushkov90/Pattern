package creational.builder;

public interface Builder<T> {
    void setName(String name);

    void setTypeProduct();

    void setPrice(int price);

    T getResult();
}
