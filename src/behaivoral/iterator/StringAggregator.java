package behaivoral.iterator;

public class StringAggregator implements Aggregator {
    private static final String[] arrayString = {"первый элемент", "второй элемент", "третий элемент"};

    @Override
    public Iterator<String> getIterator() {
        return new ConcreteIterator();
    }

    public static String[] getArrayString() {
        return arrayString;
    }
}
