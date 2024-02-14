package structural.composite;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        team.add(new Doctor());

        Team team2 = new Team();
        team2.add(team);
        team2.add(new Journalist());
        team2.add(new Writer());
        team2.write();
    }
}
