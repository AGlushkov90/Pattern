package behaivoral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher {
    private int temperature;
    private int pressure;
    private final List<Listener> list = new ArrayList<>();

    public WeatherStation(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void setMeasurements(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyListener();
    }

    @Override
    public void add(Listener<WeatherStation> listener) {
        list.add(listener);
    }

    @Override
    public void remove(Listener listener) {
        list.remove(listener);
    }

    @Override
    public void notifyListener() {
        for (Listener<WeatherStation> listener : list
        ) {
            listener.handleMessage(this);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }
}
