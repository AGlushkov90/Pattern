package behaivoral.state;

public class Radio {
    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void play() {
        if (station != null) {
            station.play();
        }
    }

    public void nextStation() {
        if (station instanceof DFM) {
            setStation(new HumorFM());
        } else if (station instanceof HumorFM) {
            setStation(new OurRadio());
        } else if (station instanceof OurRadio) {
            setStation(new DFM());
        }
    }
}
