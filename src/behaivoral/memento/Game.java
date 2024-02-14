package behaivoral.memento;

public class Game {
    private int lvl;
    private int time;

    public Game(int lvl, int time) {
        this.lvl = lvl;
        this.time = time;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void load(Memento memento) {
        this.lvl = memento.getLvl();
        this.time = memento.getTime();
    }

    public Memento save(int version) {
        return new Memento(lvl, time, version);
    }

    @Override
    public String toString() {
        return "Game{" +
                "lvl=" + lvl +
                ", time=" + time +
                '}';
    }
}
