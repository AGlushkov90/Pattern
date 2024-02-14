package behaivoral.strategy;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPayStrategy(new Money());
        person.execute();
        person.setPayStrategy(new Card());
        person.execute();
    }
}
