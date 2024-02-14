package behaivoral.strategy;

public class Card implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("pay credit card");
    }
}
