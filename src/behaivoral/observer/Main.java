package behaivoral.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(10, 720);
        Listener<WeatherStation> smsListener = new SmsListener();
        weatherStation.add(smsListener);
        weatherStation.add(new ConsoleListener());
        weatherStation.notifyListener();
        weatherStation.remove(smsListener);
        weatherStation.setMeasurements(67, 4560);
    }
}
