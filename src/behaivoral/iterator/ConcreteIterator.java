package behaivoral.iterator;

public class ConcreteIterator implements Iterator<String> {
    int currentPosition = 0;
    private final String[] arrayString = StringAggregator.getArrayString();

    @Override
    public boolean hasNext() {
        return currentPosition < arrayString.length;
    }

    @Override
    public String next() {
        return arrayString[currentPosition++];
    }

}
