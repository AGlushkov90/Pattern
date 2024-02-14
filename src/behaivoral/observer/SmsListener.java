package behaivoral.observer;

public class SmsListener implements Listener<WeatherStation> {

    @Override
    public void handleMessage(WeatherStation publisher) {
        System.out.println("SMS: temperature " + publisher.getTemperature() + " pressure " + publisher.getPressure());
    }
}
