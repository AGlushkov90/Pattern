package behaivoral.observer;

public interface Listener<T> {
    void handleMessage(T publisher);
}
