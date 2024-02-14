package behaivoral.observer;

public class ConsoleListener implements Listener<WeatherStation> {

    @Override
    public void handleMessage(WeatherStation publisher) {
        System.out.println("Temperature " + publisher.getTemperature() + " pressure " + publisher.getPressure());
    }
}
