package behaivoral.strategy;

public class Person {
    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void execute() {
        payStrategy.pay();
    }
}
