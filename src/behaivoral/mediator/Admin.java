package behaivoral.mediator;

public class Admin extends User {
    public Admin(String name, Chat chat) {
        super(name, chat);
    }

    @Override
    protected void getMessage(String message) {
        System.out.println("Администратор " + name + " получил сообщение: " + message);
    }
}
