package behaivoral.strategy;

public class Money implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("pay money");
    }
}
