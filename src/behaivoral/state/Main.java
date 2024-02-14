package behaivoral.state;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStation(new DFM());
        radio.play();
        for (int i = 0; i < 10; i++) {
            radio.nextStation();
            radio.play();
        }
    }
}
