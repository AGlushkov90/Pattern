package behaivoral.memento;

public class Memento {
    private final int lvl;
    private final int time;
    private final int version;

    public Memento(int lvl, int time, int version) {
        this.lvl = lvl;
        this.time = time;
        this.version = version;
    }

    public int getLvl() {
        return lvl;
    }

    public int getTime() {
        return time;
    }

    public int getVersion() {
        return version;
    }
}
