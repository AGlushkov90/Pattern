package behaivoral.memento;

import java.util.HashMap;
import java.util.Map;

public class History {
    private static final Map<Integer, Memento> historyGame = new HashMap<>();

    public static void save(Memento memento) {
        historyGame.put(memento.getVersion(), memento);
    }

    public static Memento get(int version) {
        return historyGame.get(version);
    }
}
