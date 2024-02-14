package behaivoral.observer;

public interface Publisher {
    void add(Listener<WeatherStation> listener);
    void remove(Listener<WeatherStation> listener);
    void notifyListener();
}
