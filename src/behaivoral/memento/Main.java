package behaivoral.memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(1, 300);
        History.save(game.save(1));
        System.out.println(game);
        game.setLvl(5);
        game.setTime(5000);
        System.out.println("Second save");
        History.save(game.save(2));
        System.out.println(game);
        System.out.println("Load");
        game.load(History.get(1));
        System.out.println(game);
    }
}
