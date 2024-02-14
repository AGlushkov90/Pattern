package behaivoral.mediator;

public class Guest extends User {
    public Guest(String name, Chat chat) {
        super(name, chat);
    }

    @Override
    protected void getMessage(String message) {
        System.out.println("Гость " + name + " получил сообщение: " + message);
    }
}
