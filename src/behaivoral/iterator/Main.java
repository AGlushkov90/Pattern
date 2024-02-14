package behaivoral.iterator;

public class Main {
    public static void main(String[] args) {
        Aggregator stringAggregator = new StringAggregator();
        Iterator<String> iterator = stringAggregator.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
