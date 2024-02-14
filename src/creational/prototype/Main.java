package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("milk", 100);
        Product productCopy = product.clone();
        if (productCopy == product) {
            System.out.println("equal by reference");
        } else if (productCopy.equals(product)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
